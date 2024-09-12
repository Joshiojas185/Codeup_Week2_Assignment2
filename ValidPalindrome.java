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
    public static int countPalindrome(String s , int count) {
        if(s.length() == 1){
            return count + 1;
        }
        if (s.isBlank()) {
            return count ;
        }
        if (isValidPalindrome(s)){
                count++;
            }
        if(s.charAt(0) == s.charAt(s.length()-1)){
                count++;
        }
        else{
                count = count + 2;
            }
        return countPalindrome(s.substring(1,s.length()-1),count);
        }
        public static boolean isValidPalindrome(String s){

        if(s.isEmpty() || s.length() == 1){
            return true;
        }
            if(s.charAt(0) == s.charAt(s.length()-1)){
                return isValidPalindrome(s.substring(1,s.length()-1));
            }
            else{
                return false;
            }
    }
}
