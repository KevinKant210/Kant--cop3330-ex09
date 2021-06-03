package E_09;

import java.util.Scanner;
/**
 * *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  *  Copyright 2021 Kevin Kant
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final int gallon = 350;
        int dimensions, numgallons = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print( "What is the length: " );
        dimensions = reader.nextInt();
        System.out.print("What is the width: ");
        dimensions *= reader.nextInt();

        while(dimensions != 0 ){
            dimensions /= gallon;
            numgallons++;
        }

        System.out.println("You will need " + numgallons + " gallons of paint");
    }
}
