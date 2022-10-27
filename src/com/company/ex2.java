package com.company;

import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(49)+51;
        System.out.println(x);
        int y;
        int count50 = x /50;
        int count20= (x-count50*50)/20;
        int count10= (x-count50*50-count20*20)/10;
        int count5= (x-(count50*50)-(count20*20)-(count10*10))/5;
        int count2= (x-(count50*50)-(count20*20)-(count10*10)-(count5*5))/2;
        int count1=(x-(count50*50)-(count20*20)-(count10*10)-(count5*5)-(count2*2));
        System.out.printf("50 - %d\n",count50);
        System.out.printf("20 - %d\n",count20);
        System.out.printf("10 - %d\n",count10);
        System.out.printf("5 - %d\n",count5);
        System.out.printf("2 - %d\n",count2);
        System.out.printf("1 - %d\n",count1);





    }
}
