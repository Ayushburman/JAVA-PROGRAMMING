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
  
### 1.Java **`if`** Statement.
```java
if (condition) {
  // statements
}
```
### Program
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
```java
OUTPUT:Statement outside if block
```
### 2. Java **`if...else`** Statement.

```java
if (condition) {
  // codes in if block
}
else {
  // codes in else block
}
```
### Program
```java
class Main {
  public static void main(String[] args) {
    int number = 10;

    // checks if number is greater than 0
    if (number > 0) {
      System.out.println("The number is positive.");
    }
    
    // execute this block
    // if number is not greater than 0
    else {
      System.out.println("The number is not positive.");
    }

    System.out.println("Statement outside if...else block");
  }
}
```
```java
OUTPUT:The number is positive.
Statement outside if...else block
```
## 3. Java **`if...else...if`** Statement.
`if...else...if` ladder, that can be used to execute one block of code among multiple other blocks.

 ```java
if (condition1) {
  // codes
}
else if(condition2) {
  // codes
}
else if (condition3) {
  // codes
}
.
.
else {
  // codes
}
```
## Program
```java
class Main {
  public static void main(String[] args) {

    int number = 0;

    // checks if number is greater than 0
    if (number > 0) {
      System.out.println("The number is positive.");
    }

    // checks if number is less than 0
    else if (number < 0) {
      System.out.println("The number is negative.");
    }
    
    // if both condition is false
    else {
      System.out.println("The number is 0.");
    }
  }
}
```
```java
Output:The number is 0.
```
### 4. Java **Nested** `if..else` Statement.
```java
class Main {
  public static void main(String[] args) {

    // declaring double type variables
    Double n1 = 1.0, n2 = 3.5, n3 = 0.3, largest;

    // checks if n1 is greater than or equal to n2
    if (n1 >= n2) {

      // if...else statement inside the if block
      // checks if n1 is greater than or equal to n3
      if (n1 >= n3) {
        largest = n1;
      }

      else {
        largest = n3;
      }
    } else {

      // if..else statement inside else block
      // checks if n2 is greater than or equal to n3
      if (n2 >= n3) {
        largest = n2;
      }

      else {
        largest = n3;
      }
    }

    System.out.println("Largest Number: " + largest);
  }
}
```
```java
OUTPUT:Largest Number: 3.5
```
### More.[Flow_Control](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f94b4dcfcffa9630ab86be5bc62fc767e26f7ee9/FLOW_CONTROL.java)

# **Switch Statement**
## The `switch` statement allows us to execute a block of code among many alternatives.
* *Syntax*
```java
switch (expression) {

  case value1:
    // code
    break;
  
  case value2:
    // code
    break;
  
  ...
  ...
  
  default:
    // default statements
  }
```
* If `expression` matches with `value1`, the code of case `value1` are executed. Similarly, the code of case `value2` is executed if `expression` matches with `value2`.
* If there is no match, the code of the `default` case is executed.
## Progam
```java
class Main {
  public static void main(String[] args) {

    int number = 47;
    String size;

    // switch statement to check size
    switch (number) {

      case 29:
        size = "Small";
        break;

      case 42:
        size = "Medium";
        break;

      // match the value of week
      case 47:
        size = "Large";
        break;

      case 48:
        size = "Extra Large";
        break;
      
      default:
        size = "Unknown";
        break;

    }
    System.out.println("Size: " + size);
  }
}
```
```java
OUTPUT:Size: Large
```
### More.[SWITCH](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/a09732a8128d1dcc1d1d7335b3306978e52fb926/SWITCH.java)

# **Loops**
##  `loops` are used to repeat a block of code.
### There are 3 types of loops in java.
* `for loop`
* `while loop`
* `do...while loop`
## Java for Loop
### Java `for` loop is used to run a block of code for a certain number of times.
### **Syntax**
```java
for (initialExpression; testExpression; updateExpression) {
    // body of the loop
}
```
**Program**
```java
class Main {
  public static void main(String[] args) {

    int n = 5;
    // for loop  
    for (int i = 1; i <= n; ++i) {
      System.out.println("Git");
    }
  }
}
```
```java
Output:
Git
Git
Git
Git
Git
```
## **Java while loop**
### Java `while` loop is used to run a specific code until a certain condition is met.
**Syntax**
```java
while (testExpression) {
    // body of loop
}
```
**Program**
```java
// Program to display numbers from 1 to 5
class Main {
  public static void main(String[] args) {

    // declare variables
    int i = 1, n = 5;

    // while loop from 1 to 5
    while(i <= n) {
      System.out.println(i);
      i++;
    }
  }
}
```
```java
Output:
1
2
3
4
5
```
## do...while loop
### It is similar to while loop. However, the body of do...while loop is executed once before the test expression is checked.
**Syntax**
```java
do {
    // body of loop
} while(textExpression);
```
**Program**
```java
class Main {
  public static void main(String[] args) {

    int i = 1, n = 5;

    // do...while loop from 1 to 5
    do {
      System.out.println(i);
      i++;
    } while(i <= n);
  }
}
```
```java
Output:
1
2
3
4
5
```
### More.[Loops](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/a31ed35cca924bccaa4bd4981324b0e89632293b/LOOPS.java)
# Break
## The `break` statement in Java terminates the loop immediately, and the control of the program moves to the next statement following the loop.
**Syntax**
```java
break;
```
**Program**
```java
class Test {
    public static void main(String[] args) {
      
        // for loop
        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates  
            if (i == 5) {
                break;
            }      
            System.out.println(i);
        }   
    }
}
```
```java
Output:
1
2
3
4
```
### More.[Break](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/681f7e3d5388fda8abc56180c0289e4196ae1825/BREAK.java)

# **Continue**
## The `continue` statement skips the current iteration of a loop (for, while, do...while, etc).
**Syntax**
```java
continue;
```
**Program**
```java
class Main {
  public static void main(String[] args) {

    // for loop
    for (int i = 1; i <= 10; ++i) {

      // if value of i is between 4 and 9
      // continue is executed
      if (i > 4 && i < 9) {
        continue;
      }
      System.out.println(i);
    }
  }
}
```
```java
Output:
1
2
3
4
9
10
```
### More.[Continue](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/50bdc1bd0203ac07913c733313e3f5ad354a5445/CONTINUE.java)
------
# Array
## An `array` is a collection of similar data type.
**Syntax**
```java
dataType[] arrayName;
int[] age;
```
⬇️*Indexing*
|0  |1  |2  | 
|---|---|---|
|**1**|**4**|**6**| 

⬆️*Elements*

**Program**
```java
class Main {
 public static void main(String[] args) {
  
   // create an array
   int[] age = {1, 4, 5, 2, 15};

   // access each array elements
   System.out.println("Accessing Elements of Array:");
   System.out.println("First Element: " + age[0]);
   System.out.println("Second Element: " + age[1]);
   System.out.println("Third Element: " + age[2]);
   System.out.println("Fourth Element: " + age[3]);
   System.out.println("Fifth Element: " + age[4]);
 }
}
```
```java
Output:
Accessing Elements of Array:
First Element: 1
Second Element: 4
Third Element: 5
Fourth Element: 2
Fifth Element: 15
```
# **2D** Array
## A 2D array is also known as a `matrix` (a table of rows and columns).
```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
System.out.println(myNumbers[1][2]); 
```
```java
Output:7
```
# **3D** Array
## `3d` array is an array of 2d arrays

|   | C1  | C2  | C3 |
|---|---|---|---|
| R1  |0,0|0,1|0,2|
| R2  |1,0|1,1|1,2|
| R3  |2,0|2,1|2,2|

**Syntax**
```java
String[][][] data = new String[3][4][2];
```
**Program**
```java
// test is a 3d array
int[][][] test = {
        {
          {1, -2, 3}, 
          {2, 3, 4}
        }, 
        { 
          {-4, -5, 6, 9}, 
          {1}, 
          {2, 3}
        } 
};
```
```java
Output:
1
-2
3
2
3
4
-4
-5
6
9
1
2
3
```
More.[Array]()
----
# **Class**
### * A `class` is a blueprint for the object. Before we create an object, we first need to define the class.
### * `Sketch/Prototype` of a House (Details about floors,doors,windows etc.) With the help of this `Sketch/Prototype` we build house.
### * House is an `Object`.
* create a class in Java using the `class` keyword
  
  **Syntax**
```java
class ClassName{
//fields
//method
}
```
* Fields represents `Variables`
* Method represents `State` and `Behavior`
> **fields** are used to store data,
> **methods** are used to perform some operations
```java
class Bicycle {

  // state or field
  private int gear = 5;

  // behavior or method
  public void braking() {
    System.out.println("Working of Braking");
  }
}
```
### More.[CLASS](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/62e3680970bd5d85910174b199fb4aaf6536c818/CLASS.java)
# **Objects**
### An object is called an *instance* of a class
### if **Wand** is a **class**
### Then `ElderWoodWand`,`HollyWoodWand`,`WillowWoodWand` are its objects.
**Syntax**
```java
className object = new className();
```
```java
Weapon Wand  = new Weapon();
Weapon ElderWoodWand  = new Weapon();
Weapon HollyWoodWand  = new Weapon();
```
### More.[OBJECTS](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/62e3680970bd5d85910174b199fb4aaf6536c818/OBJECTS.java)
# **Methods**
### A method is a block of code that performs a specific task.
**Syntax**
```java
returnType methodName() {
  // method body
}
```
## call **``methods``**
```java
addNumbers();
```
## **Program**
```java
class Main {

  // create a method
  public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
    return sum;
  }

  public static void main(String[] args) {
    
    int num1 = 25;
    int num2 = 25;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
  }
}
```java
Output:Sum is: 40
```
### More.[METHOD](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/f7c5e448a4a78d7aa910aac68102b03bc4fa9a1d/METHODS.java)
# **Constructors**
## A `constructor` in Java is similar to a method that is invoked when an object of the class is created.
**Syntax**

```java
class Test {
  Test() {
    // constructor body
  }
}
```
####  `Test()` is a constructor.
```java
class Main {
  private String name;

  // constructor
  Main() {
    System.out.println("Constructor Called:");
    name = "Programmer";
  }

  public static void main(String[] args) {

    // constructor is invoked while
    // creating an object of the Main class
    Main obj = new Main();
    System.out.println("The name is " + obj.name);
  }
}
```
```java
Output:
Constructor Called:
The name is Programmer
```
## **Types of Constructor**
### In Java, constructors can be divided into 3 types:
* No-Arg Constructor
* Parameterized Constructor
* Default Constructor

### 1.`No-Arg Constructor` If a constructor does not accept any parameters, it is known as a no-argument constructor. 

```java
private Constructor() {
   // body of the constructor
}
```
### **Program**
```
class Main {

  int i;

  // constructor with no parameter
  private Main() {
    i = 5;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) {

    // calling the constructor without any parameter
    Main obj = new Main();
    System.out.println("Value of i: " + obj.i);
  }
}
```
```java
Output:

Constructor is called
Value of i: 5
```
### 2. Parameterized Constructor
### A Java constructor can also accept one or more parameters. Such constructors are known as parameterized constructors (constructor with parameters).
### **Program**
```java
class Main {

  String languages;

  // constructor accepting single value
  Main(String lang) {
    languages = lang;
    System.out.println(languages + " Programming Language");
  }

  public static void main(String[] args) {

    // call constructor by passing a single value
    Main obj1 = new Main("Java");
    Main obj2 = new Main("Python");
    Main obj3 = new Main("C++");
  }
}
```

```java
Output:
Java Programming Language
Python Programming Language
C++ Programming Language
```
### 3. Java Default Constructor
### If we do not create any constructor, the Java compiler automatically create a no-arg constructor during the execution of the program. This constructor is called default constructor.
```java
class Main {

  int a;
  boolean b;

  public static void main(String[] args) {

    // A default constructor is called
    Main obj = new Main();

    System.out.println("Default Value:");
    System.out.println("a = " + obj.a);
    System.out.println("b = " + obj.b);
  }
}
```
```java
Output:
Default Value:
a = 0
b = false
```
### More.[CONSTRUCTOR](https://github.com/Ayushburman/JAVA-PROGRAMMING/blob/878644bce90696d4e0cc5508f9c6961199baf52b/CONSTRUCTOR.java)
## **Strings**
### In Java, a `string` is a sequence of characters. For example, "hellooo" is a string containing a sequence of characters 'h', 'e', 'l', 'l', 'o',`o` and `o`.
**Syntax**
```java
// create a string
String type = "Programming";
```
```java
class Main {
  public static void main(String[] args) {
    
    // create strings
    String first = "Harry";
    String second = "James";
    String third = "
potter";

    // print strings
    System.out.println(first);   // print Java
    System.out.println(second);  // print Python
    System.out.println(third);   // print JavaScript
  }
}
```
```java
Output:
Harry
James
potter
```
## String Operations
## 1. Get `length` of a String.
## Use `length()`
```java
class Main {
  public static void main(String[] args) {

    // create a string
    String say = "Hello!";
    System.out.println("String: " + say);

    // get the length of greet
    int length = say.length();
    System.out.println("Length: " + length);
  }
}
```
```java
Output
String: Hello! World
Length: 05
```
## 2. Join Two Java Strings.
## using the `concat()` method.
```java
class Main {
  public static void main(String[] args) {

    // first string
    String first = "Fantastic ";
    System.out.println("First String: " + first);

    // create second
    String second = "Beasts";
    System.out.println("Second String: " + second);

    // join two strings
    String joinedString = first.concat(second);
    System.out.println("Joined String: " + joinedString);
  }
}
```
```java
First String: Fantastic 
Second String: Beast    
Joined String: Fantastic Beast
```
More.[STRINGS]()
# `Access Modifiers`
##  `Access modifiers` are used to set the accessibility (visibility) of classes, interfaces, variables, methods, constructors, data members, and the setter methods.
### `Syntax`
```java
class Animal {
    public void method1() {...}

   private void method2() {...}
}
```
* `method1` is public - This means it can be accessed by other classes.
* `method2` is private - This means it can not be accessed by other classes.
> `Access modifiers` in Java. They are also known as `visibility modifiers.`
> Note: You cannot set the access modifier of `getters` methods.

* `Modifier`| `Description`
* `Default` | Declarations are visible only within the package (package private).
* `Private` | Declarations are visible within the class only.
* `Protected`| Declarations are visible within the package or all subclasses.
* `Public`   | Declarations are visible everywhere.

More.[Access_Modifier]()

# `Recursion` 
## A method that calls itself is known as a `recursive method`,This process is known as `recursion.`
### **Working**
```java
public static void main(String[] args) {
.. .. ..
recurse()
.. .. ..
}
static void recurse() {
  .. .. ..
  recurse()
  .. .. .. 
  }
```
More.[]().
# **Inheritance**
## `Inheritance` is one of the key features of OOP that allows us to create a new class from an existing class.
> Parent class<br>
|---> Child class

The `extends` keyword is used to perform inheritance.
**Syntax**
```java
class Animal {
  // methods and fields
}

// use of extends keyword
// to perform inheritance
class Dog extends Animal {

  // methods and fields of Animal
  // methods and fields of Dog
}
```
## **Types of inheritance**
### **1. Single Inheritance**
In single inheritance, a single subclass extends from a single superclass. 
### **2. Multilevel Inheritance**
In multilevel inheritance, a subclass extends from a superclass and then the same subclass acts as a superclass for another class.
### **3. Hierarchical Inheritance**
In hierarchical inheritance, multiple subclasses extend from a single superclass.
### **4. Multiple Inheritance**
In multiple inheritance, a single subclass extends from multiple superclasses.
### **5. Hybrid Inheritance**
Hybrid inheritance is a combination of two or more types of inheritance.
### More[]()

## **Abstract Class**
### The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes). We use the abstract keyword to declare an abstract class. 

```java
abstract class Language {

  // abstract method
  abstract void method1();

  // regular method
  void method2() {
    System.out.println("This is regular method");
  }
}
```
```java
abstract void display();
```
## Abstraction
### The major use of abstract classes and methods is to achieve abstraction in Java.Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary details and only show the needed information.

This allows us to manage complexity by omitting or hiding details with a simpler, higher-level idea.
```java
abstract class MotorBike {
  abstract void brake();
}

class SportsBike extends MotorBike {
    
  // implementation of abstract method
  public void brake() {
    System.out.println("SportsBike Brake");
  }
}

class MountainBike extends MotorBike {
    
  // implementation of abstract method
  public void brake() {
    System.out.println("MountainBike Brake");
  }
}

class Main {
  public static void main(String[] args) {
    MountainBike m1 = new MountainBike();
    m1.brake();
    SportsBike s1 = new SportsBike();
    s1.brake();
  }
}
```
```java
Output:

MountainBike Brake
SportsBike Brake
```
## Interface
### An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).We use the interface keyword to create an interface in Java.
```java
interface Language {
  public void getType();

  public void getVersion();
}
```
## Polymorphism
### Polymorphism is an important concept of object-oriented programming. It simply means more than one form.
### Why Polymorphism?
Polymorphism allows us to create consistent code. In the previous example, we can also create different methods: renderSquare() and renderCircle() to render Square and Circle, respectively.

Idont have time for java 
Taking Break
Starting c++ soon
Im sorry 
abc
def
ghi
ijk
4
5
6
7
mutual exclusion
no preemption
hold and wait
DAAA
12
12
13
14
15
16
17
18
19
20
21
22
23
24
25
36
34
3536
123
321


