package ie.atu.week1;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args)
    {
        //declares an array of integers
        int[] anArray;

        //allocates memory for 10 integers
        anArray = new int[10];

        //initialise first element
        anArray[0] = 100;
        //initialise second element
        anArray[1] = 200;
        //initialise other elements
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;


        int indexValue = 0;
        for(int value: anArray){
            System.out.println("Element at index " + indexValue " : " + value);
            indexValue++;
        }


        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter a new number: ");
        anArray[10] = myScan.nextInt();

    }
}
