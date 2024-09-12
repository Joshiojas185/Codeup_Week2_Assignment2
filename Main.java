/*
In this Main class, we will access all the methods created which are :
countPalindrome, convertSnakeToCamelCase, CountConsonants, NthFibonacci Sequence,
BinaryToDecimal Conversion
Program Owner -> Ojas Joshi
Date -> 11/09/2024
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.OPERATION_CHOICES);
        do {
            try {
                System.out.println(Constants.CHOOSE_OPERATION);
                String choice = scan.nextLine();
                switch (choice) {
                    case "1" -> {
                        // Count No of Unique Palindrome
                        // Input -> String
                        // Return type -> Integer
                        System.out.println(Constants.INPUT_STRING);
                        String inputString = scan.nextLine();
                        System.out.print(Constants.NO_OF_PALINDROME);
                        System.out.println(ValidPalindrome.countPalindrome(inputString,0));
                    }
                    case "2" -> {
                        // Returns the Nth Fibonacci Number from Fibonacci Sequence
                        // Input -> Integer
                        // Return type -> Integer
                        System.out.println(Constants.INPUT_SEQUENCE);
                        int count = scan.nextInt();
                        scan.nextLine();

                        boolean check = true;
                        if (count == 1 || count == 2) {
                            System.out.print(Constants.DESIRED_OUTPUT);
                            System.out.println(1);
                            check = false;
                        }
                        if (count <= 0) {
                            System.out.println(Constants.INVALID_INPUT);
                            check = false;
                        }
                        if (check) {
                            count = count - 2;
                            System.out.print(Constants.DESIRED_OUTPUT);
                            System.out.println(FibonacciSequence.fibonacciSequence(count, 1, 1));
                        }
                    }
                    case "3" -> {
                        // Convert the String to its Camel Case Equivalent
                        // Input -> String
                        // Return type -> String
                        System.out.println(Constants.INPUT_STRING);
                        String inputString =  scan.nextLine();
                        String camelCaseString = SnakeToCamel.snakeToCamelCase(inputString, "", 0);
                        System.out.println(Constants.CAMEL_CASE_STRING + camelCaseString);
                    }
                    case "4" -> {
                        // Count Number of Consonants in a String
                        // Input -> String
                        // Return type -> Integer
                        System.out.println(Constants.INPUT_STRING);
                        String input = scan.nextLine();
                        int consonantCount = 0;
                        System.out.print(Constants.NO_OF_CONSONANTS);
                        System.out.println(CountConsonants.countConsonants(input, consonantCount));
                    }
                    case "5" -> {
                        // Convert a Binary Number to its Decimal Equivalent
                        // Input -> String
                        // Return type -> Long Integer
                        System.out.println(Constants.INPUT_STRING);
                        String inputString = scan.nextLine();
                        if(BinaryToDecimal.binaryToDecimal(inputString,0) == -1){
                            System.out.println(Constants.INVALID_INPUT);
                        }
                        else {
                            System.out.print(Constants.DESIRED_OUTPUT);
                            System.out.println(BinaryToDecimal.binaryToDecimal(inputString, 0));
                        }
                    }
                    case "0" ->
                        System.out.println(Constants.EXIT_MESSAGE);

                    default -> System.out.println(Constants.INVALID_INPUT);
                }

                if (choice.equals("0")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println(Constants.ERROR_HANDLING);
                scan.nextLine();
            }
        }
        while(true);
    }
}
