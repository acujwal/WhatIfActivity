package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        String name, taxcode;
        int customerid;
        double salesAmount, salesTax = 0, totalAmount = 0 ;

        System.out.println("Name\n");
        name = keyboard.nextLine();

        System.out.println("Tax Code\n");
        taxcode = keyboard.nextLine();

        System.out.print( "Customer Id\n" );
        customerid = keyboard.nextInt();

        System.out.print( "Sales Amount\n" );
        salesAmount = keyboard.nextInt();

            if (taxcode.equals("NRM")){
                salesTax = (6* salesAmount) / 100;
            }
            else if (taxcode.equals("BIZ")){
            salesTax = (4.5* salesAmount) / 100;
        }
          else if (taxcode.equals("NPF")){
            salesTax = (0* salesAmount) / 100;
        }

        totalAmount = salesAmount + salesTax;
        System.out.println("Name \n" + name );
        System.out.println("Tax Code \n" + taxcode );
        System.out.println("Customer Id \n" + customerid );
        System.out.println("Sales Amount \n" + salesAmount );
        System.out.println("Total Amount Due \n" + totalAmount );

    }
}
