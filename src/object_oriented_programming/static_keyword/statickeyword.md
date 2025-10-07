# statickeyword.md

# Overview

The `static` keyword in Java marks members (fields, methods, nested classes) that belong to the class itself rather than to any particular instance. A static member is shared across all instances of the class and is loaded and resolved when the class is loaded by the JVM.

# Why it exists

- Share data or behavior that is common to all instances (constants, counters).
- Provide utility methods that don't depend on instance state (e.g., `Math` methods).
- Control initialization timing via static initializers.

# Syntax & basic examples

```java
public class Counter {
    // static field (class variable)
    private static int count = 0;

    // static method (class method)
    public static int getCount() { return count; }

    public Counter() { count++; }
}
```

Access:

```java
Counter c1 = new Counter();
Counter c2 = new Counter();
int total = Counter.getCount(); // 2
```

# Static members

- static fields: one copy per class loader, stored in the class area (implementation-dependent: PermGen in old JVMs, Metaspace in newer ones).
- static methods: can be called without an instance and cannot directly access non-static (instance) members.
- static blocks: executed once when the class is initialized.
- static nested class: nested type declared static; behaves like a top-level class but scoped inside the outer class.

Example of static block and nested class:

```java
public class Config {
    public static final String ENV;

    static {
        ENV = System.getenv("APP_ENV");
        if (ENV == null) ENV = "dev";
        // runs once when Config is initialized
    }

    public static class Builder {
        // static nested; no reference to outer instance
    }
}
```

# Initialization order (important)

1. Parent class static fields and static initializers (in textual order).
2. Child class static fields and static initializers.
3. Instance fields and instance initializers (for object creation), then constructor.

Note: Class initialization happens when the JVM first actively uses the class (e.g. first reference to a static member or creation of an instance) as specified by the JVM specification.

# Memory & classloading nuances

- static state is tied to the Class object in the JVM. If a class is loaded by multiple class loaders, each loader gets its own copy of static fields.
- For web apps and long-running containers, leftover static references can cause classloader leaks (preventing redeploy/unload).

# Thread-safety considerations

- static mutable fields are global state: access must be synchronized or use concurrent primitives (AtomicInteger, volatile, synchronized blocks, or higher-level concurrency classes).
- marking a field `volatile` ensures visibility but not atomic compound operations (e.g., increment). Use `AtomicInteger` for counters.

Bad example (race condition):

```java
public class BadCounter {
    public static int count = 0;
    public static void inc() { count++; } // not thread-safe
}
```

Better:

```java
public class GoodCounter {
    public static final AtomicInteger count = new AtomicInteger(0);
    public static void inc() { count.incrementAndGet(); }
}
```

# Static import

`import static` lets you import static members so you can reference them without qualification.

```java
import static java.lang.Math.*;

double r = sqrt(PI);
```

Use sparingly; overuse can harm readability.

# Common pitfalls

- Overusing static mutable state leads to hidden coupling and hard-to-test code.
- Static initialization with heavy work (I/O, network) can slow class loading and make failures happen at class-init time (NoClassDefFoundError or ExceptionInInitializerError).
- Relying on static for singletons: classical singleton patterns using static fields are simple but be careful with serialization, reflection, and classloading (use enum singletons when possible).

# Best practices

- Prefer immutable static final constants for true constants (naming: ALL_CAPS).
- Avoid broad use of static for mutable state; prefer dependency injection for shared services.
- If global mutable state is needed, encapsulate it and provide thread-safe APIs.
- Keep static initializers simple; fail fast but avoid network or long I/O in static blocks.
- Consider using enums for singletons to ensure serialization safety and resistance to reflection attacks.

# Interview-style quick questions (with short answers)

1. Q: Can a static method access instance variables?  
   A: No, unless given an instance reference.

2. Q: Can you override a static method?  
   A: No — static methods are hidden, not overridden. The method resolved at compile time by reference type.

3. Q: When is a class initialized?  
   A: On first active use: creating an instance, referencing a static field/method, or via reflection that triggers initialization.

4. Q: Difference between static nested class and inner (non-static) class?  
   A: Static nested class has no implicit reference to outer instance; inner class does.

5. Q: Where are static fields stored?  
   A: In the class area managed by the JVM (historically PermGen, now Metaspace); logically they belong to the Class object.

# Short advanced topics

- Reflection: you can access static fields/methods via reflection (Field/Method on Class). Access modifiers still apply unless suppressed.
- Serialization: static fields are not serialized as part of instance state. If static state must be persisted, handle explicitly.
- Class unloading: a class (and its static fields) can be unloaded only when its classloader becomes unreachable.

# Summary

The `static` keyword is essential for class-level data and utility behavior. Use it for constants, utilities, and nested types that do not require instances. Avoid using it for mutable global state unless you deliberately manage concurrency and lifecycle. Keep static initialization lightweight and prefer dependency injection and immutable designs for maintainability.

# Minimal checklist

- Use static final for constants.
- Avoid mutable static state; if used, make it thread-safe.
- Prefer enums for singletons.
- Watch classloader and memory leak issues in containers.

---

If you want, I can also produce a compact cheat-sheet (one-page) or an annotated code example demonstrating initialization order and visibility across classloaders.

