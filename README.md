# Java Programming Language

Java is a high-level, class-based, object-oriented programming language. It was originally developed by James Gosling at Sun Microsystems and released in 1995.

## Key Features of Java

- **Write Once, Run Anywhere (WORA)**: Java applications are typically compiled to bytecode that can run on any Java Virtual Machine (JVM) regardless of the underlying computer architecture.
- **Object-Oriented**: Java is an object-oriented language which provides a clear structure to programs and allows code to be reused, reducing development costs.
- **Platform Independent**: Unlike many other programming languages including C and C++, when Java is compiled, it is not compiled into platform-specific machine, rather into platform-independent byte code. This byte code is distributed over the web and interpreted by the JVM.
- **Secure**: Java is secure because it supports the concept of byte code and exception handling.

## Example of Java Code

Here's a simple example of Java code that prints "Hello, World!" to the console:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
---
1. **JVM (Java Virtual Machine)**:
   - **Abstract Machine**: JVM is an abstract machine. It doesn't physically exist but provides a runtime environment for executing Java bytecode.
   - **Specification**: It defines how Java programs should run on different platforms.
   - **Tasks**:
     - Loads code.
     - Verifies code.
     - Executes code.
     - Provides a runtime environment.
   - **Platform-Dependent**: Different JVM implementations are available for various hardware and software platforms.
   - **Example**: When you run a Java program, it's the JVM that executes the bytecode.
   - ¹²

2. **JRE (Java Runtime Environment)**:
   - **Implementation of JVM**: JRE is the implementation of the JVM.
   - **Complete Environment**: It provides a complete runtime environment for running Java applications.
   - **Components**:
     - JVM (which executes Java code).
     - Class libraries (required by the JVM).
   - **Platform-Specific**: JRE is platform-dependent due to differences in OS configurations.
   - **Example**: When you run a Java application, you need the JRE installed.
   - ³

3. **JDK (Java Development Kit)**:
   - **Development Environment**: JDK is used for developing Java applications and applets.
   - **Components**:
     - JRE (for execution).
     - Development tools (compiler, archiver, documentation generator, etc.).
   - **Platform-Dependent**: Like JRE, JDK is also platform-dependent.
   - **Example**: Developers use the JDK to write, compile, and build Java applications.
---
# Java Primitive Data Types

Java has 8 primitive data types, which are predefined by the language and named by a reserved keyword. These data types are used to create variables.

## Integral Data Types

1. **byte**: This is an 8-bit signed two's complement integer. The range is from -128 to 127.
2. **short**: This is a 16-bit signed two's complement integer. The range is from -32768 to 32767.
3. **int**: This is a 32-bit signed two's complement integer. The range is from -2147483648 to 2147483647. This is the default data type in Java.
4. **long**: This is a 64-bit signed two's complement integer. The range is from -9223372036854775808 to 9223372036854775807. When using this data type, add an "L" at the end of the number.
---
| Data Type | Description                  | Size (in bytes) |
|-----------|------------------------------|-----------------|
| `byte`    | 8-bit signed integer         | 1               |
| `short`   | 16-bit signed integer        | 2               |
| `int`     | 32-bit signed integer        | 4               |
| `long`    | 64-bit signed integer        | 8               |
| `float`   | 32-bit floating-point number | 4               |
| `double`  | 64-bit floating-point number | 8               |
| `char`    | 16-bit Unicode character     | 2               |
| `boolean` | Represents true or false     | 1               |

---

## Floating Point Data Types

1. **float**: This is a single-precision 32-bit IEEE 754 floating point. Use an "f" at the end of the number.
2. **double**: This is a double-precision 64-bit IEEE 754 floating point. This is the default data type for decimal values.

## Other Primitive Data Types

1. **char**: This is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
2. **boolean**: This data type has only two possible values: true and false.

## Non-Primitive Data Type

**String**: This is a sequence of characters. In Java, strings are immutable.

Here's an example of using these data types:

```java
byte a = 127;
short b = 32767;
int c = 2147483647;
long d = 9223372036854775807L;

float e = 3.14f;
double f = 3.14;

char g = 'a';
boolean h = true;

String i = "Hello, World!";
```
---
# Java escape sequences table

| Escape Sequence | Description                  |
|-----------------|------------------------------|
| `\\t`           | Represents a tab character    |
| `\\b`           | Represents a backspace       |
| `\\n`           | Represents a newline         |
| `\\r`           | Represents a carriage return |
| `\\'`           | Represents a single quotation mark |
| `\\"`           | Represents a double quotation mark |
| `\\\\`          | Represents a backslash       |
| `\\uXXXX`       | Represents a Unicode character (specified by its hexadecimal value) |

---
## Variables in Java

In Java, **variables** are used to store different types of values that can be changed during the program's execution. The data type of a variable defines what kind of value it can hold. Here's the syntax to define a variable:

```java
<access-modifier> <data-type> <name-of-the-variable> = <value>;
```

For example, consider the following variable declaration:

```java
private int number = 10;
```

In this example:
- `private` is the access modifier (you can use other modifiers like `public`, `protected`, or package-private).
- `int` is the data type (representing integers).
- `number` is the name of the variable.
- `10` is the initial value assigned to the variable.

## Constants in Java

A **constant** in Java is a variable whose value cannot be changed once it is assigned. To declare a constant, we use the `static` and `final` keywords. Here's the syntax to assign a constant value in Java:

```java
static final <data-type> <identifier-name> = <constant-value>;
```

For example, let's say we want to create a constant named `PI` to represent the mathematical constant π (approximately 3.14159). We can declare it as follows:

```java
public class MathConstants {
    static final double PI = 3.14159;
    
    public static void main(String[] args) {
        System.out.println("The value of PI is: " + PI);
    }
}
```

In this example:
- `static` ensures that the variable is available without an instance of its defining class being loaded.
- `final` indicates that the value of `PI` cannot be changed.
- `double` is the data type.
- `3.14159` is the constant value assigned to `PI`.

Constants are useful for making your code more readable, maintaining consistency, and preventing accidental modifications.

---
# Combining Assignment with Operators in Java

In Java, **assignment operators** allow you to assign values to variables. However, you can also combine these assignment operations with other operators to create more concise and efficient code. Let's explore how this works:

## Simple Assignment Operator (=)

The most straightforward assignment operator is the `=` sign. It assigns the value on the right to the variable on the left. Here's the basic syntax:

```java
variable = value;
```

For example:

```java
int num1 = 10;
char ch = 'y';
```

In this case:
- `num1` is assigned the value `10`.
- `ch` is assigned the character `'y'`.

## Compound Assignment Operators

Compound assignment operators combine an arithmetic operation (such as addition, subtraction, multiplication, or division) with an assignment. They provide a shorthand way of updating the value of a variable. The general format is:

```java
variable operator= expression;
```

Here are some common compound assignment operators:

1. **Addition Assignment (`+=`)**:
   - Adds the current value of the variable on the left to the value on the right and assigns the result back to the variable on the left.
   - Example:
     ```java
     int a = 5;
     a += 3; // Equivalent to a = a + 3
     // Now 'a' is 8
     ```

2. **Subtraction Assignment (`-=`)**:
   - Subtracts the value on the right from the current value of the variable on the left and assigns the result back to the variable on the left.
   - Example:
     ```java
     int b = 10;
     b -= 4; // Equivalent to b = b - 4
     // Now 'b' is 6
     ```

3. **Multiplication Assignment (`*=`)**:
   - Multiplies the current value of the variable on the left by the value on the right and assigns the result back to the variable on the left.
   - Example:
     ```java
     int c = 7;
     c *= 2; // Equivalent to c = c * 2
     // Now 'c' is 14
     ```

4. **Division Assignment (`/=`)**:
   - Divides the current value of the variable on the left by the value on the right and assigns the result back to the variable on the left.
   - Example:
     ```java
     int d = 20;
     d /= 5; // Equivalent to d = d / 5
     // Now 'd' is 4
     ```

These compound assignment operators are not only concise but also improve code readability. Use them wisely to enhance your Java programs!
---
# Java Increment and Decrement Operators

In Java, **increment** and **decrement** operators are used to modify the value of a variable by either increasing or decreasing it by 1. These operators are commonly used in loops, conditionals, and other programming constructs. Let's explore how they work:

## 1. Increment Operator (++)

The **increment operator** (`++`) increases the value of a variable by 1. It can be used in two ways:

### a. Pre-increment (++x)

- The pre-increment operator is applied before the value of the variable is used.
- Syntax: `++x`
- Example:
  ```java
  int x = 5;
  int y = ++x; // y gets the value 6 (x is incremented first)
  ```

### b. Post-increment (x++)

- The post-increment operator is applied after the value of the variable is used.
- Syntax: `x++`
- Example:
  ```java
  int a = 10;
  int b = a++; // b gets the value 10 (a is incremented after the assignment)
  ```

## 2. Decrement Operator (--)

The **decrement operator** (`--`) decreases the value of a variable by 1. Similar to increment, it also has pre-decrement and post-decrement forms:

### a. Pre-decrement (--x)

- The pre-decrement operator is applied before the value of the variable is used.
- Syntax: `--x`
- Example:
  ```java
  int p = 8;
  int q = --p; // q gets the value 7 (p is decremented first)
  ```

### b. Post-decrement (x--)

- The post-decrement operator is applied after the value of the variable is used.
- Syntax: `x--`
- Example:
  ```java
  int m = 15;
  int n = m--; // n gets the value 15 (m is decremented after the assignment)
  ```

## Usage Tips

- Be cautious when using increment and decrement operators within complex expressions to avoid unexpected behavior.
- Understand the difference between pre-increment/post-increment and pre-decrement/post-decrement.
- Use these operators judiciously to improve code readability and efficiency.

Remember that increment and decrement operators are powerful tools, but misuse can lead to subtle bugs. Use them wisely in your Java programs! 😊

---
# Relational and Boolean Operators in Java

In Java, **relational operators** and **boolean operators** play a crucial role in making decisions, controlling flow, and evaluating conditions within your programs. Let's dive into each of these operators:

## Relational Operators

Relational operators compare two values and return a boolean result (`true` or `false`). They are used to express relationships between operands. Here are the commonly used relational operators in Java:

1. **Equal to (`==`)**:
   - Checks if two values are equal.
   - Example: `a == b` returns `true` if `a` is equal to `b`.

2. **Not equal to (`!=`)**:
   - Checks if two values are not equal.
   - Example: `a != b` returns `true` if `a` is not equal to `b`.

3. **Greater than (`>`)**:
   - Checks if the value on the left is greater than the value on the right.
   - Example: `a > b` returns `true` if `a` is greater than `b`.

4. **Less than (`<`)**:
   - Checks if the value on the left is less than the value on the right.
   - Example: `a < b` returns `true` if `a` is less than `b`.

5. **Greater than or equal to (`>=`)**:
   - Checks if the value on the left is greater than or equal to the value on the right.
   - Example: `a >= b` returns `true` if `a` is greater than or equal to `b`.

6. **Less than or equal to (`<=`)**:
   - Checks if the value on the left is less than or equal to the value on the right.
   - Example: `a <= b` returns `true` if `a` is less than or equal to `b`.

## Boolean Operators

Boolean operators manipulate boolean values (`true` or `false`). They allow you to combine conditions and control program flow. Here are the commonly used boolean operators:

1. **Logical AND (`&&`)**:
   - Returns `true` if both operands are `true`.
   - Example: `a && b` returns `true` if both `a` and `b` are `true`.

2. **Logical OR (`||`)**:
   - Returns `true` if at least one operand is `true`.
   - Example: `a || b` returns `true` if either `a` or `b` (or both) are `true`.

3. **Logical NOT (`!`)**:
   - Inverts the boolean value (negation).
   - Example: `!a` returns `true` if `a` is `false`.

## Combining Relational and Boolean Operators

You can combine these operators to create complex conditions. For example:

```java
int age = 25;
boolean isAdult = (age >= 18) && (age <= 65);
System.out.println("Is adult? " + isAdult);
```

In this example, `isAdult` will be `true` if `age` is between 18 and 65 (inclusive).

Remember to use these operators wisely to express conditions accurately and efficiently in your Java programs! 😊

java supports the ternary ?; operator that is occasionally useful. The expression 

```java
//condition?expression 1 : expression2 ;
int x = 8,y = 9;
x < y ? x : y ;
```
---
Certainly! In Java, **bitwise operators** are used to manipulate individual bits of a number. They operate at the binary level and allow you to perform various bitwise operations. Let's explore the different bitwise operators available in Java:

1. **Bitwise OR (`|`)**:
   - The bitwise OR operator (`|`) performs a bit-by-bit OR operation between two integers.
   - If either of the corresponding bits is 1, the result bit is set to 1; otherwise, it is set to 0.
   - Example:
     ```java
     int a = 5; // Binary: 0101
     int b = 3; // Binary: 0011
     int result = a | b; // Binary result: 0111 (Decimal: 7)
     ```

2. **Bitwise AND (`&`)**:
   - The bitwise AND operator (`&`) performs a bit-by-bit AND operation between two integers.
   - If both corresponding bits are 1, the result bit is set to 1; otherwise, it is set to 0.
   - Example:
     ```java
     int x = 5; // Binary: 0101
     int y = 3; // Binary: 0011
     int result = x & y; // Binary result: 0001 (Decimal: 1)
     ```

3. **Bitwise XOR (`^`)**:
   - The bitwise XOR operator (`^`) performs a bit-by-bit exclusive OR operation between two integers.
   - If corresponding bits are different (one is 1 and the other is 0), the result bit is set to 1; otherwise, it is set to 0.
   - Example:
     ```java
     int p = 5; // Binary: 0101
     int q = 3; // Binary: 0011
     int result = p ^ q; // Binary result: 0110 (Decimal: 6)
     ```

4. **Bitwise Complement (`~`)**:
   - The bitwise complement operator (`~`) inverts all the bits of an integer.
   - It returns the one's complement representation of the input value.
   - Example:
     ```java
     int num = 5; // Binary: 0101
     int complement = ~num; // Binary complement: 1010 (Decimal: -6)
     ```

5. **Left Shift (`<<`)** and **Right Shift (`>>`)**:
   - These operators shift the bits of an integer left or right by a specified number of positions.
   - Example:
     ```java
     int value = 10; // Binary: 1010
     int leftShifted = value << 2; // Binary result: 101000 (Decimal: 40)
     int rightShifted = value >> 1; // Binary result: 101 (Decimal: 5)
     ```

Bitwise operators are useful for low-level operations, such as working with flags, optimizing memory usage, and implementing custom data structures. Remember to use them carefully and understand their behavior! 😊

---
# Operator Precedence in Java

In Java, operator precedence determines the order in which operators are evaluated within an expression. Understanding operator precedence is essential for writing correct and efficient code. Let's explore the operator hierarchy in Java along with examples.

## Operator Precedence Table

The following table lists Java operators from highest to lowest precedence:

| Precedence | Operator(s)                  | Description                           | Associativity |
|------------|------------------------------|---------------------------------------|---------------|
| 1          | `()` `[]` `.`                | Parentheses, array subscript, member selection | Left to Right |
| 2          | `++` `--` `+` `-` `!` `~` `(type)` | Unary increment, decrement, plus, minus, logical negation, bitwise complement, type cast | Right to Left |
| 3          | `*` `/` `%`                  | Multiplication, division, modulus      | Left to Right |
| 4          | `+` `-`                      | Addition, subtraction                  | Left to Right |
| 5          | `<` `<=` `>` `>=` `instanceof` | Relational operators                   | Left to Right |
| 6          | `==` `!=`                    | Equality and inequality                | Left to Right |
| 7          | `&`                          | Bitwise AND                           | Left to Right |
| 8          | `^`                          | Bitwise XOR                           | Left to Right |
| 9          | `|`                          | Bitwise OR                            | Left to Right |
| 10         | `&&`                         | Logical AND                           | Left to Right |
| 11         | `||`                         | Logical OR                            | Left to Right |
| 12         | `? :`                        | Ternary conditional (conditional operator) | Right to Left |
| 13         | `=` `+=` `-=` `*=` `/=` `%=` | Assignment operators                   | Right to Left |

## Example Usage

Let's see some examples to illustrate operator precedence:

1. **Expression with Parentheses**:
   ```java
   int result = (5 + 3) * 2; // Evaluates to 16 (not 18)
   ```

2. **Combining Operators**:
   ```java
   int x = 10;
   int y = 5;
   boolean condition = (x > y) && (y != 0); // Evaluates to true
   ```

3. **Ternary Operator**:
   ```java
   int age = 20;
   String status = (age >= 18) ? "Adult" : "Minor"; // Ternary conditional
   ```

Remember to use parentheses to clarify expressions and ensure the desired order of evaluation. Operator precedence affects how your code behaves, so use it wisely!

---
# String Concatenation and Substring in Java

In Java, string manipulation is essential for working with text data. Let's explore how to concatenate strings (combine them) and extract substrings (portions of a string) using built-in methods:

## 1. String Concatenation

String concatenation involves combining two or more strings into a single string. Here are some ways to achieve this:

### Using the `+` Operator

You can use the `+` operator to concatenate strings:

```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
System.out.println("Full Name: " + fullName);
```

Output:
```
Full Name: John Doe
```

### Using the `concat()` Method

The `concat()` method appends a string to the end of another string:

```java
String str1 = "Hello";
String str2 = "World";
String combined = str1.concat(" ").concat(str2);
System.out.println(combined);
```

Output:
```
Hello World
```

## 2. Substring Extraction

You can extract a portion of a string using the `substring()` method. It takes the starting index (inclusive) and optionally the ending index (exclusive):

```java
String original = "Programming is fun!";
String extracted = original.substring(13, 16); // Extracts "fun"
System.out.println("Extracted: " + extracted);
```

Output:
```
Extracted: fun
```

Remember that the starting index is inclusive, and the ending index is exclusive. If you omit the ending index, the substring includes all characters from the starting index to the end of the string.

## 3. Reversed String

To reverse a string, you can iterate through its characters and build a new string in reverse order:

```java
String original = "Ro706";
String reversed = "";
for (int i = original.length() - 1; i >= 0; i--) {
    char currentChar = original.charAt(i);
    reversed = reversed.concat(Character.toString(currentChar));
}
System.out.println("Original: " + original);
System.out.println("Reversed: " + reversed);
```

Output:
```
Original: Ro706
Reversed: 607oR
```

String manipulation is a powerful tool in Java, and understanding these methods will help you work effectively with text data! 😊

---
# Taking Input in Java

In Java, you can take input from the user during program execution using the `Scanner` class. The `Scanner` class provides methods to read different types of input, such as integers, strings, and floating-point numbers. Let's explore how to use the `Scanner` class to take input:

## 1. Creating a `Scanner` Object

First, create an instance of the `Scanner` class by importing it and initializing it with the standard input stream (`System.in`):

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Now 'scanner' can be used to read input
    }
}
```

## 2. Reading Different Types of Input

### a. Reading Integers

To read an integer from the user, use the `nextInt()` method:

```java
System.out.print("Enter an integer: ");
int num = scanner.nextInt();
System.out.println("You entered: " + num);
```

### b. Reading Strings

To read a line of text (a string) from the user, use the `nextLine()` method:

```java
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.println("Hello, " + name + "!");
```

### c. Reading Floating-Point Numbers

To read a floating-point number (e.g., double), use the `nextDouble()` method:

```java
System.out.print("Enter a decimal number: ");
double decimal = scanner.nextDouble();
System.out.println("You entered: " + decimal);
```

## 3. Closing the `Scanner`

Remember to close the `Scanner` object when you're done reading input:

```java
scanner.close();
```

## Example Program

Here's a complete example that reads an integer and a string from the user:

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
```
---
# Formatting Output in Java

In Java, formatting output is essential for displaying data in a readable and organized manner. You can format output using various techniques. Let's explore some common methods:

## 1. Using `System.out.printf()`

The `printf()` method allows you to format output based on specific rules and specifiers. It works similarly to the `printf()` function in C. Here's how to use it:

```java
public class OutputFormattingExample {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14159;
        String stringValue = "Java";

        // Formatting integers, doubles, and strings
        System.out.printf("Integer: %d, Double: %.2f, String: %s%n", intValue, doubleValue, stringValue);

        // Formatting with width and precision
        System.out.printf("Formatted double: %.4f%n", doubleValue);

        // Right-aligning text within a specified width
        System.out.printf("%20s%n", "Right-aligned");

        // Combining multiple values
        System.out.printf("Combined: %d %.2f %s%n", intValue, doubleValue, stringValue);
    }
}
```

Output:
```
Integer: 42, Double: 3.14, String: Java
Formatted double: 3.1416
       Right-aligned
Combined: 42 3.14 Java
```

## 2. Using `String.format()`

The `String.format()` method is similar to `printf()`, but it returns a formatted string instead of printing directly to the console:

```java
String formattedString = String.format("Formatted: %d %.2f %s", intValue, doubleValue, stringValue);
System.out.println(formattedString);
```

## 3. Formatting Numbers with `DecimalFormat`

For more control over decimal numbers, use the `DecimalFormat` class:

```java
import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double number = 12345.6789;

        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        String formattedNumber = decimalFormat.format(number);

        System.out.println("Formatted number: " + formattedNumber);
    }
}
```

Output:
```
Formatted number: 12,345.68
```

## 4. Other Formatting Techniques

- For date and time formatting, use `SimpleDateFormat`.
- For currency formatting, consider `NumberFormat.getCurrencyInstance()`.
---
# Conversion Specifiers for `printf()` in Java

When using the `printf()` method in Java, you can format output by specifying conversion specifiers within the format string. These specifiers control how the arguments are displayed. Below, I've created a table of common conversion specifiers along with their meanings:

| Conversion Specifier | Description |
|----------------------|-------------|
| `%s` | Formats a string argument. |
| `%d` | Formats an integer (decimal) argument. |
| `%f` | Formats a floating-point (double) argument. |
| `%c` | Formats a character argument. |
| `%b` | Formats a boolean argument. |
| `%n` | Inserts a newline character. |
| `%t` | Formats date/time values (used with date/time patterns). |
| `%x` | Formats an integer as a hexadecimal number. |
| `%o` | Formats an integer as an octal number. |
| `%e` | Formats a floating-point number in scientific notation. |
| `%g` | Formats a floating-point number in either decimal or scientific notation. |

## Example Usage

```java
public class PrintfExample {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        double salary = 50000.75;

        System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);
    }
}
```

Output:
```
Name: Alice, Age: 30, Salary: 50000.75
```
---
Yes, you can definitely use `printf()` in Java! The `printf()` method is part of the `java.io.PrintStream` class and allows you to format output in a flexible and controlled manner. It is commonly used for displaying data with specific formatting rules.

Here's how you can use `printf()` in Java:

1. **Basic Usage**:
   - The `printf()` method works similarly to the `printf()` function in C.
   - You provide a format string (which includes placeholders for values) followed by the actual values to be inserted.
   - Example:
     ```java
     int age = 30;
     double salary = 50000.75;
     System.out.printf("Age: %d, Salary: %.2f%n", age, salary);
     ```

2. **Format Specifiers**:
   - Format specifiers begin with `%` and are followed by a character that specifies the type of value to be inserted.
   - Common format specifiers:
     - `%d`: Integer
     - `%f`: Floating-point (double)
     - `%s`: String
     - `%n`: Newline
   - You can also control width, precision, alignment, and other formatting options using additional flags.
   - Example:
     ```java
     String name = "Alice";
     System.out.printf("Hello, %s! Your age is %d.%n", name, age);
     ```

3. **Precision and Width**:
   - You can specify the number of decimal places for floating-point numbers using `.2f` (for example, `%.2f`).
   - You can also set the minimum width for output (e.g., `%10s`).
   - Example:
     ```java
     double pi = 3.141592653589793;
     System.out.printf("Pi (rounded): %.2f%n", pi);
     ```

4. **Combining Values**:
   - You can combine multiple values in a single `printf()` statement.
   - Example:
     ```java
     System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);
     ```
---

![IMG_20240523_110041](https://github.com/Ro706/java_class/assets/60247178/020210a7-fdda-447b-8bdf-f74ccc9dac9a)
![IMG20240523110217](https://github.com/Ro706/java_class/assets/60247178/a9a71bd5-2f8b-436b-a1a0-8e0f5dc771c3)

# Date and Time Conversion Characters in Java

When working with date and time formatting in Java, you can use conversion characters to represent specific components of a date or time string. These characters are used within date and time pattern strings to format or parse date-time values. Below, I've provided a list of common conversion characters along with their meanings:

| Conversion Specifier | Description |
|----------------------|-------------|
| `%s` | Formats a string argument. |
| `%d` | Formats an integer (decimal) argument. |
| `%f` | Formats a floating-point (double) argument. |
| `%c` | Formats a character argument. |
| `%b` | Formats a boolean argument. |
| `%n` | Inserts a newline character. |
| `%t` | Formats date/time values (used with date/time patterns). |
| `%x` | Formats an integer as a hexadecimal number. |
| `%o` | Formats an integer as an octal number. |
| `%e` | Formats a floating-point number in scientific notation. |
| `%g` | Formats a floating-point number in either decimal or scientific notation. |

## Example Usage

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // Custom pattern using conversion characters
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}
```

Output:
```
Formatted DateTime: 2023-05-11 18:30:45
```
---
# File Input and Output in Java

File input and output (I/O) operations are essential for reading data from files and writing data to files. In Java, you can perform file I/O using the `java.nio.file` package. Let's explore how to read from and write to files efficiently:

## Reading from Files

1. **Reading All Bytes from a File**:
   - Use the `Files.readAllBytes(Path path)` method to read all bytes from a file into a byte array.
   - Example:
     ```java
     import java.nio.file.Files;
     import java.nio.file.Path;
     import java.io.IOException;

     public class ReadBytesExample {
         public static void main(String[] args) {
             try {
                 Path filePath = Path.of("sample.txt");
                 byte[] fileBytes = Files.readAllBytes(filePath);
                 System.out.println(new String(fileBytes));
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }
     ```

2. **Reading Lines from a Text File**:
   - Use the `Files.readAllLines(Path path)` method to read all lines from a text file into a list of strings.
   - Example:
     ```java
     import java.nio.file.Files;
     import java.nio.file.Path;
     import java.io.IOException;
     import java.util.List;

     public class ReadLinesExample {
         public static void main(String[] args) {
             try {
                 Path filePath = Path.of("sample.txt");
                 List<String> lines = Files.readAllLines(filePath);
                 for (String line : lines) {
                     System.out.println(line);
                 }
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }
     ```

## Writing to Files

1. **Writing Bytes to a File**:
   - Use the `Files.write(Path path, byte[] bytes)` method to write bytes to a file.
   - Example:
     ```java
     import java.nio.file.Files;
     import java.nio.file.Path;
     import java.io.IOException;

     public class WriteBytesExample {
         public static void main(String[] args) {
             try {
                 Path filePath = Path.of("output.txt");
                 byte[] data = "Hello, World!".getBytes();
                 Files.write(filePath, data);
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }
     ```

2. **Writing Lines to a Text File**:
   - Use the `Files.write(Path path, Iterable<? extends CharSequence> lines)` method to write lines to a text file.
   - Example:
     ```java
     import java.nio.file.Files;
     import java.nio.file.Path;
     import java.io.IOException;
     import java.util.List;

     public class WriteLinesExample {
         public static void main(String[] args) {
             try {
                 Path filePath = Path.of("output.txt");
                 List<String> lines = List.of("Line 1", "Line 2", "Line 3");
                 Files.write(filePath, lines);
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }
     ```

---
# Block Scope in Java

In Java, **block scope** refers to the visibility and accessibility of a variable declared inside a block of code enclosed in curly braces `{}`. Variables declared inside a block have a scope limited to that block only and are not accessible outside the block. Once the block is exited, the variable goes out of scope and is no longer accessible.

Here are some key points about block scope:

1. **Local Variables**:
   - Variables declared directly inside a method, constructor, or code block are local variables.
   - Local variables are accessible only within the block in which they are defined.
   - They do not exist outside their scope.

2. **Example**:
   ```java
   public class BlockScopeExample {
       public static void main(String[] args) {
           // Code here CANNOT use 'x'
           {
               // This is a block
               // Code here CANNOT use 'x'
               int x = 100;
               // Code here CAN use 'x'
               System.out.println(x);
           }
           // The block ends here
           // Code here CANNOT use 'x'
       }
   }
   ```

3. **Block Scope and Control Structures**:
   - A block of code may exist on its own or belong to an `if`, `while`, or `for` statement.
   - In the case of `for` statements, variables declared in the statement itself are also available inside the block's scope.

For Example: 
```java
public class BlockScopeExample {
    public static void main(String[] args) {
        // Code here CANNOT use 'x'
        {
            // This is a block
            // Code here CANNOT use 'x'
            int x = 100;
            // Code here CAN use 'x'
            System.out.println("Inside the block: " + x);
        }
        // The block ends here
        // Code here CANNOT use 'x'
    }
}
```
---
# Conditional Statements in Java

Conditional statements in Java allow you to make decisions in your program based on specific conditions. These statements control the flow of execution by executing different lines of code depending on whether a particular condition is true or false. Let's explore the main types of conditional statements in Java:

## 1. `if` Statement

The `if` statement is the most basic conditional statement. It allows you to execute a block of code only if a specified condition is true. The syntax is as follows:

```java
if (condition) {
    // Code to execute if the condition is true
}
```

Example:

```java
int age = 18;
if (age >= 18) {
    System.out.println("You are an adult.");
}
```

## 2. `if-else` Statement

The `if-else` statement extends the `if` statement by allowing you to specify an alternative block of code to execute if the condition is false. The syntax is:

```java
if (condition) {
    // Code to execute if the condition is true
} else {
    // Code to execute if the condition is false
}
```

Example:

```java
int temperature = 25;
if (temperature > 30) {
    System.out.println("It's hot outside.");
} else {
    System.out.println("It's not too hot.");
}
```

## 3. `if-else if-else` Statement

The `if-else if-else` statement allows you to test multiple conditions sequentially. It executes the first block of code whose condition is true. The syntax is:

```java
if (condition1) {
    // Code to execute if condition1 is true
} else if (condition2) {
    // Code to execute if condition2 is true
} else {
    // Code to execute if no condition is true
}
```

Example:

```java
int score = 75;
if (score >= 90) {
    System.out.println("Excellent!");
} else if (score >= 70) {
    System.out.println("Good job!");
} else {
    System.out.println("Keep practicing.");
}
```

## 4. `switch` Statement

The `switch` statement allows you to test a variable against multiple possible values. It provides an alternative to long chains of `if-else if` statements. The syntax is:

```java
switch (variable) {
    case value1:
        // Code to execute if variable equals value1
        break;
    case value2:
        // Code to execute if variable equals value2
        break;
    // ...
    default:
        // Code to execute if no case matches
}
```

Example:

```java
char grade = 'B';
switch (grade) {
    case 'A':
        System.out.println("Excellent!");
        break;
    case 'B':
        System.out.println("Good job!");
        break;
    default:
        System.out.println("Keep working hard.");
}
```
# Loops in Java

Loops in Java allow you to execute a block of code repeatedly based on a specified condition. They are essential for automating repetitive tasks and iterating over collections of data. Let's explore the main types of loops in Java:

## 1. `for` Loop

The `for` loop is commonly used for iterating over a range of values or elements in an array. It has the following syntax:

```java
for (initialization; condition; update) {
    // Code to execute repeatedly
}
```

- `initialization`: Initializes a loop control variable.
- `condition`: Specifies the condition for executing the loop.
- `update`: Updates the loop control variable after each iteration.

Example:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration " + i);
}
```

## 2. `while` Loop

The `while` loop repeatedly executes a block of code as long as a specified condition remains true. It has the following syntax:

```java
while (condition) {
    // Code to execute repeatedly
}
```

Example:

```java
int count = 0;
while (count < 3) {
    System.out.println("Count: " + count);
    count++;
}
```

## 3. `do-while` Loop

The `do-while` loop is similar to the `while` loop, but it always executes the block of code at least once, even if the condition is initially false. It has the following syntax:

```java
do {
    // Code to execute repeatedly
} while (condition);
```

Example:

```java
int num = 5;
do {
    System.out.println("Number: " + num);
    num--;
} while (num > 0);
```

## 4. Enhanced `for` Loop (for-each)

The enhanced `for` loop (also known as the for-each loop) simplifies iterating over elements in an array or collection. It has the following syntax:

```java
for (type variable : collection) {
    // Code to execute for each element
}
```

Example:

```java
String[] fruits = { "Apple", "Banana", "Orange" };
for (String fruit : fruits) {
    System.out.println("Fruit: " + fruit);
}
```
---
# BigInteger in Java

In Java, the `BigInteger` class is a powerful tool for handling large integer values that exceed the capacity of primitive data types (such as `int` or `long`). It allows you to perform arithmetic operations on integers of practically unlimited size, constrained only by available memory. Here are some key points about `BigInteger`:

1. **Arbitrary Precision**:
   - `BigInteger` represents arbitrary-precision integers.
   - Unlike primitive data types, it dynamically allocates memory as needed to store large numbers.
   - It can handle integers of any size, limited only by available memory.

2. **Immutable and Precise**:
   - `BigInteger` objects are immutable, meaning their values cannot be changed after creation.
   - They provide precise results for arithmetic operations without loss of information.

3. **Initialization**:
   - You can create a `BigInteger` using various constructors:
     - `BigInteger(String val)`: Initializes from a string representation.
     - `BigInteger(long val)`: Initializes from a `long` value.
     - `BigInteger(byte[] val)`: Initializes from a byte array.

4. **Common Operations**:
   - `add(BigInteger val)`: Returns a `BigInteger` whose value is the sum of this and `val`.
   - `subtract(BigInteger val)`: Returns a `BigInteger` whose value is the difference between this and `val`.
   - `multiply(BigInteger val)`: Returns a `BigInteger` whose value is the product of this and `val`.
   - `divide(BigInteger val)`: Returns a `BigInteger` whose value is the integer division of this by `val`.
   - `remainder(BigInteger val)`: Returns a `BigInteger` whose value is the remainder of this divided by `val`.

5. **Comparison and Equality**:
   - `compareTo(BigInteger val)`: Compares this `BigInteger` with the specified `BigInteger`.
   - `equals(Object obj)`: Checks if this `BigInteger` is equal to the specified object.

6. **Other Methods**:
   - `abs()`: Returns the absolute value of this `BigInteger`.
   - `bitCount()`: Returns the number of bits in the two's complement representation.
   - `toString()`: Converts this `BigInteger` to a string.

`BigInteger` is commonly used in scenarios where precision matters, such as cryptography, large factorials, and competitive programming. It provides a robust solution for handling large integer calculations! 
```java
import java.math.BigInteger;

public class FactorialExample {
    public static void main(String[] args) {
        int N = 20; // Calculate factorial for N

        // Calculate N!
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= N; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + N + " is:");
        System.out.println(factorial);
    }
}
```

---
# Arrays in Java

## Introduction
An array in Java is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed. Each item in an array is called an element, and each element is accessed by its numerical index.

## Declaring an Array

To declare an array in Java, you define the variable type with square brackets.

```java
// Declare an array of integers
int[] anArray;

// Declare an array of strings
String[] aStringArray;
```

## Creating an Array

After declaring an array, you need to instantiate it with the `new` keyword.

```java
// Instantiate an array of integers with 10 elements
anArray = new int[10];

// Instantiate an array of strings with 5 elements
aStringArray = new String[5];
```

You can also combine declaration and instantiation.

```java
int[] anArray = new int[10];
String[] aStringArray = new String[5];
```

## Initializing an Array

Arrays can be initialized when they are declared.

```java
int[] anArray = {1, 2, 3, 4, 5};
String[] aStringArray = {"Hello", "World"};
```

## Accessing Array Elements

Array elements are accessed using their index, which starts from `0`.

```java
int firstElement = anArray[0]; // Access the first element
String firstString = aStringArray[0]; // Access the first string
```

You can also update an array element using its index.

```java
anArray[0] = 10; // Update the first element to 10
aStringArray[0] = "Hi"; // Update the first string to "Hi"
```

## Array Length

The length of an array can be obtained using the `length` property.

```java
int arrayLength = anArray.length;
System.out.println("Array Length: " + arrayLength);
```

## Iterating Through an Array

You can iterate through an array using a `for` loop or an enhanced `for` loop.

### Using a `for` loop

```java
for (int i = 0; i < anArray.length; i++) {
    System.out.println(anArray[i]);
}
```

### Using an enhanced `for` loop

```java
for (int element : anArray) {
    System.out.println(element);
}
```

## Multidimensional Arrays

Java supports multidimensional arrays, commonly known as arrays of arrays. 

### Declaring a Two-Dimensional Array

```java
int[][] twoDimensionalArray;
```

### Creating a Two-Dimensional Array

```java
twoDimensionalArray = new int[3][4]; // 3 rows and 4 columns
```

### Initializing a Two-Dimensional Array

```java
int[][] twoDimensionalArray = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```

### Accessing Elements in a Two-Dimensional Array

```java
int value = twoDimensionalArray[0][1]; // Accesses the second element in the first row
```

### Iterating Through a Two-Dimensional Array

```java
for (int i = 0; i < twoDimensionalArray.length; i++) {
    for (int j = 0; j < twoDimensionalArray[i].length; j++) {
        System.out.println(twoDimensionalArray[i][j]);
    }
}
```
# Object-Oriented Programming in Java

## Introduction
Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects," which can contain data and code that manipulates the data. Java is a popular object-oriented programming language that provides robust support for OOP principles: encapsulation, inheritance, polymorphism, and abstraction.

## Principles of OOP

### Encapsulation
Encapsulation is the mechanism of restricting access to certain details of an object and only exposing essential features. This is achieved using access modifiers (`private`, `protected`, `public`) and methods (getters and setters).

```java
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

### Inheritance
Inheritance allows a new class to inherit properties and methods from an existing class. The existing class is called the superclass, and the new class is called the subclass.

```java
public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

// Usage
Dog dog = new Dog();
dog.eat();  // Inherited method
dog.bark(); // Subclass method
```

### Polymorphism
Polymorphism enables a single action to behave differently based on the object that it is acting upon. It can be achieved through method overriding and method overloading.

#### Method Overriding

```java
public class Animal {
    public void sound() {
        System.out.println("This animal makes a sound.");
    }
}

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Usage
Animal myAnimal = new Dog();
myAnimal.sound(); // The dog barks.
```

#### Method Overloading

```java
public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Usage
MathUtils math = new MathUtils();
int sum1 = math.add(5, 10); // 15
double sum2 = math.add(5.5, 10.5); // 16.0
```

### Abstraction
Abstraction involves hiding the complex implementation details and showing only the necessary features of an object. It can be achieved using abstract classes and interfaces.

#### Abstract Classes

```java
public abstract class Shape {
    abstract void draw();
}

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Usage
Shape shape = new Circle();
shape.draw(); // Drawing a circle.
```

#### Interfaces

```java
public interface Animal {
    void eat();
    void sleep();
}

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat eats.");
    }

    @Override
    public void sleep() {
        System.out.println("The cat sleeps.");
    }
}

// Usage
Animal cat = new Cat();
cat.eat();   // The cat eats.
cat.sleep(); // The cat sleeps.
```

## Conclusion
Object-oriented programming in Java provides a clear modular structure for programs, making it easier to maintain and modify existing code. The four key principles of OOP—encapsulation, inheritance, polymorphism, and abstraction—allow developers to create more flexible, scalable, and manageable software. Understanding these principles and their implementation in Java is crucial for effective Java programming.

---
## Declaring  Local variables with var
As of java 10,you can declare local variables with the var keyword instead of specifying their type , provided their type can be inferred form the initial value.For example , instead of declaring
```java
Employee harry = new Employee("Harry hacker",55000,1989,10,1);
```
you simply write 
```java
var harry = new Employee("Harry hacker",55000,1989,10,1);
```
This is nice since it avoids the repetition of the type name Employee

---
--Made by Ro706
