package com.bridgelabz.basiccore;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        if(num%2 == 0)
            System.out.println("The given number is Even");
        else
            System.out.println("The given number is Odd");
    }
}
