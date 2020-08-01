package edu.dsa.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        BubbleSort bSort = new BubbleSort();
        int ar[] = {89, 34, 67, 12, 33, 50, 90, 11, 5, 44, 72};

        bSort.bubbleSort(ar);
        System.out.println("Bubble Sort ");
        System.out.println("-----------------------------------");
        bSort.printArray(ar);
    }
    public void bubbleSort(int arr[]){

        int num = arr.length;

        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void printArray(int array[]){

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + "  ");
        }
    }
}
