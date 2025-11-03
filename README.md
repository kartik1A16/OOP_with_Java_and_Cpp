# Object-Oriented Programming with Java and C++

This folder contains examples and implementations of Object-Oriented Programming (OOP) concepts using Java and C++. Below is a detailed description of the files and the concepts demonstrated in each.

## Files and Concepts

### [Student.java](./Student.java)
**Concepts Covered:**
- **Encapsulation:**
  - Private data members (`name`, `rollNo`, `marks`) ensure data hiding.
  - Public getter and setter methods provide controlled access to private data.
- **Abstraction:**
  - The `display()` method abstracts the internal details and provides a simple interface to display student details.

**Description:**
This program demonstrates encapsulation and abstraction by creating a `Student` class with private attributes and public methods to access and modify them. The `display()` method is used to print the student details.

---

### [hierarchy.java](./hierarchy.java)
**Concepts Covered:**
- **Inheritance:**
  - Single inheritance: `Employee` extends `Person`.
  - Multilevel inheritance: `Manager` extends `Employee`.
- **Constructor Chaining:**
  - Use of `super` to call parent class constructors.
- **super Keyword:**
  - Accessing parent class methods and constructors.

**Description:**
This program demonstrates single and multilevel inheritance by creating a class hierarchy:
- `Person` class with attributes `name` and `age`.
- `Employee` class extending `Person` with additional attributes `empID` and `salary`.
- `Manager` class extending `Employee` with an additional attribute `department`.

The `main` method creates a `Manager` object and displays all details using constructor chaining and the `super` keyword.

---

### [Mythread_B1.java](./Mythread_B1.java)
**Concepts Covered:**
- **Multithreading:**
  - Creating and managing threads.
- **Thread Lifecycle:**
  - Demonstrating thread states and execution.

**Description:**
This program demonstrates multithreading in Java. It includes examples of creating threads, managing their lifecycle, and understanding thread states. The program highlights how to use the `Thread` class and the `Runnable` interface to implement multithreading.

---

### [Mythread_A1.java](./Mythread_A1.java)
**Concepts Covered:**
- **Multithreading:**
  - Creating threads via `Thread` or `Runnable`.
  - Using `sleep()` and `join()` to coordinate threads.

**Description:**
An example that demonstrates basic thread creation and lifecycle management in Java. Useful for showing how multiple threads can run concurrently.

---

### [Mythread_A2.java](./Mythread_A2.java)
**Concepts Covered:**
- **Multithreading:**
  - Synchronization basics and race conditions.

**Description:**
An example that demonstrates synchronization between threads and highlights potential race conditions when shared resources are not protected.

---

### [Polymorphism.java](./Polymorphism.java)
**Concepts Covered:**
- **Polymorphism:**
  - Method Overloading.
  - Method Overriding and dynamic dispatch.

**Description:**
This program demonstrates polymorphism in Java by showing both compile-time (method overloading) and runtime (method overriding) polymorphism.

---

### [Exception.java](./Exception.java)
**Concepts Covered:**
- **Exception Handling:**
  - Checked and unchecked exceptions.
  - try-catch-finally blocks and custom exceptions.

**Description:**
Demonstrates how Java handles exceptions, how to throw and catch exceptions, and best practices for error handling.

---

## C++ Files

### [Student.cpp](./Student.cpp)
**Concepts Covered:**
- **Encapsulation:**
  - Private data members and public methods.
- **Abstraction:**
  - Abstracting internal details using methods.

**Description:**
This program demonstrates encapsulation and abstraction in C++ by creating a `Student` class with private attributes and public methods to access and modify them.

---

### [Person.cpp](./Person.cpp)
**Concepts Covered:**
- **Inheritance:**
  - Single inheritance.

**Description:**
This program demonstrates single inheritance in C++ by creating a `Person` class and a derived class that extends its functionality.

---

### [Employee.cpp](./Employee.cpp)
**Concepts Covered:**
- **Inheritance:**
  - Multilevel inheritance.

**Description:**
This program demonstrates multilevel inheritance in C++ by creating a class hierarchy and showcasing constructor chaining.

---

### [BankAccount.cpp](./BankAccount.cpp)
**Concepts Covered:**
- **Encapsulation:**
  - Private data members and public methods.
- **Abstraction:**
  - Abstracting internal details using methods.

**Description:**
This program demonstrates encapsulation and abstraction in C++ by creating a `BankAccount` class with private attributes and public methods to access and modify them.

---

### [Exception_Handling.cpp](./Exception_Handling.cpp)
**Concepts Covered:**
- **Exception Handling:**
  - Try-catch blocks.
  - Throwing and catching exceptions.

**Description:**
This program demonstrates exception handling in C++. It includes examples of handling runtime errors using try-catch blocks and throwing custom exceptions.

---

### [File_Handling.cpp](./File_Handling.cpp)
**Concepts Covered:**
- **File Handling:**
  - Reading from and writing to files.

**Description:**
This program demonstrates file handling in C++. It includes examples of reading from and writing to files using file streams.

---

### [Area.cpp](./Area.cpp)
**Concepts Covered:**
- **Polymorphism:**
  - Function Overloading.

**Description:**
This program demonstrates polymorphism in C++ by implementing function overloading to calculate the area of different shapes.

---

## How to Run
### Java Files
1. Open the terminal in the folder containing the files.
2. Compile the Java files using the `javac` command. For example:
   ```powershell
   javac Student.java hierarchy.java Polymorphism.java Exception.java Mythread_A1.java Mythread_A2.java Mythread_B1.java
   ```
3. Run the compiled classes using the `java` command. For example:
   ```powershell
   java hierarchy
   ```

### C++ Files
1. Open the terminal in the folder containing the files.
2. Compile the C++ files using the `g++` command. For example:
   ```powershell
   g++ Student.cpp -o Student.exe
   ```
3. Run the compiled executables. For example:
   ```powershell
   .\Student.exe
   ```

## Additional Notes
- Ensure that Java and a C++ compiler (like GCC) are installed and properly configured on your system.
- The examples are designed to be simple and focus on demonstrating OOP concepts.

## Theory — Java

Object-Oriented Programming (OOP) in Java centers around four main pillars:

- Encapsulation: Packing data (fields) and methods that operate on the data into classes and restricting direct access using access modifiers (`private`, `protected`, `public`). Use getters/setters to control access.
- Inheritance: Creating new classes from existing ones to reuse code (`extends`) and form class hierarchies.
- Polymorphism: Ability to call the same method on different objects and get behavior specific to the object's runtime type (method overriding). Also method overloading is compile-time polymorphism.
- Abstraction: Hiding complex implementation details and exposing simple interfaces (abstract classes, interfaces, and public methods).

Additional Java points in this folder:

- Exception handling: use `try-catch-finally` and custom exceptions to handle errors gracefully.
- Multithreading: create concurrent programs with `Thread` and `Runnable`, synchronize access to shared resources to prevent race conditions.

## Theory — C++

C++ supports OOP as well and has its own idioms and features:

- Encapsulation: achieve with `private`/`protected`/`public` sections inside classes and use member functions to interact with private data.
- Inheritance: single, multiple, and multilevel inheritance are available; use constructors and initializer lists for proper construction.
- Polymorphism: virtual functions and pointers/references enable runtime polymorphism. Function overloading provides compile-time polymorphism.
- Abstraction: abstract base classes (pure virtual functions) define interfaces.

Additional C++ points in this folder:

- Exception handling: `try`, `catch` and `throw` exist in C++ but are used less pervasively; prefer RAII for resource management.
- File handling: use file streams (`std::ifstream`, `std::ofstream`) for I/O operations.
- Memory and resource management: be mindful of ownership; prefer smart pointers (`std::unique_ptr`, `std::shared_ptr`) in modern C++.

Feel free to explore and modify the code to deepen your understanding of OOP principles!