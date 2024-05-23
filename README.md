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

Feel free to customize this example for your own input requirements! 😊

---



