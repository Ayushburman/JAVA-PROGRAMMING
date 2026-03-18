# JAVA · PROGRAMMING

> A structured reference guide for learning Java — from fundamentals to object-oriented design.

```
Language   : Java SE 17+
Type       : General Purpose, Object-Oriented
Runs On    : JVM (Write Once, Run Anywhere)
```

---

## § Table of Contents

```
01  Introduction & Architecture
02  Syntax & Hello World
03  Variables
04  Literals
05  Data Types
06  Operators
07  Input / Output
08  Expressions, Statements & Blocks
09  Comments
10  Flow Control
11  Switch Statement
12  Loops
13  Break & Continue
14  Arrays
15  OOP — Classes & Objects
16  Methods
17  Constructors
18  Strings
19  Access Modifiers
20  Recursion
21  Inheritance & Abstract Classes
22  Interfaces
23  Polymorphism
```

---

## 01 · Introduction & Architecture

Java is a general-purpose, class-based, strongly-typed programming language.  
It powers desktop applications, mobile apps (Android), web backends, big data pipelines, and embedded systems.

**Core Characteristics**

| Property            | Description                                                  |
|---------------------|--------------------------------------------------------------|
| Platform Independent | Compiled to bytecode; runs on any JVM regardless of OS      |
| Object-Oriented     | Models programs as interacting objects                       |
| Strongly Typed      | All variables must be declared with a type                   |
| Automatic Memory    | Garbage collector manages heap allocation                    |
| Speed               | Near C++ performance with JIT compilation                    |

### JVM · JRE · JDK

```
JDK  (Java Development Kit)
 └─  JRE  (Java Runtime Environment)
      └─  JVM  (Java Virtual Machine)
           └─  Class Libraries
      └─  Compiler, Debugger, Tools
```

**Execution Pipeline**

```
.java source  →  javac compiler  →  .class bytecode  →  JVM  →  Native Machine Code  →  Output
```

- **JVM** — Translates bytecode to platform-native instructions at runtime via JIT.
- **JRE** — Contains the JVM + standard class libraries. Required to *run* Java programs.
- **JDK** — Full development kit (JRE + compiler + debugger). Required to *write* Java programs.

---

## 02 · Syntax & Hello World

```java
// HelloWorld.java

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Output**

```
Hello, World!
```

**Breakdown**

| Token                        | Role                                                                      |
|------------------------------|---------------------------------------------------------------------------|
| `// comment`                 | Single-line comment — ignored by the compiler                             |
| `class HelloWorld`           | Every Java program lives inside a class                                   |
| `public`                     | Access modifier — entry point must be visible to the JVM                  |
| `static`                     | Method belongs to the class, not an instance                              |
| `void`                       | Return type — `main` returns nothing                                      |
| `main`                       | Reserved entry point — JVM starts execution here                          |
| `String[] args`              | Command-line arguments passed as a string array                           |
| `System.out.println(...)`    | Prints to stdout, appends newline                                         |

---

## 03 · Variables

A variable is a named memory location that holds a value of a specific type.

```java
int age = 25;        // type  identifier  value
```

**Naming Rules**

```
[✓]  age        // lowercase, descriptive — preferred
[✓]  _count     // underscore prefix — valid, discouraged
[✓]  $price     // dollar prefix — valid, discouraged
[✗]  1value     // cannot start with a digit
[✗]  my value   // no whitespace
[!]  Age ≠ age  // Java is case-sensitive
```

**Variable Scope Types**

| Type             | Declared                              | Access                    |
|------------------|---------------------------------------|---------------------------|
| Local            | Inside a method body                  | Within that method only   |
| Instance         | Inside class, outside methods         | Per-object (non-static)   |
| Static / Class   | With `static` keyword inside class    | Shared across all objects |
| Parameter        | In method signature                   | Within that method only   |

```java
class Counter {
    static int total = 0;        // static variable
    int count;                   // instance variable

    void increment(int amount) { // 'amount' is a parameter
        int step = 1;            // local variable
        count += step * amount;
        total++;
    }
}
```

→ Source: [VARIABLES & LITERALS.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/73668d87dd759660010b1dd97df5da1a875116c4/VARIABLES%20%26%20LITERALS.java)

---

## 04 · Literals

Literals are fixed, hard-coded values written directly in source code.

```java
int    a = 10;      // integer literal
float  b = 3.14f;   // float literal
char   c = 'F';     // character literal
```

**Integer Literals**

```java
int decimal = 42;           // base 10
int octal   = 052;          // base 8  — prefix 0
int hex     = 0x2A;         // base 16 — prefix 0x
int binary  = 0b00101010;   // base 2  — prefix 0b
```

**Boolean Literals**

```java
boolean flag = true;
boolean done = false;
```

**Float Literals**

```java
float  f = 3.14f;       // suffix 'f' required for float
double d = 3.14;        // default floating-point type
double e = 1.5e10;      // scientific notation
```

**Character & String Literals**

```java
char   ch  = 'A';             // single quotes
String str = "Hello, Java";   // double quotes
```

→ Source: [VARIABLES & LITERALS.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/73668d87dd759660010b1dd97df5da1a875116c4/VARIABLES%20%26%20LITERALS.java)

---

## 05 · Data Types

Java has **8 primitive data types** and a rich set of reference types.

### Primitive Types

| Type      | Size     | Range / Notes                              | Default  |
|-----------|----------|--------------------------------------------|----------|
| `boolean` | 1 bit    | `true` / `false`                           | `false`  |
| `byte`    | 8 bits   | -128 to 127                                | `0`      |
| `short`   | 16 bits  | -32,768 to 32,767                          | `0`      |
| `int`     | 32 bits  | -2³¹ to 2³¹-1                             | `0`      |
| `long`    | 64 bits  | -2⁶³ to 2⁶³-1 — suffix `L`               | `0L`     |
| `float`   | 32 bits  | Single-precision IEEE 754 — suffix `f`     | `0.0f`   |
| `double`  | 64 bits  | Double-precision IEEE 754                  | `0.0d`   |
| `char`    | 16 bits  | Unicode `\u0000` to `\uffff`               | `\u0000` |

```java
byte   b = 100;
short  s = 30000;
int    i = 2_000_000;       // underscores improve readability
long   l = 9_000_000_000L;
float  f = 3.14f;
double d = 3.141592653589;
char   c = '\u0041';        // prints 'A'
boolean flag = true;
```

> **Note:** Use `double` over `float` for precision. Never use floating-point types for currency — use `BigDecimal`.

→ Source: [DATA TYPES](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/e17be1a85679a1bdaa0c939bb4a64034f101d8ed/DATA%20TYPES)

---

## 06 · Operators

### Arithmetic

| Operator | Operation      |
|----------|----------------|
| `+`      | Addition       |
| `-`      | Subtraction    |
| `*`      | Multiplication |
| `/`      | Division       |
| `%`      | Modulo         |

### Assignment

| Operator | Equivalent     |
|----------|----------------|
| `=`      | Assign         |
| `+=`     | Add & assign   |
| `-=`     | Sub & assign   |
| `*=`     | Mul & assign   |
| `/=`     | Div & assign   |
| `%=`     | Mod & assign   |

### Relational

| Operator | Meaning               |
|----------|-----------------------|
| `==`     | Equal to              |
| `!=`     | Not equal to          |
| `>`      | Greater than          |
| `<`      | Less than             |
| `>=`     | Greater than or equal |
| `<=`     | Less than or equal    |

### Logical

| Operator | Meaning |
|----------|---------|
| `&&`     | AND     |
| `\|\|`   | OR      |
| `!`      | NOT     |

### Unary

| Operator | Meaning             |
|----------|---------------------|
| `+`      | Unary plus          |
| `-`      | Unary minus         |
| `++`     | Pre/post increment  |
| `--`     | Pre/post decrement  |
| `!`      | Logical complement  |

### Bitwise

| Operator | Meaning              |
|----------|----------------------|
| `&`      | Bitwise AND          |
| `\|`     | Bitwise OR           |
| `^`      | Bitwise XOR          |
| `~`      | Bitwise complement   |
| `<<`     | Left shift           |
| `>>`     | Right shift          |
| `>>>`    | Unsigned right shift |

### Special Operators

**Ternary (conditional shorthand)**
```java
int days = 2024;
String year = (days % 4 == 0) ? "Leap year" : "Not a leap year";
```

**instanceof**
```java
String name = "Java";
boolean result = name instanceof String;  // true
```

→ Source: [OPERATORS](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f1e4315bdc6513efbf77f513434aeacdf6904624/OPERATORS)

---

## 07 · Input / Output

### Output Methods

| Method              | Behavior                                         |
|---------------------|--------------------------------------------------|
| `System.out.print`  | Prints without trailing newline                  |
| `System.out.println`| Prints, then moves cursor to next line           |
| `System.out.printf` | Formatted output (C-style format specifiers)     |

```java
System.out.println("Line 1");
System.out.print("A");
System.out.print("B");           // outputs: AB (same line)
System.out.printf("Pi = %.2f%n", 3.14159);  // Pi = 3.14
```

### Input via Scanner

```java
import java.util.Scanner;

class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, " + name + ". Age: " + age);
        sc.close();
    }
}
```

**Common Scanner Methods**

| Method          | Reads             |
|-----------------|-------------------|
| `nextInt()`     | Integer           |
| `nextDouble()`  | Double            |
| `next()`        | Single word       |
| `nextLine()`    | Full line         |
| `nextBoolean()` | Boolean           |

→ Source: [INPUT OUTPUT](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f9600f8e4849baeaf3ed958f5ba6032147aaca3a/INPUT%20OUTPUT)

---

## 08 · Expressions, Statements & Blocks

```java
// Expression — a combination of values, variables, operators
marks = 90

// Statement — a complete executable unit (terminated with ;)
int marks = 90;

// Block — zero or more statements enclosed in braces
if (condition) {
    int x = 10;   // statement inside a block
    x++;
}
```

---

## 09 · Comments

```java
// Single-line comment

/*
   Multi-line comment
   Spans multiple lines
*/

/**
 * Javadoc comment
 * Used to generate API documentation
 * @param args command-line arguments
 */
public static void main(String[] args) { }
```

> Comments are stripped at compile time — they have zero effect on bytecode.

---

## 10 · Flow Control

### `if`

```java
if (condition) {
    // executes if condition is true
}
```

### `if...else`

```java
if (number > 0) {
    System.out.println("Positive");
} else {
    System.out.println("Non-positive");
}
```

### `if...else if...else`

```java
if (score >= 90)       grade = "A";
else if (score >= 80)  grade = "B";
else if (score >= 70)  grade = "C";
else                   grade = "F";
```

### Nested `if`

```java
if (n1 >= n2) {
    largest = (n1 >= n3) ? n1 : n3;
} else {
    largest = (n2 >= n3) ? n2 : n3;
}
```

→ Source: [FLOW\_CONTROL.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f94b4dcfcffa9630ab86be5bc62fc767e26f7ee9/FLOW_CONTROL.java)

---

## 11 · Switch Statement

Executes one branch from multiple alternatives based on a matched value.

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // fallback if no case matches
}
```

```java
int day = 3;
String name;

switch (day) {
    case 1:  name = "Monday";    break;
    case 2:  name = "Tuesday";   break;
    case 3:  name = "Wednesday"; break;
    default: name = "Unknown";
}
// name → "Wednesday"
```

> **Java 14+** supports switch expressions with arrow syntax:
> ```java
> String name = switch (day) {
>     case 1 -> "Monday";
>     case 2 -> "Tuesday";
>     default -> "Unknown";
> };
> ```

→ Source: [SWITCH.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/a09732a8128d1dcc1d1d7335b3306978e52fb926/SWITCH.java)

---

## 12 · Loops

### `for` — known iteration count

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### `while` — condition-driven

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### `do...while` — executes body at least once

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### Enhanced `for` (for-each) — iterating collections/arrays

```java
int[] nums = {10, 20, 30};
for (int n : nums) {
    System.out.println(n);
}
```

→ Source: [LOOPS.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/a31ed35cca924bccaa4bd4981324b0e89632293b/LOOPS.java)

---

## 13 · Break & Continue

### `break` — exits the loop immediately

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) break;
    System.out.println(i);   // prints 1 2 3 4
}
```

### `continue` — skips current iteration

```java
for (int i = 1; i <= 10; i++) {
    if (i > 4 && i < 9) continue;
    System.out.println(i);   // prints 1 2 3 4 9 10
}
```

→ Sources: [BREAK.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/681f7e3d5388fda8abc56180c0289e4196ae1825/BREAK.java) · [CONTINUE.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/50bdc1bd0203ac07913c733313e3f5ad354a5445/CONTINUE.java)

---

## 14 · Arrays

A fixed-size, ordered collection of elements of the same type.

```java
// Declaration and initialization
int[] scores = {95, 87, 73, 61, 45};

// Access by index (zero-based)
System.out.println(scores[0]);  // 95
System.out.println(scores.length);  // 5
```

**Index Diagram**

```
Index :  [0]  [1]  [2]  [3]  [4]
Value :   95   87   73   61   45
```

### 2D Array (Matrix)

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

System.out.println(matrix[1][2]);  // 6
```

```
     C0   C1   C2
R0 [  1    2    3 ]
R1 [  4    5    6 ]
R2 [  7    8    9 ]
```

### 3D Array

```java
int[][][] cube = new int[3][3][3];
// Access: cube[layer][row][col]
```

---

## 15 · OOP — Classes & Objects

### Class

A class is a blueprint that defines the structure and behavior of objects.

```java
class Bicycle {
    // Fields (state)
    private int gear;
    private double speed;

    // Methods (behavior)
    public void shiftGear(int newGear) {
        this.gear = newGear;
    }

    public void accelerate(double amount) {
        this.speed += amount;
    }

    public String getStatus() {
        return "Gear: " + gear + " | Speed: " + speed + " km/h";
    }
}
```

### Object

An object is a specific instance of a class.

```java
Bicycle roadBike    = new Bicycle();
Bicycle mountainBike = new Bicycle();

roadBike.shiftGear(5);
roadBike.accelerate(30.0);
System.out.println(roadBike.getStatus());
// Gear: 5 | Speed: 30.0 km/h
```

```
Class  →  Blueprint / Template
Object →  Runtime instance of a class
```

→ Sources: [CLASS.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/62e3680970bd5d85910174b199fb4aaf6536c818/CLASS.java) · [OBJECTS.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/62e3680970bd5d85910174b199fb4aaf6536c818/OBJECTS.java)

---

## 16 · Methods

A method is a reusable, named block of code that performs a specific task.

```java
returnType methodName(paramType param1, ...) {
    // body
    return value;  // omit if returnType is void
}
```

```java
class MathUtils {

    // Instance method
    public int add(int a, int b) {
        return a + b;
    }

    // Static method — no object needed
    public static int square(int n) {
        return n * n;
    }

    // Method overloading — same name, different signature
    public double add(double a, double b) {
        return a + b;
    }
}

// Usage
MathUtils m = new MathUtils();
System.out.println(m.add(10, 20));         // 30
System.out.println(MathUtils.square(5));   // 25
System.out.println(m.add(1.5, 2.5));       // 4.0
```

→ Source: [METHODS.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f7c5e448a4a78d7aa910aac68102b03bc4fa9a1d/METHODS.java)

---

## 17 · Constructors

A constructor initializes a new object. It has the same name as the class and no return type.

### No-Arg Constructor

```java
class Config {
    String mode;

    Config() {
        mode = "default";
    }
}
```

### Parameterized Constructor

```java
class Server {
    String host;
    int port;

    Server(String host, int port) {
        this.host = host;
        this.port = port;
    }
}

Server s = new Server("localhost", 8080);
```

### Default Constructor

If no constructor is defined, the compiler generates one automatically that sets all fields to their default values (`0`, `false`, `null`).

### Constructor Chaining

```java
class Point {
    int x, y, z;

    Point() { this(0, 0, 0); }             // calls 3-arg constructor

    Point(int x, int y) { this(x, y, 0); } // calls 3-arg constructor

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
```

→ Source: [CONSTRUCTOR.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/878644bce90696d4e0cc5508f9c6961199baf52b/CONSTRUCTOR.java)

---

## 18 · Strings

Strings in Java are immutable sequences of characters, backed by the `String` class.

```java
String s = "Hello, Java";
```

**Common String Methods**

| Method                    | Description                              |
|---------------------------|------------------------------------------|
| `s.length()`              | Number of characters                     |
| `s.charAt(i)`             | Character at index `i`                   |
| `s.substring(a, b)`       | Substring from index `a` to `b-1`        |
| `s.toUpperCase()`         | All caps                                 |
| `s.toLowerCase()`         | All lowercase                            |
| `s.trim()`                | Remove leading/trailing whitespace        |
| `s.equals(other)`         | Value equality (use instead of `==`)      |
| `s.contains("x")`         | Returns `true` if substring found        |
| `s.replace("a", "b")`     | Replaces occurrences                     |
| `s.split(",")`            | Splits into array on delimiter           |
| `s.concat(other)`         | Appends another string                   |
| `String.valueOf(42)`      | Converts primitive to String             |

```java
String first = "Fantastic";
String second = "Beasts";
String result = first.concat(" " + second);
System.out.println(result);              // Fantastic Beasts
System.out.println(result.length());    // 15
System.out.println(result.toUpperCase()); // FANTASTIC BEASTS
```

> **Performance tip:** For repeated string modification, use `StringBuilder` instead of `String` — it is mutable and avoids creating intermediate objects.

```java
StringBuilder sb = new StringBuilder();
sb.append("Java").append(" is ").append("fast");
System.out.println(sb.toString());  // Java is fast
```

---

## 19 · Access Modifiers

Control the visibility and accessibility of classes, fields, and methods.

| Modifier    | Same Class | Same Package | Subclass | Everywhere |
|-------------|:----------:|:------------:|:--------:|:----------:|
| `private`   | ✓          | ✗            | ✗        | ✗          |
| (default)   | ✓          | ✓            | ✗        | ✗          |
| `protected` | ✓          | ✓            | ✓        | ✗          |
| `public`    | ✓          | ✓            | ✓        | ✓          |

```java
class BankAccount {
    private double balance;       // accessible only within this class

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {  // controlled read access
        return balance;
    }
}
```

> **Encapsulation principle:** Fields should generally be `private`. Expose controlled access through `public` getters/setters.

---

## 20 · Recursion

A method that calls itself to solve a problem by breaking it into smaller sub-problems.

```
recurse(n)
  └─ recurse(n-1)
       └─ recurse(n-2)
            └─ base case → unwinds
```

**Classic Example — Factorial**

```java
static int factorial(int n) {
    if (n == 0) return 1;         // base case
    return n * factorial(n - 1);  // recursive call
}
// factorial(5) → 5 * 4 * 3 * 2 * 1 = 120
```

**Fibonacci**

```java
static int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}
```

> Every recursive function needs a **base case** to prevent infinite recursion (stack overflow).

---

## 21 · Inheritance & Abstract Classes

### Inheritance

Allows a child class to acquire fields and methods of a parent class.

```java
class Animal {
    String name;

    void eat() {
        System.out.println(name + " eats.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " barks.");
    }
}

Dog d = new Dog();
d.name = "Rex";
d.eat();   // Rex eats.
d.bark();  // Rex barks.
```

**Types of Inheritance**

```
Single       :  A → B
Multilevel   :  A → B → C
Hierarchical :  A → B
               A → C
Multiple     :  A, B → C  (via interfaces only in Java)
Hybrid       :  combination of above
```

> Java does **not** support multiple class inheritance. Use interfaces instead.

### Abstract Class

Cannot be instantiated. Used to define a common template for subclasses.

```java
abstract class Shape {
    abstract double area();          // must be implemented by subclass

    void describe() {
        System.out.println("Area: " + area());
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { this.radius = r; }

    @Override
    double area() { return Math.PI * radius * radius; }
}

class Rectangle extends Shape {
    double w, h;
    Rectangle(double w, double h) { this.w = w; this.h = h; }

    @Override
    double area() { return w * h; }
}
```

---

## 22 · Interfaces

A fully abstract contract. All methods are implicitly `public abstract` (unless `default` or `static`).

```java
interface Drawable {
    void draw();                           // abstract
    default void describe() {             // default implementation
        System.out.println("I am drawable.");
    }
}

interface Resizable {
    void resize(double factor);
}

// A class can implement multiple interfaces
class Canvas implements Drawable, Resizable {
    @Override
    public void draw() { System.out.println("Drawing on canvas"); }

    @Override
    public void resize(double factor) { System.out.println("Resized by " + factor); }
}
```

**Interface vs Abstract Class**

| Feature              | Interface              | Abstract Class          |
|----------------------|------------------------|-------------------------|
| Multiple inheritance | Supported              | Not supported           |
| Fields               | `static final` only    | Any type                |
| Constructor          | None                   | Allowed                 |
| Method body          | `default`/`static` only| Any method              |
| Use case             | Define capability      | Shared base behavior    |

---

## 23 · Polymorphism

The ability of a single interface to represent different underlying forms.

### Compile-time (Overloading)

Same method name, different parameters — resolved at compile time.

```java
class Printer {
    void print(int n)    { System.out.println("int: " + n); }
    void print(String s) { System.out.println("str: " + s); }
    void print(int a, int b) { System.out.println("sum: " + (a + b)); }
}
```

### Runtime (Overriding)

Subclass provides its own implementation of a parent method — resolved at runtime via dynamic dispatch.

```java
class Animal   { void sound() { System.out.println("...");  } }
class Dog      extends Animal { @Override void sound() { System.out.println("Woof"); } }
class Cat      extends Animal { @Override void sound() { System.out.println("Meow"); } }

Animal a1 = new Dog();
Animal a2 = new Cat();
a1.sound();   // Woof
a2.sound();   // Meow
```

```
Compile time  →  Method overloading
Runtime       →  Method overriding via dynamic dispatch
```

---

## Reference

| Topic         | Source File                                                                                  |
|---------------|----------------------------------------------------------------------------------------------|
| Introduction  | [01-INTRODUCTION](01-INTRODUCTION)                                                           |
| Variables     | [VARIABLES & LITERALS.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/73668d87dd759660010b1dd97df5da1a875116c4/VARIABLES%20%26%20LITERALS.java) |
| Data Types    | [DATA TYPES](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/e17be1a85679a1bdaa0c939bb4a64034f101d8ed/DATA%20TYPES) |
| Operators     | [OPERATORS](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f1e4315bdc6513efbf77f513434aeacdf6904624/OPERATORS)     |
| I/O           | [INPUT OUTPUT](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f9600f8e4849baeaf3ed958f5ba6032147aaca3a/INPUT%20OUTPUT) |
| Flow Control  | [FLOW\_CONTROL.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f94b4dcfcffa9630ab86be5bc62fc767e26f7ee9/FLOW_CONTROL.java) |
| Switch        | [SWITCH.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/a09732a8128d1dcc1d1d7335b3306978e52fb926/SWITCH.java) |
| Loops         | [LOOPS.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/a31ed35cca924bccaa4bd4981324b0e89632293b/LOOPS.java)   |
| Break         | [BREAK.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/681f7e3d5388fda8abc56180c0289e4196ae1825/BREAK.java)   |
| Continue      | [CONTINUE.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/50bdc1bd0203ac07913c733313e3f5ad354a5445/CONTINUE.java) |
| Class/Objects | [CLASS.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/62e3680970bd5d85910174b199fb4aaf6536c818/CLASS.java) · [OBJECTS.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/62e3680970bd5d85910174b199fb4aaf6536c818/OBJECTS.java) |
| Methods       | [METHODS.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f7c5e448a4a78d7aa910aac68102b03bc4fa9a1d/METHODS.java) |
| Constructor   | [CONSTRUCTOR.java](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/878644bce90696d4e0cc5508f9c6961199baf52b/CONSTRUCTOR.java) |

---

```
JAVA-PROGRAMMING  ·  github.com/Ayushburman
```
