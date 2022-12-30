package com.bridgelabz.function;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("Enter the value of c:");
        int c=sc.nextInt();

        int delta=(int)Math.pow(b,2)-4*a*c;
        System.out.println("Delta value:"+delta);

        int root1=(-b+(int)Math.sqrt(delta))/(2*a);
        int root2=(-b-(int)Math.sqrt(delta))/(2*a);
        System.out.println("Root1 of x is:"+root1);
        System.out.println("Root2 of x is:"+root2);
    }
}
