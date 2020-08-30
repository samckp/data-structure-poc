package edu.dsa.recursion;

public class RecursiveMethod {

    public static void main(String[] args) {

        recursion(9);
    }

    public static void recursion(int num){

        if(num <= 0){
            return;
        }
        recursion(num - 1);
        System.out.println("Recursive Iteration -- " + num);
    }
}
