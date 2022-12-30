package com.bridgelabz.basiccore;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to check its prime factors: ");
        int num= scanner.nextInt();

        System.out.println("Prime factors of number is:");
        for (int i=2;i<num;i++){
            while(num%i==0){
                System.out.println(i+" ");
                num=num/i;
            }
        }
        if(num>2){
            System.out.println(num);
        }

    }
}
