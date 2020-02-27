package stegPlusSoftwares.GUI.AdvancedJavaCat.FILE_WRITERS;

import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileCreator {
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the name of the text file you want to create: ");
        String file_name = input.nextLine().trim(); //trimming to truncate leading and trailing spaces

        // Create a regular expression to check the validity of the filename entered by the user
        Pattern filePtrn = Pattern.compile("([^\\s]+(\\.(?i)(txt))$)");
       // Search for the occurrence of the filePtrn regex in the file_name
        Matcher mtch = filePtrn.matcher(file_name);

        Scanner inputStream = null;
        PrintWriter outputStream = null;

        String file_location = "C:\\Users\\stegPlus\\IdeaProjects\\MyProjects\\src\\stegPlusSoftwares\\GUI\\AdvancedJavaCat\\FILE_WRITERS\\";

            // connecting to the streams if regex matching evaluates to true
            if (mtch.matches() && file_name != "") {
                try {
                    outputStream = new PrintWriter(new FileOutputStream(file_location + file_name));
                    inputStream = new Scanner(new FileInputStream(file_location + file_name));
                    System.out.println(file_name + " file created");
                } catch (FileNotFoundException e) {
                    System.out.println("The file could not be created");
                    System.exit(0);
                }
            } else {
                System.out.println("Invalid file format");
                System.out.println("Exiting...");
                System.exit(0);
            }


        // getting the user input sentences and writing them to the file
        System.out.println("Enter 5 sentences to print to the file :");
        Scanner sc = new Scanner(System.in);
        String sentences[] = new String[5]; // create an empty array to hold the 5 sentences
        for (int i=0; i<sentences.length; i++){
            sentences[i] = sc.nextLine().trim();
            outputStream.println(sentences[i]);

        }
        outputStream.close();

        // getting the input sentences from the file
        System.out.println("\nThe numbers from "+file_name+" are: ");
        int count = 0;
        while (inputStream.hasNextLine()){
            String next = inputStream.nextLine();
            System.out.println(count+1+". "+next);
            count++;
        }
        inputStream.close();



    }

}
