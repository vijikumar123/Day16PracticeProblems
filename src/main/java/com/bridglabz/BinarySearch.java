package com.bridglabz;

import java.util.Arrays;

public class BinarySearch {
    public  int binarySerch(String[] arr,String Data) {
        // Returns index of x if it is present in arr[],
        // else return -1
        int l = 0, lenth = arr.length - 1;

        while (l <= lenth) {
            Integer m = l + (lenth - l) / 2;

            Integer res = Data.compareTo(arr[m]);

            // Check if x is present at mid
            if (res == 0)
                return m;

            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                lenth = m - 1;
        }

        return -1;

    }
    public static void main(String[] args) {
        String paragraph="A Binary search is a divide and conquer algorithm which "
                + "requires the initial "
                + "array to be sorted before searching ";

        String[] aray=paragraph.split(" " );
        Arrays.sort(aray);
        BinarySearch obj= new BinarySearch();
        for (String x : aray) {
            System.out.println(x);

        }
        int result =obj.binarySerch(aray,"the");
        if (result == -1) {
            System.out.println("Element not present");
        }else {
            System.out.println("Element found at "
                    + "index " + result);
        }
        int result2 =obj.binarySerch(aray,"Binary");
        if (result2 == -1) {
            System.out.println("Element not present");
        }else {
            System.out.println("Element found at "
                    + "index " + result2);
        }

    }
}
