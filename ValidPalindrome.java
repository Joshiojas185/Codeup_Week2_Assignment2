/*
In this class, we will implement a method to find number of unique valid Palindrome using recursion
Program Owner -> 11/09/2024
Date -> Ojas Joshi
 */
import java.util.Scanner;
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.INPUT_STRING);
        String inputString = scan.nextLine();
        System.out.print(Constants.NO_OF_PALINDROME);
        System.out.println(countPalindrome(inputString,0));

    }
    // Count No of Unique Palindrome
    // Input -> String
    // Return type -> Integer
    public static int countPalindrome(String inputString , int count) {
        if(inputString.length() == 1){
            return count + 1;
        }
        if (inputString.isBlank()) {
            return count ;
        }
        if (isValidPalindrome(inputString)){
                count++;
        }
        if(inputString.charAt(0) == inputString.charAt(inputString.length()-1)){
                count++;
        }
        else{
                count = count + 2;
        }
        return countPalindrome(inputString.substring(1,inputString.length()-1),count);
        }
        // Return whether the input String is a Palindrome or not
        // Input -> String
        // Return type -> Boolean
        public static boolean isValidPalindrome(String inputString){
        if(inputString.isEmpty() || inputString.length() == 1){
            return true;
        }
            if(inputString.charAt(0) == inputString.charAt(inputString.length()-1)){
                return isValidPalindrome(inputString.substring(1,inputString.length()-1));
            }
            else{
                return false;
            }
    }
}
