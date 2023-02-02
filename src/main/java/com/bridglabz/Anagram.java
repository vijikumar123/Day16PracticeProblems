package com.bridglabz;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static Scanner src =new Scanner(System.in);
    static boolean anagram(char[] str1, char[] str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;


        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);


        // Compare sorted strings
        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i])
                return false;
        }


        return true;
    }
    public static void main(String[] args) {
        String str1=src.next();
        String str2=src.next();
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        if(Anagram.anagram(arr1,arr2)){
            System.out.println("the given String is anagram");
        }else {
            System.out.println("The given String is Not anagram");
        }



    }
}
