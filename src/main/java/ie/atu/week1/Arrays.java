package ie.atu.week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args)
    {
        //declares an array of integers
        ArrayList<Integer> myList = new ArrayList<>();

        //initialise first element
        myList.add(100);

        //initialise second element
        myList.add(200);

        //initialise other elements
        myList.add(300);
        myList.add(400);
        myList.add(500);
        myList.add(600);
        myList.add(700);
        myList.add(800);
        myList.add(900);
        myList.add(1000);

        loop(myList);

        Scanner myScan = new Scanner(System.in);

        try{
            System.out.println("Please enter a new number: ");
            myList.add(myScan.nextInt());
            loop(myList);
        }
        catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("We went outside of our allocated memory block");
        }

    }
    public static void loop(ArrayList<Integer> someArrayList){

        int indexValue = 0;
        for (int value: someArrayList)
        {
            System.out.println("Element at index " + indexValue + " : " + value);
            indexValue++;
        }
    }
}
