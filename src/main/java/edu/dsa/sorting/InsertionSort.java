package edu.dsa.sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {89, 34, 67, 12, 33, 50, 90, 11, 5, 44, 72};
//        insertionSort(arr);
        insertionSortRecursive(arr, arr.length);
        printArray(arr);
    }

    public static void insertionSort(int[] arr){

        for(int i=0;i< arr.length;i++){

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }

            arr[j + 1] = key;
        }
    }
    public static void printArray(int array[]){

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + "  ");
        }
    }

    private static void insertionSortRecursive(int[] arr, int length) {
        if (length <= 1) {
            return;
        }
        insertionSortRecursive(arr, length - 1);
        int key = arr[length - 1];
        int j = length - 2;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
