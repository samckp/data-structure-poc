package edu.dsa.test;

public class OddOccurrence {

    // function to find the element occurring odd
    // number of times
    static int getOddOccurrence(int arr[], int arr_size) {

        int count = 0;
        for (int i = 0; i < arr_size; i++) {

            if (arr[i] % 2 != 0)
                count++;
        }
        return count;
    }
    static int getOddOccurrence1(int ar[], int ar_size) {

        int i;
        int res = 0;
        for (i = 0; i < ar_size; i++) {
            res = res ^ ar[i];
        }
        return res;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2, 1, 3};
        int n = arr.length;
        System.out.println("Result = "+getOddOccurrence(arr, n));

        System.out.println("using XOR = "+ getOddOccurrence1(arr, n));
    }
}
