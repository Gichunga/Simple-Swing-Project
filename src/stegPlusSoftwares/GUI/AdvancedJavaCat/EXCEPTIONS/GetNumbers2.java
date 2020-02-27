package stegPlusSoftwares.GUI.AdvancedJavaCat.EXCEPTIONS;

import java.util.Scanner;
import java.util.InputMismatchException;
public class GetNumbers2 {
    public static void main(String [] args) throws InputMismatchException
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter the first non negative number: ");
        int firstNumber = stdin.nextInt();
        System.out.println("Enter the second non negative number: ");
        int secondNumber = stdin.nextInt();
        System.out.println("Your numbers are "+ firstNumber+" and "+secondNumber);
        try {
            if ((firstNumber < 0) || (secondNumber < 0)) {
                throw new
                        InputMismatchException("One of the numbers is negative!!!");
            }
        }catch (InputMismatchException e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
