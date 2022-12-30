package com.bridgelabz.basiccore;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter two numbers x and y:");
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        int Quotient=x/y;
        int Remainder=x%y;
        System.out.println("Quotient of "+x+" and "+y+":"  +Quotient);
        System.out.println("Remainder of "+x+" and "+y+":"  +Remainder);

    }
}
