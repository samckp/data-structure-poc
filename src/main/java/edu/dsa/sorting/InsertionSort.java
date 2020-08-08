package edu.dsa.sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {89, 34, 67, 12, 33, 50, 90, 11, 5, 44, 72};
        insertionSort(arr);

        printArray(arr);
    }

    public static void insertionSort(int[] arr){


    }
    public static void printArray(int array[]){

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + "  ");
        }
    }
}
