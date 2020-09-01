package edu.dsa.searching;

public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {11,22,33,44,55,66,77,88,99,112};

       System.out.println(binarySearch(arr, 99));
    }

    public static int binarySearch(int[]arr, int num){

        int low=0;
        int high = arr.length;

        while(low<=high){

            int mid = (low+high)/2;

            if(arr[mid]<num){
                low = mid+1;
            } else if(arr[mid]>num){
                high = mid -1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}

// Worst case time complexity O(log N)
