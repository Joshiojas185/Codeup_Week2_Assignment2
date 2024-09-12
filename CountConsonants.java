/*
In this Class , we will implement a method to calculate no of consonats in a string
using recursion
Program Owner -> Ojas Joshi
Date -> 11/09/2024
 */
import java.util.Scanner;

public class CountConsonants {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.INPUT_STRING);
        String input = scan.nextLine();
        int count = 0;
        System.out.print(Constants.NO_OF_CONSONANTS);
        System.out.println(countConsonants(input,count));

    }
    // Count Number of Consonants in a String
    // Input -> String
    // Return type -> Integer
    public static int countConsonants(String inputString,int count){
        if(inputString.isEmpty()){
            return count;
        }
        if(isConsonant(inputString.charAt(0)))
        {
                   count++;
        }
        return countConsonants(inputString.substring(1),count);
    }
    public static boolean isConsonant(char character){
        return character == 'b' || character == 'c' || character == 'd' || character == 'y'
                || character == 'f' || character == 'g' || character == 'h' || character == 'j'
                || character == 'k' || character == 'l' || character == 'm' || character == 'n'
                || character == 'p' || character == 'q' || character == 'r' || character == 's'
                || character == 't' || character == 'v' || character == 'w' || character == 'x'
                || character == 'z' || character == 'B' || character == 'C' || character == 'D'
                || character == 'F' || character == 'G' || character == 'H' || character == 'Z'
                || character == 'J' || character == 'K' || character == 'L' || character == 'M'
                || character == 'N' || character == 'R' || character == 'P' || character == 'Q'
                || character == 'S' || character == 'T' || character == 'V' || character == 'W'
                || character == 'X' || character == 'Y';

    }
}
