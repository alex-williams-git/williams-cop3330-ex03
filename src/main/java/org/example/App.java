package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
            System.out.print("What is the quote? ");

            Scanner scan = new Scanner(System.in);
            String quote = scan.nextLine();

            System.out.print("Who said it? ");
            String name = scan.nextLine();

            System.out.println(name + " says, " + "\"" + quote + "\"");
    }
}
