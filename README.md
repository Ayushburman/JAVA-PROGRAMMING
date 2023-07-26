# **JAVA-PROGRAMMING**
- Java is a powerful general-purpose programming language.
* It is used to develop desktop and mobile applications, big data processing, embedded systems, and so on.
* According to Oracle, the company that owns Java, Java runs on 3 billion devices worldwide, which makes Java one of the most popular programming languages.

* **``Platform independent``** - We can write Java code in one platform (operating system) and run on another platform without any modification.
* **``Object-oriented``** - Java is an object-oriented language. This helps to make our Java code more flexible and reusable.
* **``Speed``** - Well optimized Java code is nearly as fast as lower-level languages like C++ and much faster than Python, PHP, etc.
# **Syntax**
```java
// Your First Program

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}
```
# **Output**
```
Hello, World!
```
## Let's Break it DOWN!
**1.** ``` // Your First Program ```  In Java anything that starting with ```//``` are called **'comments'**,These are basically used for basic understanding and readability and had nothing to do with your code,A compiler ignores **COMMENTS**.<br>
**2.** ``` class HelloWorld { ``` In Java every Program/Application starts with class, ```HelloWorld``` is name of your class<br>
**3.** ```public static void main(String[] args) { ... }``` This is the main method. Every application in Java must contain the main method. The Java compiler starts executing the code from the main method.<br>
```public``` is an access modifier, It is a entry point of java program.<br>
```static``` keyword is used to declare that the main method belongs to the class itself rather than an instance of the class.<br>
```void``` in Java is used as a return type for methods and indicates that the method does not return any value.<br>
 ```main``` method is responsible for executing the program's logic, but it doesn't produce a result that needs to be returned.<br>
 ```String[] args``` It allows you to pass command-line arguments to your Java program when running it.<br>
  ```args```variable is an array of strings that holds the arguments provided when starting the program from the command line.<br>
  ```System.out.println("Hello, World!");```is a print statement. It prints the text```Hello, World!```.<br>
  

## Java JDK, JRE and JVM
**1.** ```JVM (Java Virtual Machine)```🧰is a critical component of the Java Runtime Environment (JRE) that enables Java bytecode to be executed on different platforms.<br>
**WORKING:** When you run the Java program, Java compiler first compiles your Java code to bytecode. Then, the JVM translates bytecode into native machine code (set of instructions that a computer's CPU executes directly)<br>
```JAVA PROGRAM```➡️```JAVA BYTECODE```➡️```MACHINE CODE```➡️```OUTPUT```<br>

**2.** ```What is JRE?```
JRE (Java Runtime Environment) is a software package that provides Java class libraries, Java Virtual Machine (JVM), and other components that are required to run Java applications.<br>
JRE is the superset of JVM.<br>

|            | ```JRE```  |            |
|------------|------------|------------|
| ```JVM```  |   ```+```  |  ```CLASS LIB.``` |

**3.** ```What is JDK?``` (Java Development Kit) is a software development kit required to develop applications in Java. When you download JDK, JRE is also downloaded with it.<br>

```JDK``` ----> ```JRE``` ----> ```JVM``` ```+``` ```CLASS LIB.```---->```compiler```,```debugger``` etc.

 ### More.[INTRODUCTION](01-INTRODUCTION)
 
 ## VARIABLES

### Java Variables
A ```variable``` is a location in memory (storage area) to hold data.
To indicate the storage area, each variable should be given a unique name ```(identifier)```.
```java
int Age = 80;
```
```Age``` is a Variable and ```int``` is a Data Type,```80``` is Value assigned to ```Age```.
```int``` Data type refers to that it can only hold Integer type only
```bash
Rules for Naming Variables in Java:
>1. Java is case sensitive. Hence, `age` and `AGE` are two different variables.
int age = 50;
int age = 10;

System.out.println(age);  // prints 24
System.out.println(AGE);  // prints 25

>2. Variables must start with either a `letter` or an `_underscore` or a `$dollar`.
int age;  // valid name and good practice
int _age;  // valid but it is a bad practice
int $age;  // valid but it is a bad practice

>3. Variable names cannot start with numbers 1,2....
int 1age;  // invalid variables

>4. Variable names cannot use whitespace.
int my age;  // invalid variables
 ```

### There are `4` types of variables in Java programming language:
* Local Variables `A variable declared inside the body of the method is called local variable. `           
* Instance Variables `A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.`
* Class Variables (Static Fields) `A variable that is declared as static is called a static variable.`
* Parameters `A parameter is a variable that is passed to a method when the method is called.`


### More.[VARIABLES](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/73668d87dd759660010b1dd97df5da1a875116c4/VARIABLES%20%26%20LITERALS.java)

## LITERALS
### Java Literals
`Literals` are data used for representing fixed values.
 ```java
int a = 10;
float b = 3.14;
char c = 'F';
```
Here, `10`, `3.14`, and `'F'` are `literals`.<br>
Types of `Literals` in java: `Integer`,`Boolean`,`Float`,`Character`,`String`.<br>
### Integer 
An `integer` literal is a numeric value, without any fractional or exponential part. 
There are `4` types of `integer` literals in Java:
```java
// octal 
int octalNumber = 027;

// decimal
int decNumber = 3;

// hexadecimal 
int hexNumber = 0x2F; // 0x represents hexadecimal
// binary
int binNumber = 0b10010; // 0b represents binary

```
**Tip** In Java, binary starts with `0b`, octal starts with `0`, and hexadecimal starts with `0x`.
### Boolean
`Boolean` literals are used to initialize boolean data types. They can store two values: `true` and `false`.
```java
boolean Question1 = false;
boolean Question2 = true;
```
### Float
A numeric literal that has either a `fractional` form or an `exponential` form.
```java
double myDouble = 3.4; //double used for much larger numbers
float myFloat = 3.4F;
```
### Character
`Character` literals are unicode character enclosed inside single quotes.
```java
char letter = 'a';
```
### String
A `string` literal is a sequence of characters enclosed inside double-quotes("").
```java
String str1 = "GitHub";
String str2 = "TeamHub";
```
### More.[LITERALS](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/73668d87dd759660010b1dd97df5da1a875116c4/VARIABLES%20%26%20LITERALS.java)

## Data Types

### Data Types 
Is `type` of `data` that can be stored inside variables in Java.<br>
There are **`8`** data types **predefined** in Java, known as *primitive data types.*

**`boolean`**,**`byte`**,**`short`**,**`int`**,**`long`**,**`double`**,**`float`**,**`char`**
### 8 Primitive Data Types
### 1. **boolean type**
* The *boolean* data type has two possible values, either `true` or `false`.
> Default value: `false`.
```java
boolean answer = true;
System.out.println(answer);    // prints true
```
### 2. **byte type**
* The byte data type can have values from `-128` to `127` (8-bit signed two's complement integer).
* If it's certain that the value of a variable will be within -128 to 127, then it is used instead of int to save memory.
> Default value: 0

```java
byte range;
range = 124;
System.out.println(range);  // prints 124
```
### 3. **short type**
* The short data type in Java can have values from -32768 to 32767 (16-bit signed two's complement integer).
* If it's certain that the value of a variable will be within -32768 and 32767, then it is used instead of other integer data types (int, long).
> Default value: 0

```java
short temperature;
temperature = -200;
System.out.println(temperature);  // prints -200
```
### 4. **int type**
* The `int` data type can have values from  -2<sup>31</sup> to -2<sup>31</sup>-1 (32-bit signed two's complement integer).
> Default value: 0
```java
int range = -4250000;
System.out.println(range);  // print -4250000
```

## 5. **long type**
* The `long` data type can have values from `-263` to `263-1` (64-bit signed two's complement integer).
* If you are using Java 8 or later, you can use an unsigned 64-bit integer with a minimum value of `0` and a maximum value of `264-1`.
> Default value: 0
```java
long range = -42332200000L;
System.out.println(range);    // prints -42332200000
```
>Notice, the use of `L` at the end of `-42332200000`. This represents that it's an `integer` of the `long` type.

## 6. **double type**
* The `double` data type is a `double-precision` 64-bit floating-point.
* It should never be used for precise values such as `currency`.
> Default value: 0.0 (0.0d)
```java
double number = -42.3;
System.out.println(number);  // prints -42.3
```
## 7. **float type**
* The float data type is a single-precision 32-bit floating-point. Learn more about single-precision and double-precision floating-point if you are interested.
* It should never be used for precise values such as currency.
> Default value: 0.0 (0.0f)
```java
float number = -42.3f;
System.out.println(number);  // prints -42.3
```
## 8. **char type**
* It's a 16-bit Unicode character.
* The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'.
> Default value: '\u0000'
```java
char letter = '\u0051';
System.out.println(letter);  // prints Q
```
### More. [DATA TYPES](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/e17be1a85679a1bdaa0c939bb4a64034f101d8ed/DATA%20TYPES)
# Operators
### Operators
Operators are symbols that perform operations on variables and values. 
`Operators` in Java can be classified into `5` types:
* Arithmetic Operators
* Assignment Operators
* Relational Operators
* Logical Operators
* Unary Operators
* Bitwise Operators

**1.** Java **Arithmetic** Operators:-
**`Arithmetic`** operators are used to perform `arithmetic` operations on variables and data.
```java
a + b;
```
|Operators|Operations|  
|----|----|
| +|Addition|  
| -|Subtraction|   
| *|Multiplication|
| /|Division|
| %|Modulo|

**2.** Java **Assingment** Operators:-<br>
**`Assignment`** operators are used in Java to assign values to variables.
```java
int age;
age = 5;
```
|Operators|Operations|  
|----|----|
|=| Assingment |  
|+=|Addition Assingment|   
|-=|Subtraction Assingment|
|*=|Multiplication Assingment|
|/=|Division Assingment|
|%=|Modulo Assingment|

**3.** Java **Relational** Operators:-
**`Relational`** operators are used to check the relationship between two operands
```java
// check if a is less than b
a < b;
```
|Operators|Operations|  
|----|----|
|==| Is Equal to |  
|!=| Is Not Equal to|   
|>|Greater Than|
|<|Less Than|
|>=|Greater Than or Equal to|
|<=|Less Than or Equal to|

**4**. Java **Logical** Operators:-
**`Logical`** operators are used to check whether an expression is `true` or `false`. They are used in decision making.

|Operators|Operations|  
|----|----|
|&&| AND |  
|\|\|| OR |  
|!| NOT |

**5**. Java **Unary** Operators:-
**`Unary`** operators are used with only one operand.
For example, `++` is a unary operator that increases the value of a variable by `1`. That is, `++1` will return `2`.

|Operators|Operations|  
|----|----|
|+| Unary plus |  
|-| Unary minus|   
|++|Increment Operator|
|--|Decrement Operator|
|!|Logical Compliment|

**6**. Java **Bitwise** Operators:-
**`Bitwise`** operators in Java are used to perform operations on individual bits.

|Operator|Description|
|----|----|
|~| Bitwise Complement|
|<<|Left Shift|
|>>|Right Shift|
|>>>|Unsigned Right Shift|
|&|Bitwise AND|
|^|Bitwise exclusive OR|

> ⭐ Java `instanceof` Operator
>> The `instanceof` operator checks whether an object is an instanceof a particular class.
 ```java
      // checks if str is an instance of
    // the String class
    result = str instanceof String;
    System.out.println("Is str an object of String? " + result);
  }
}
```
> Output:  Is str an object of String? true

> ⭐Java `Ternary` Operator
>> The `ternary` operator (conditional operator) is shorthand for the if-then-else statement.
```java
//variable = Expression ? expression1 : expression2
// ternary operator
result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
System.out.println(result);
```
> Output: Leap year<br>

### More.[OPERATORS](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f1e4315bdc6513efbf77f513434aeacdf6904624/OPERATORS)

# Java Basic Input and Output
## Java Output
```java
System.out.println(); or

System.out.print(); or

System.out.printf();

```
* **`System`** is a `class`
* **`out`** is a `public`,`static` field.
```java
 System.out.println("I Love Harry Potter Books!.");   
```
> Output:I Love Harry Potter Books!<br>

Difference between  `println()`, `print()`and `printf()`.
* **`print()`** - It prints string without adding newline.
* **`println()`** - It prints strings, Then the cursor moves to the beginning of the next line.
* **`printf()`** - It provides string formatting (similar to printf in C/C++ programming).

```java
System.out.println("Ayush");//println
System.out.println("Burman");
System.out.print("Ayush");//print
System.out.print("Burman");
```
```java
Output:
Ayush
Burman
Ayush Burman
```
## Java Input
* Get input from user using the object of **`Scanner`** class.
* To use the object of **`Scanner`**, we need to import `java.util.Scanner` package.
```java
import java.util.Scanner;
```
```java
// create an object of Scanner
Scanner input = new Scanner(System.in);

// take input from the user
int number = input.nextInt();
```
```java
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter your age: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // closing the scanner object
        input.close();
    }
}
```
```java
Output:
Enter your age: 23
You entered 23
```
### More.[INPUT OUTPUT](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f9600f8e4849baeaf3ed958f5ba6032147aaca3a/INPUT%20OUTPUT)

# **Expressions** 
* A Java `expression` consists of `variables`, `operators`, `literals`, and `method calls`.
```java
int marks; 
marks = 90;
```
```bash
> marks = 90 is a Expression.
```
# **Statements**
* Statement is a complete unit of execution.
```bash
int sum = 9*5;
```
```java
// expression
number = 10
// statement
number = 10;
```
# **Blocks**
A `block` is a group of statements (zero or more) that is enclosed in curly braces `{ }`.
```java
 String band = "Beatles";
    	
        if (muggle == "dudley") { // start of block
            System.out.print("Hey ");
            System.out.print("Harry!");
        } // end of block
    }
}
```
```java
Output: Hey Harry!
```
# **Comments**
`Comments` are a portion of the program that are completely ignored by Java compilers.
*syntax* = `//`

**Types of Comments in Java**
There are two types of comments:
* single-line comment `//`
* multi-line comment `/***/`
```java
//This is a single line comment.
/*This is
 a Multi line
 Comment
*/
```
# **Java Flow Control**
* controls the *flow* of **code**.
  
### Java **`if`** Statement.
```java
if (condition) {
  // statements
}
```

```java
class IfStatement {
  public static void main(String[] args) {

    int number = 10;

    // checks if number is less than 0
    if (number < 0) {
      System.out.println("The number is negative.");
    }

    System.out.println("Statement outside if block");
  }
}
```


