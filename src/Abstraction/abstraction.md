# Java Abstraction Notes

## 🔍 What is Abstraction?

Abstraction is one of the fundamental OOP (Object-Oriented Programming) principles in Java. It is the process of hiding internal implementation details and showing only the essential features of an object.

> "Abstraction lets you focus on what an object does instead of how it does it."

---

## ✅ Why Use Abstraction?

- To reduce complexity
- To increase reusability
- To improve maintainability
- To focus on interface rather than implementation

---

## 🧱 Two Ways to Achieve Abstraction in Java

1. **Abstract Class**
2. **Interface**

---

## 1️⃣ Abstract Class

- Declared using the `abstract` keyword.
- Can have **abstract methods** (without body) and **concrete methods** (with body).
- Cannot be instantiated.
- Can have constructors and fields.

### 🔹 Example:

```java
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```

### 🔹 Key Points:

- Use abstract classes when classes share a common base.
- Allows partial abstraction.

---

## 2️⃣ Interface

- Introduced with `interface` keyword.
- All methods are **abstract by default** (except default, static, private).
- Cannot have constructors or instance variables.
- Supports **multiple inheritance**.

### 🔹 Example:

```java
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying");
    }
}
```

### 🔹 Java 8+ Features in Interface:

- `default` methods: Methods with implementation.
- `static` methods: Utility methods.
- `private` methods (Java 9+): Internal helper methods.

### 🔹 Interface Example with default/static:

```java
interface SmartDevice {
    void connect();

    default void restart() {
        System.out.println("Restarting device...");
    }

    static void info() {
        System.out.println("All devices should implement connect");
    }
}
```

---

## 🔄 Abstract Class vs Interface

| Feature          | Abstract Class      | Interface                           |
| ---------------- | ------------------- | ----------------------------------- |
| Methods          | Abstract + Concrete | Only abstract (with default/static) |
| Constructors     | Yes                 | No                                  |
| Variables        | Any type            | Only `public static final`          |
| Inheritance      | Single              | Multiple                            |
| Access Modifiers | Any                 | All methods are `public abstract`   |
| When to Use      | Base class          | Capability                          |

---

## 🎯 Real-World Example

### Abstract Class:

```java
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }
}
```

### Interface:

```java
interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing guitar");
    }
}
```

---

## 🧠 Interview Tips

- Abstract class = "is-a"
- Interface = "can-do"
- Use interface for capabilities and abstract class for base structure.

---

## ✅ Summary

- Abstraction hides details, shows essentials.
- Achieved via abstract class or interface.
- Abstract class allows partial abstraction; interface allows full abstraction.
- Use both appropriately based on design needs.

