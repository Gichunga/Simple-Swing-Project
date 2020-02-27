package stegPlusSoftwares.GUI.AdvancedJavaCat.FILE_WRITERS;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;


public class FileInput{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;

    public static void main(String [] args)
    {
        Scanner inputStream = null;
        PrintWriter outputStream = null;

        try
        {
            inputStream = new Scanner(new FileInputStream("C:\\Users\\stegPlus\\IdeaProjects\\MyProjects\\src\\stegPlusSoftwares\\GUI\\AdvancedJavaCat\\FILE_WRITERS\\outputFile.txt"));
            outputStream = new PrintWriter(new FileOutputStream("C:\\Users\\stegPlus\\IdeaProjects\\MyProjects\\src\\stegPlusSoftwares\\GUI\\AdvancedJavaCat\\FILE_WRITERS\\outputFile.txt"));

        }
        catch(FileNotFoundException ex)
        {
            System.out.println("The file could not be created\nExiting...");
            System.exit(0);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer n greater than 0 : ");
        int n = input.nextInt();
        int count = 0;

        if (n <= 0)
        {
            System.out.println("The number should be greater than 0 !!!");

        }
        else
            while (count < n)
            {
                outputStream.print(count+1+" ");
                count++;

            }
            outputStream.close();

            int next;
        System.out.print("\nThe numbers from the file are: ");
        while(inputStream.hasNextInt())
            {
                next = inputStream.nextInt();
                System.out.print(next+" ");
            }
        inputStream.close();

    }


}
