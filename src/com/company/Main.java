package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueFactoring = true;

        while(continueFactoring == true) {
            int counter = 0;
            String factors = "";
            int numberToFactor = 0;

            System.out.print("Enter a number to be factored or 0 to exit: ");

            String enteredString = sc.next();

            // in case something that isn't a number is entered
            try {
                numberToFactor = Integer.valueOf(enteredString);
            } catch (Exception e) {
                continue;
            }

            // calculate the factors and concatenate to 'factors' variable for output
            if(numberToFactor>0) {
                for (int i = 1; i <= numberToFactor; i++) {
                    if (numberToFactor % i == 0) {
                        counter++;
                        if (i < numberToFactor) factors += i + ", ";
                        else factors += "and " + i + ".";
                    }
                }
            } else {
                for (int i = -1; i >= numberToFactor; i--) {
                    if (numberToFactor % i == 0) {
                        counter++;
                        if (i > numberToFactor) factors += i + ", ";
                        else factors += "and " + i + ".";
                    }
                }
            }

            // output as appropriate
            if(numberToFactor == 0) continueFactoring = false;
            else if(counter < 2) System.out.println("The number cannot be factored.");
            else if(counter == 2) System.out.println(numberToFactor + " is prime.");
            else System.out.println("The factors of " + numberToFactor + " are " + factors);
        }
        sc.close();
    }
}