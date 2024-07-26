/**
Explanation of Key Classes
Throwable: The superclass of all errors and exceptions in Java. Only instances of this class (or its subclasses) can be thrown or caught.

Error: Indicates serious problems that a reasonable application should not try to catch. Errors are generated to indicate that something serious has gone wrong, often a problem with the JVM itself (e.g., OutOfMemoryError).

VirtualMachineError: Thrown to indicate that the JVM is broken or has run out of resources.
StackOverflowError: Thrown when a stack overflow occurs due to deep recursion.
OutOfMemoryError: Thrown when the JVM cannot allocate more memory.
LinkageError: Thrown when a class has some dependency on another class and that dependency has changed incompatibly after the class was compiled.
NoClassDefFoundError: Thrown when the JVM tries to load a class that is not present.
Exception: Indicates conditions that a reasonable application might want to catch. There are two types of exceptions: checked exceptions and unchecked exceptions.

RuntimeException: Unchecked exceptions that indicate programming errors, such as logic bugs or improper use of an API. These exceptions are not required to be caught or declared in a throws clause.

ArithmeticException: Thrown when an exceptional arithmetic condition has occurred, e.g., divide by zero.
ArrayIndexOutOfBoundsException: Thrown to indicate that an array has been accessed with an illegal index.
ClassCastException: Thrown to indicate that the code has attempted to cast an object to a subclass that it is not an instance of.
IllegalArgumentException: Thrown to indicate that a method has been passed an illegal or inappropriate argument.
IllegalStateException: Thrown to indicate that a method has been invoked at an illegal or inappropriate time.
NullPointerException: Thrown when an application attempts to use null in a case where an object is required.
NumberFormatException: Thrown to indicate that an application has attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format.
UnsupportedOperationException: Thrown to indicate that the requested operation is not supported.
IOException: Checked exceptions that occur during input and output operations.

FileNotFoundException: Thrown to indicate that an attempt to open the file denoted by a specified pathname has failed.
EOFException: Thrown to indicate that an end of file or end of stream has been reached unexpectedly during input.
SQLException: Checked exception that provides information on a database access error or other errors.

ClassNotFoundException: Checked exception that is thrown when an application tries to load in a class through its string name but no definition for the class with the specified name could be found.

InterruptedException: Checked exception that is thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted.
*/

public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        try {
            // Generate an ArithmeticException
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        try {
            // Generate a NullPointerException
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        try {
            // Generate an ArrayIndexOutOfBoundsException
            int[] array = new int[5];
            int number = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // Generate a NumberFormatException
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        try {
            // Generate a checked exception (FileNotFoundException)
            java.io.FileReader reader = new java.io.FileReader("nonexistentfile.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        // Custom exception handling
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " + e.getMessage());
        }
    }

    // Custom checked exception
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}
