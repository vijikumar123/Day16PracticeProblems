package com.bridglabz;

public class Permutation {
    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public void permute(String str,int start,int last)
    {
//		 int start ;
//		 int last;
        if (start == last)
            System.out.println(str);
        else {
            for (int i = start; i <= last; i++) {
                str = swap(str, start, i);
                permute(str, start + 1, last);
                str = swap(str, start, i);
            }
        }
    }


    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        String str="abc";
        permutation.permute(str,0,str.length()-1);
    }

}
