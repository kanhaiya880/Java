# Java String Notes

## 1. What is a String in Java?

A `String` in Java is an object that represents a sequence of characters. Strings are immutable, meaning their value cannot be changed after creation.

```java
String str = "Hello";
```

---

## 2. Ways to Create Strings

### a. Using String Literals (stored in String pool)

```java
String str1 = "Java";
```

### b. Using `new` Keyword (stored in heap)

```java
String str2 = new String("Java");
```

---

## 3. What is String Pool?

The **String Pool** (or **String Intern Pool**) is a special memory region in Java where **String literals** are stored. When you create a string using a literal (e.g., "Hello"), Java checks if that value already exists in the pool:

- If it exists, the reference to the existing string is returned.
- If it doesn't exist, a new string is added to the pool.

This helps **optimize memory** and improve performance.

### Example:

```java
String s1 = "Hello";
String s2 = "Hello";
System.out.println(s1 == s2); // true, both refer to same pool object

String s3 = new String("Hello");
System.out.println(s1 == s3); // false, different memory (heap)
```

You can force a string to be added to the pool using `.intern()`:

```java
String s4 = new String("Hello").intern();
System.out.println(s1 == s4); // true
```

---

## 4. Common String Methods

| Method                  | Description                           |
| ----------------------- | ------------------------------------- |
| `length()`              | Returns the length of the string      |
| `charAt(int index)`     | Returns char at specified index       |
| `substring(start)`      | Returns substring from start to end   |
| `substring(start, end)` | Returns substring between two indices |
| `equals(String s)`      | Compares content (case-sensitive)     |
| `equalsIgnoreCase(s)`   | Ignores case in comparison            |
| `compareTo(String s)`   | Lexicographical comparison            |
| `toLowerCase()`         | Converts to lowercase                 |
| `toUpperCase()`         | Converts to uppercase                 |
| `trim()`                | Removes leading/trailing spaces       |
| `replace(a, b)`         | Replaces character/word               |
| `split(" ")`            | Splits string into array by delimiter |

---

## 5. String Example

```java
public class Main {
    public static void main(String[] args) {
        String name = "Kanhaiya Chaudhari";

        System.out.println("Length: " + name.length());
        System.out.println("UpperCase: " + name.toUpperCase());
        System.out.println("First name: " + name.substring(0, 8));
        System.out.println("Contains 'Chaudhari'? " + name.contains("Chaudhari"));
    }
}
```

---

## 6. String Immutability

- Strings are **immutable**.
- When you modify a string, a **new object** is created.

```java
String s = "Hello";
s = s.concat(" World");
System.out.println(s); // Hello World
```

---

## 7. String Comparison

### `==` vs `equals()` in Java

- `==` checks whether **two references** point to the **same object in memory**.
- `equals()` checks whether **two objects have the same content**.

### Example:

```java
String a = "Hello";
String b = "Hello";
String c = new String("Hello");

System.out.println(a == b);       // true (both refer to the same pool object)
System.out.println(a == c);       // false (c refers to a new object in heap)
System.out.println(a.equals(c));  // true (both have same character content)
```

> ✅ Use `equals()` to compare the actual content of strings. Use `==` only if you want to check whether both references point to the same object.

```java
String a = "Hello";
String b = "Hello";
String c = new String("Hello");

System.out.println(a == b);       // true (same pool reference)
System.out.println(a == c);       // false (different object)
System.out.println(a.equals(c));  // true (same content)
```

---

## 8. How to Check the Address of a String (or Unique Identity)

In Java, you cannot directly get the memory address of a variable like Python's `id()` function. However, you can get a unique identifier for an object using:

### ✅ `System.identityHashCode()`

This returns a hash code that is typically based on the object’s memory address.

```java
String str = "Hello";
System.out.println(System.identityHashCode(str));
```

### Example:

```java
String a = "Java";
String b = new String("Java");

System.out.println(System.identityHashCode(a)); // may be same if reused from pool
System.out.println(System.identityHashCode(b)); // different (heap object)
```

> Note: This is not the actual memory address but a unique identifier that helps track object references.

---

## 9. StringBuilder vs StringBuffer vs String

| Feature       | `String`  | `StringBuilder` | `StringBuffer`       |
| ------------- | --------- | --------------- | -------------------- |
| Mutability    | Immutable | Mutable         | Mutable              |
| Thread-Safety | No        | No              | Yes                  |
| Performance   | Slow      | Fast            | Slower (thread-safe) |

---

## 10. String Concatenation

```java
String first = "Java";
String second = "Programming";
String result = first + " " + second;
System.out.println(result); // Java Programming
```

---

## 11. Format Strings

```java
String name = "Kanhaiya";
int age = 21;
System.out.printf("Name: %s, Age: %d", name, age);
```

---

## 12. Best Practices

- Use `equals()` instead of `==` to compare strings.
- Use `StringBuilder` for heavy string manipulations in loops.
- Avoid `new String("text")` unless necessary.

