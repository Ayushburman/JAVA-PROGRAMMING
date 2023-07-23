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
* Instance Variables (Non-Static Fields)
* Class Variables (Static Fields)
* Local Variables
* Parameters
## More VARIABLE
 
