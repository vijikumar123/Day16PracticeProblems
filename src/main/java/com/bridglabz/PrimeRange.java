package com.bridglabz;

import java.util.Scanner;

public class PrimeRange {
    public void PrimeRange(int num,int num2) {
        int flag=0;
        int[] arr= new int[num2];
        int count=0;
        for (int i=num ;i<num2;i++) {
            flag=0;
            if (num ==0 ) {
                num=2;
            }else if (num==1) {
                num=2;
            }else
                for (int j =2;j<i;j++) {
                    if (i<2) {
                        System.out.println("the number less than 2");
                        break;
                    }
                    else if (i % j==0) {
                        flag=flag+1;
                    }else {
                        flag=flag;
                    }
                }
            if (flag >0) {
                //System.out.println(i+"not prime");

            }
            else {
                arr[count]=i;
                count++;
                //System.out.println(i+"prime");
            }


        }

        for (int k :arr) {

            if (k!=0) {
                System.out.println(k);
            }
        }

    }

    public static void main(String[] args) {
        PrimeRange prime=new PrimeRange();
        prime.PrimeRange(0,1000);
    }
}
