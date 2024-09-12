/*
In this class, we will implement a method to convert a binary to its Decimal Equivalent
using recursion
Program Owner -> Ojas Joshi
Date -> 11/09/2024
 */
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.INPUT_STRING);
        String inputString = scan.nextLine();
        if(binaryToDecimal(inputString,0) == -1){
            System.out.println(Constants.INVALID_INPUT);
        }
        else {
            System.out.print(Constants.DESIRED_OUTPUT);
            System.out.println(binaryToDecimal(inputString, 0));
        }
    }
    // Convert a Binary Number to its Decimal Equivalent
    // Input -> String
    // Return type -> Long Integer
    public static long binaryToDecimal(String inputString,long value){
        int n = inputString.length();
        if(n == 0){
            return value ;
        }
        if(Character.getNumericValue(inputString.charAt(0)) == 1 ||
                Character.getNumericValue(inputString.charAt(0)) == 0) {
            value = value + (long) Character.getNumericValue(inputString.charAt(0)) * (int) Math.pow(2, n - 1);
        }
        else{
            return -1;
        }
        return binaryToDecimal(inputString.substring(1),value);
    }
}
