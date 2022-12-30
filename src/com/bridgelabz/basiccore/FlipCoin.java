package com.bridgelabz.basiccore;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of flipping coin:");
        int flip_coin= sc.nextInt();
        int count=0;
        for(int i=0;i<flip_coin;i++) {
            int num = (int) (Math.random() * 2);
            if (num == 0) {
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
            count += 1;
        }

        System.out.println("count:"+count);
    }
}
