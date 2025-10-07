# Java Collections Utility Class (`java.util.Collections`)

The **`Collections`** class in Java is a **utility/helper class** that contains **static methods** to operate on or return collections.  
It is part of the `java.util` package and should not be confused with the **`Collection` interface**.

---

## 📌 Key Points
- Contains only **static methods**.
- Provides algorithms like **sorting, searching, reversing, shuffling, finding min/max**.
- Provides **thread-safety** wrappers for collections.
- Provides **read-only/unmodifiable** wrappers.
- Works with any implementation of `List`, `Set`, and `Map`.

---

## 🔹 Commonly Used Methods

### 1. Sorting
```java
Collections.sort(list);
Collections.sort(list, comparator);
```
- Sorts the list in **natural order** or by a **custom comparator**.

Example:
```java
List<String> list = Arrays.asList("Java", "Python", "C++");
Collections.sort(list); 
// Output: [C++, Java, Python]
```

---

### 2. Binary Search
```java
int index = Collections.binarySearch(list, key);
int index = Collections.binarySearch(list, key, comparator);
```
- Performs **binary search** on a sorted list.  
- Returns the **index of the element**, or **negative value if not found**.

---

### 3. Reverse
```java
Collections.reverse(list);
```
- Reverses the order of elements.

---

### 4. Shuffle
```java
Collections.shuffle(list);
```
- Randomly shuffles the elements.

---

### 5. Min and Max
```java
E min = Collections.min(collection);
E max = Collections.max(collection);
E min = Collections.min(collection, comparator);
E max = Collections.max(collection, comparator);
```
- Returns **minimum** or **maximum** element (natural order or using comparator).

---

### 6. Frequency
```java
int freq = Collections.frequency(collection, element);
```
- Returns the number of times the element appears.

---

### 7. Disjoint
```java
boolean result = Collections.disjoint(collection1, collection2);
```
- Returns `true` if two collections have **no elements in common**.

---

### 8. Copy
```java
Collections.copy(destList, sourceList);
```
- Copies all elements from source to destination.  
⚠️ `destList` must be **at least the same size** as `sourceList`.

---

### 9. Fill
```java
Collections.fill(list, obj);
```
- Replaces all elements with the given object.

---

### 10. Replace All
```java
boolean replaced = Collections.replaceAll(list, oldVal, newVal);
```
- Replaces all occurrences of `oldVal` with `newVal`.

---

### 11. N Copies
```java
List<T> list = Collections.nCopies(count, element);
```
- Returns an **immutable list** with multiple copies of the same element.

---

### 12. Unmodifiable Collections
```java
List<String> readOnly = Collections.unmodifiableList(list);
Set<String> readOnlySet = Collections.unmodifiableSet(set);
Map<Integer, String> readOnlyMap = Collections.unmodifiableMap(map);
```
- Returns a **read-only view** of a collection.  
- Any modification attempt throws `UnsupportedOperationException`.

---

### 13. Synchronized Collections
```java
List<String> syncList = Collections.synchronizedList(new ArrayList<>());
Set<String> syncSet = Collections.synchronizedSet(new HashSet<>());
Map<Integer, String> syncMap = Collections.synchronizedMap(new HashMap<>());
```
- Provides **thread-safe versions** of collections.

---

## ✅ Summary
- **`Collection`** → Interface (root of collection hierarchy).  
- **`Collections`** → Utility class with static methods.  
- Useful for **sorting, searching, synchronizing, and creating read-only collections**.

