/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int input) {
        int thomas = (input * input);
        return thomas;
}
    public static void main(String[] args) {
        // Put scanner code to get integer input here

        System.out.println("Type a number please comrade. ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // Modify the below call to assign the result of the method call to a variable.

        int thomas = square(input);
        // Put the result System.out code here.
        System.out.println(thomas);
    }
}
