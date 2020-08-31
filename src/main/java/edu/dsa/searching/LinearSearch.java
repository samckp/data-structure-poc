package edu.dsa.searching;

public class LinearSearch {


    public static void main(String[] args) {

        int arr[] = {11,22,33,44,55,66,77,88,99,112};

        System.out.println(linearSearch(arr, 99));
    }

    public static int linearSearch(int arr[], int num){

        int result=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==num){
                result =i;
                break;
            }
        }
        return result;
    }
}
