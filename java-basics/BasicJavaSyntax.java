public class BasicJavaSyntax {
    public static void main(String[] args) {
        // Conditional Statements (if-else)
        int num = 10;
        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // Switch Statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            // Add cases for other days as needed
            default:
                System.out.println("Invalid day");
        }

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array length: " + numbers.length);
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Looping (for loop)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Looping (enhanced for loop)
        for (int numm : numbers) {
            System.out.println("Element: " + numm);
        }

        // String Manipulation
        String str = "Hello, World!";
        System.out.println("Length of the string: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(7));

        // Logical Operators (contd.)
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("Logical AND: " + (condition1 && condition2));
        System.out.println("Logical OR: " + (condition1 || condition2));
        System.out.println("Logical NOT: " + !condition1);
    }
}