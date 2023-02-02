package com.bridglabz;

public class AnagramRange {
    public void PrimeRange(int num,int num2) {
        int flag=0;//to calculate the divs
        int len=num2/2;
        int[] arr= new int[len];
        int count=0;//to calculate the no.of primes
        for (int i=num ;i<num2;i++) {//looping
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
            if ((k!=0)&(k<10)) {

                System.out.println(k);
            }
        }
    }
    public static void main(String[] args) {
        AnagramRange obj=new AnagramRange();
        obj.PrimeRange(0,1000);
    }

}
