// class NGP {
//     public static void main(String[] args) {
//         System.out.println(args[0]);
//     }
// }



// String class in java 
// The string classs in java is used to create and manipulate sequences of characters.
// it is one of the most commonly used classes in java and provides a wide range of methods for working with strings.
// Strings in java are immutable, meaning that once a string is created, it cannot be changed

// Key features of the string class in java include:
// 1. Immutability: Strings are immutable, meaning that once a string is created, it cannot be changed. Any operation that modifies a string creates a new string object.
// example:
// public class NGP {
//     public static void main(String[] args) {
//         String str = "Hello";
//         str = str + " World"; // creates a new string object
//         // str.charAt(0) = 'H'; compile time error
//         System.out.println(str); // Output: Hello World
    // }
// }


// thread-safe: The string class is thread-safe, meaning that multiple threads can access a string object simultaneously without causing data corruption.
// string in java is thread safe because it's immutable, allowing safe access by multiple threads without synchronization.
// example:


public class NGP {
    public static void main(String[] args) {
    String str = "Hello NGP";
    System.out.println("Length of string " + str.length());
    System.out.println("change case = " + str.toUpperCase());
}
    
}