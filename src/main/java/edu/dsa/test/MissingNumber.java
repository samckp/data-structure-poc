package edu.dsa.test;

public class MissingNumber {

    static int getMissingNo(int a[], int n)
    {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }

    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int miss = getMissingNo(a, 8);
        System.out.println(miss);
    }
}
