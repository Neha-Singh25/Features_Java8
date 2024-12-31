# Exploring Java 8 Features 🚀

This repository contains my exploration and practice files for the features introduced in Java 8. Java 8 brought significant enhancements to the language, making it more powerful and developer-friendly. Here's a summary of the features I've practiced and included in this repository.

## Features Covered 🛠️

### 1. **Changes in Interfaces**
   - **Default Methods**: Allows methods with a body inside interfaces.
   - **Static Methods**: Enables static utility methods in interfaces.

### 2. **Lambda Expressions** ✨
   - Simplified syntax for implementing functional interfaces.
   - Example: `(a, b) -> a + b` for a two-parameter addition operation.

### 3. **Functional Interfaces** ✅
   - Introduced `@FunctionalInterface` annotation.
   - Commonly used interfaces: `Predicate`, `Function`, `Consumer`, `Supplier`.

### 4. **Method and Constructor References** 🏗️
   - Simplifies lambda expressions further by referencing existing methods or constructors.
   - Syntax:
     - `ClassName::staticMethod`
     - `object::instanceMethod`
     - `ClassName::new` (Constructor Reference)

### 5. **Optional Class** 🎯
   - A container object to avoid `NullPointerException`.
   - Methods practiced: `of()`, `ofNullable()`, `isPresent()`, `orElse()`, etc.

### 6. **StringJoiner** 🧵
   - Used to construct a sequence of strings with a defined delimiter, prefix, and suffix.
   - Example: `StringJoiner sj = new StringJoiner(", ", "[", "]");`

### 7. **Date and Time API** 🗓️
   - Replaces the old `java.util.Date` and `Calendar` classes.
   - Classes practiced:
     - `LocalDate`, `LocalTime`, `LocalDateTime`
     - `DateTimeFormatter`
     - `Duration`, `Period`

### 8. **Stream API** 🌊
   - Enables functional-style operations on collections and sequences of elements.
   - Operations practiced:
     - Intermediate: `filter()`, `map()`, `sorted()`
     - Terminal: `collect()`, `forEach()`, `reduce()`

---

## Exploring and Continuing this Journey ✨  
Java 8 is packed with features that transform the way we code. While I’ve covered the basics, there’s always more to learn and discover. This repository will continue to evolve as I dive deeper into advanced topics and refine my skills.  

Stay tuned for more updates, and feel free to explore the code and share your feedback!  

#HappyCoding 🎉



