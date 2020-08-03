package edu.dsa.sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {99, 22, 11, 78,43,71, 32, 49, 57, 63};
        SelectionSort selSort = new SelectionSort();
        selSort.sortElements(arr);
        selSort.printElements(arr);
    }

    public void sortElements(int arr[]){

        int len = arr.length;

        for (int i=0;i<len-1;i++){
            int idx = i;
            for (int j=i+1;j<len;j++){
                    if(arr[j]<arr[idx])
                        idx=j;

                    int temp = arr[idx];
                    arr[idx] = arr[i];
                    arr[i] = temp;
            }
        }
    }

    public void printElements(int arr[]){

        for (int i=0;i<arr.length;i++){

            System.out.println(arr[i] + "  ");
        }
    }

}
