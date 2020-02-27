package stegPlusSoftwares.GUI.AdvancedJavaCat.EXCEPTIONS;

import java.util.Scanner;

public class NegativeNumberException extends Exception{
    public NegativeNumberException()
    {
        super("Negative Number is Not Allowed");
    }
    public NegativeNumberException(String message)
    {
        super(message);
    }

    public static  void main(String [] args)
    {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a non negative number");
        int number = input.nextInt();
        if (number < 0)
        {
            try
            {
                throw new NegativeNumberException();
                //throw new NegativeNumberException("You have not entered the correct number");
            }
            catch(NegativeNumberException ex)
            {
                System.out.println(ex.getMessage());
            }
        }else
            System.out.println("Number entered is: "+number);
    }

}
