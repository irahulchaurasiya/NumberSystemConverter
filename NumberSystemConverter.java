import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ADVANCED NUMBER SYSTEM CONVERTER");
        int choice;
        do {
            printMenu();
            try {
                System.out.print("Enter your choice (1-9): ");
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
                System.out.println();
                scanner.nextLine(); 
                choice = 0; 
            }

            switch (choice) {
                case 1:
                    convertDecimalToBinary();
                    break;
                case 2:
                    convertDecimalToOctal();
                    break;
                case 3:
                    convertDecimalToHexadecimal();
                    break;
                case 4:
                    convertBinaryToDecimal();
                    break;
                case 5:
                    convertOctalToDecimal();
                    break;
                case 6:
                    convertHexadecimalToDecimal();
                    break;
                case 7:
                    convertBinaryToOctalAndHexadecimal();
                    break;
                case 8:
                    convertOctalToBinaryAndHexadecimal();
                    break;
                case 9:
                    convertHexadecimalToBinaryAndOctal();
                    break;
                case 10:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 10.");
                    System.out.println();
            }
        } while (choice != 10);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to Hexadecimal");
        System.out.println("4. Binary to Decimal");
        System.out.println("5. Octal to Decimal");
        System.out.println("6. Hexadecimal to Decimal");
        System.out.println("7. Binary to Octal and Hexadecimal");
        System.out.println("8. Octal to Binary and Hexadecimal");
        System.out.println("9. Hexadecimal to Binary and Octal");
        System.out.println("10. Exit");
    }

    private static void convertDecimalToBinary() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a decimal number: ");
            int decimalNumber = scanner.nextInt();
            System.out.println("Binary: " + Integer.toBinaryString(decimalNumber));
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
            System.out.println();
        }
    }

    private static void convertDecimalToOctal() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a decimal number: ");
            int decimalNumber = scanner.nextInt();
            System.out.println("Octal: " + Integer.toOctalString(decimalNumber));
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
            System.out.println();
        }
    }

    private static void convertDecimalToHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a decimal number: ");
            int decimalNumber = scanner.nextInt();
            System.out.println("Hexadecimal: " + Integer.toHexString(decimalNumber).toUpperCase());
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
            System.out.println();
        }
    }

    private static void convertBinaryToDecimal() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a binary number: ");
            String binaryNumber = scanner.next();
            System.out.println("Decimal: " + Integer.parseInt(binaryNumber, 2));
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid binary number.");
            System.out.println();
        }
    }

    private static void convertOctalToDecimal() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an octal number: ");
            String octalNumber = scanner.next();
            System.out.println("Decimal: " + Integer.parseInt(octalNumber, 8));
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid octal number.");
            System.out.println();
        }
    }

    private static void convertHexadecimalToDecimal() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a hexadecimal number: ");
            String hexNumber = scanner.next();
            System.out.println("Decimal: " + Integer.parseInt(hexNumber, 16));
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid hexadecimal number.");
            System.out.println();
        }
    }

    private static void convertBinaryToOctalAndHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a binary number: ");
            String binaryNumber = scanner.next();
            int decimalEquivalent = Integer.parseInt(binaryNumber, 2);
            System.out.println("Octal: " + Integer.toOctalString(decimalEquivalent));
            System.out.println("Hexadecimal: " + Integer.toHexString(decimalEquivalent).toUpperCase());
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid binary number.");
            System.out.println();
        }
    }

    private static void convertOctalToBinaryAndHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an octal number: ");
            String octalNumber = scanner.next();
            int decimalEquivalent = Integer.parseInt(octalNumber, 8);
            System.out.println("Binary: " + Integer.toBinaryString(decimalEquivalent));
            System.out.println("Hexadecimal: " + Integer.toHexString(decimalEquivalent).toUpperCase());
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid octal number.");
            System.out.println();
        }
    }

    private static void convertHexadecimalToBinaryAndOctal() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a hexadecimal number: ");
            String hexNumber = scanner.next();
            int decimalEquivalent = Integer.parseInt(hexNumber, 16);
            System.out.println("Binary: " + Integer.toBinaryString(decimalEquivalent));
            System.out.println("Octal: " + Integer.toOctalString(decimalEquivalent));
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid hexadecimal number.");
            System.out.println();
        }
    }
}
