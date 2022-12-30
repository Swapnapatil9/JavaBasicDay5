package com.bridgelabz.basiccore;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter two numbers x and y:");
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        int temp;
        temp=x;
        x=y;
        y=temp;
        //after swap numbers
        System.out.println("After swapping: "+x+" "+y);
    }
}
