package com.bridgelabz.basiccore;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a First Number :" );
        int num1 = sc.nextInt();
        System.out.println("Enter a Second Number :");
        int num2 = sc.nextInt();
        System.out.println("Enter a Third Number :");
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3)
            System.out.println("Largest number is: " +num1);

        else if (num2>num1 && num2>num3)
            System.out.println("Largest number is: " +num2);

        else
            System.out.println("Largest number is: " +num3);
    }
}
