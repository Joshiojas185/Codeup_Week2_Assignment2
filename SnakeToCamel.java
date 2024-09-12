/*
In this class, we will implement a method to convert a string to camel case using recursion
Program Owner -> Ojas Joshi
Date -> 11/09/2024
 */
import java.util.Scanner;
public class SnakeToCamel {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println(Constants.INPUT_STRING);
            String inputString =  scan.nextLine();
            inputString = inputString.substring(countFirstWhiteSpace(inputString,0));
            String camelCaseString = snakeToCamelCase(inputString, "", 0);
            System.out.println(Constants.CAMEL_CASE_STRING + camelCaseString);
        }
         // Convert the String to its Camel Case Equivalent
         // Input -> String
         // Return type -> String
        public static String snakeToCamelCase(String inputString, String output, int count) {
            if (inputString.isEmpty()) {
                return output;
            }
            if ( inputString.charAt(0) == ' ' ||  inputString.charAt(0) == '_') {
                count = 1;
            } else {
                if (count == 1) {
                    output = output + Character.toUpperCase(inputString.charAt(0));
                    count = 0;
                } else {
                    output = output + Character.toLowerCase(inputString.charAt(0));
                }
            }
            return snakeToCamelCase(inputString.substring(1), output, count);
        }
    public static int countFirstWhiteSpace(String inputString,int count){
        if(inputString.charAt(0)==' ' || inputString.charAt(0) == '-'){
            count++;
            return countFirstWhiteSpace(inputString.substring(1),count);
        }
        else{
            return count;
        }
    }
    }



