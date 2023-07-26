java is a programming language + Platform 
------------------------------------------
released by Sun Microsystems in 1995
------------------------------------------
Inventor- James Gosling [https://en.wikipedia.org/wiki/James_Gosling]
----------------------------------------------------------------------
Write Once, Run Anywhere (WORA)
-------------------------------
Works on OOP concept
--------------------

JDK JRE JVM
_____________________________________________________________________________________________________________________________________________________________________
JDK - JAVA DEVELOPMENT KIT -provides tools for developing java Applications,includes Compiler,Debugger and other utilities

Java Compiler                - javac - (Convert Source code to Byte Code.)
Java Debugger                - jdb   - (Assist you in Debugging Your Application.)
Java Documentation Generator - javadoc - (Used to genereate API documentation from java source code.)
Java Archive                 - JAR     - ( Allows you to create, manage, and extract JAR files, which are used for packaging and distributing Java applications.)
java Decompiler              - javap   - (Helps to decompile java Byte Code  into Source Code.)   
Java FX Compiler             - javaFX  - (framework for building rich client aaplication.)
___________________________________________________________________________________________________________________________________________________________________
JRE - JAVA RUNTIME ENVIRONMENT - environment that provides the necessary runtime
                                 support to execute Java applications
                                 
Java Vrtual Machine                    -jvm- (It is responsible for executing Java bytecode and providing a runtime environment for Java applications.)
Java Class Libraries                   -  - (pre-built classes and APIs for performing common tasks.)
Java Runtime Environment Configuration -  - (onfiguration files and resources that define the runtime behavior of Java applications, including system properties, environment variables, and other settings that affect the execution environment.)
Java Plugin                            -  - ( The JRE may include a web browser plugin that allows Java applets to run within web browsers)
Java Web Start                         -  - (Java Web Start is a technology that allows Java applications to be launched and run directly from a web browser, without the need for manual installation or updating.)
Security Components                    -  - (The JRE includes security-related components that ensure the safe execution of Java applications.)
Java Deployment Tools                  -  - (The JRE may include deployment tools that assist in the installation and management of Java applications on client machines, such as auto-update mechanisms, installation wizards, and application cache management.)
Additional Resources                   -  - (The JRE may contain additional resources, such as fonts, graphics, sound files, and other runtime assets that may be required by Java applications.)
_______________________________________________________________________________________________________________________________________________________________________________________________________________________
JVM - Java Virtual Machine  -It is responsible for executing Java bytecode and providing
                             a runtime environment for Java applications,The JVM translates the
                             bytecode into machine code that can be
                             understood by the underlying operating system and hardware

ClassLoader                  The class loader is responsible for loading Java class files into the JVM.               
Bytecode Verifier            The bytecode verifier checks the integrity and safety of the loaded bytecode before execution.
Interpreter                  The interpreter is responsible for executing the Java bytecode instructions one by one.
Just-In-Time (JIT) Compiler  It dynamically analyzes and compiles sections of the bytecode into native machine code for efficient execution.
Memory Manager               Garbage Collector (GC), is responsible for automatic memory management in the JVM.
Execution Engine             The execution engine executes the instructions provided by the interpreter or the JIT-compiled native code. 
Native Method Interface      The JNI allows Java programs to call and be called by native code, written in languages such as C or C++.
Java Native Library          The JVM includes a set of native libraries that provide low-level functionality and access to the underlying operating system.
Runtime Data Areas           The JVM allocates and manages various runtime data areas to store program data during execution.
Threads and Synchronization  The JVM manages and schedules threads for concurrent execution. 
Monitoring and Profiling     The JVM includes tools and APIs for monitoring and profiling Java applications.
Security Manager             The JVM provides a security manager that enforces security policies, such as controlling access to system resources, managing permissions, and preventing unauthorized operations.

______________________________________________________________________________________________________________________________________________________________________________________________________________________________


