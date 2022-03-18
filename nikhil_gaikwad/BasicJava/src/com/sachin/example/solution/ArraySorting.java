package com.sachin.example.solution;

public class ArraySorting {
    public static void main(String[] args) {

        //int [] arr = {2,4,5,3,1};
        int [] arr = {2,7,9,3,1};
        System.out.println("Print array before sorting ");
        printArray(arr);
        sortArray(arr);
        System.out.println("Print array after sorting ");
        printArray(arr);
    }

    static void sortArray(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void printArray(int [] arr){
        System.out.print("[");
        for (int element:arr) {
            System.out.print("\t"+element);
        }
        System.out.println("]");
    }
}
