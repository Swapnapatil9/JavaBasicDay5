package com.bridgelabz.basiccore;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 4-digit of ./Year");
        int year= sc.nextInt();
        if(year%400 == 0 || (year%4 == 0 && year%100 != 0))
            System.out.println("Enter year is Leap Year");
        else
            System.out.println("entered year is not a Leap year");
    }
}
