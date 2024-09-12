/*
In this class, we will implement a method to calculate the Nth Fibonacci Sequence using recursion
Program Owner -> Ojas Joshi
Date -> 11/09/2024
 */
import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.INPUT_SEQUENCE);
        try {
        int count = scan.nextInt();
        boolean check  = true ;
        if(count == 1 || count == 2){
            System.out.print(Constants.DESIRED_OUTPUT);
            System.out.println(1);
            check = false;
        }
        if(count <= 0){
            System.out.println(Constants.INVALID_INPUT);
            check = false;
        }
        if(check) {
            count = count - 2;
            System.out.print(Constants.DESIRED_OUTPUT);
            System.out.println(fibonacciSequence(count, 1, 1));
        }}
        catch(Exception e){
            System.out.println(Constants.INVALID_INPUT);
        }
    }
    // Returns the Nth Fibonacci Number from Fibonacci Sequence
    // Input -> Integer
    // Return type -> Long Integer
    public static long fibonacciSequence(long count, long first , long second){
        long third = first + second;
        first = second;
        second = third ;
        count-- ;
        if(count == 0){
            return third;
        }
        return fibonacciSequence(count,first,second);
    }
}
