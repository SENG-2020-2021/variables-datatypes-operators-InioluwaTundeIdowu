//package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // kindly use appropriate data types for your declaration

        // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them

        int defaultedDays = 10;
        int amountPerDay = 1000;
        int amountPaid = 3000;


        //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for

     
        int numOfDaysPaid;
        int amountToPay;
        int daysToPay;
        int amountLeftToPay;

        // calculate and print total amount the debtor is to pay
        amountToPay = defaultedDays * amountPerDay;
        System.out.println("The amount to pay is " + amountToPay);


        // calculate and print the days the debtor paid for
        numOfDaysPaid = amountPaid / amountPerDay;
        System.out.println("The number of days paid for is " + numOfDaysPaid + " day(s)");

        // calculate and print the amount whose day was not captured because the amount was incomplete
        int incompleteAmount=amountPaid%amountPerDay;
        System.out.println("The incomplete amount not captured in a day is " + incompleteAmount);

       
		// calculate and print days the debtor has not paid for
        daysToPay=defaultedDays-numOfDaysPaid;
        System.out.println("The days Debtor has not paid for is " + daysToPay + " day(s)");
		
		 // calculate and print amount the debtor is left to pay
        amountLeftToPay=amountToPay-amountPaid;
        System.out.println("The amount left to pay is " + amountLeftToPay);

      
    }
}


               

               

               

                






