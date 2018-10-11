package com.example;

public class test02 {
    public static void main(String[] args) {

        int len = 50;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            int x = (int) (Math.random()*10*5);
            arr[i]=x;
            System.out.println(arr[i]);
        }
        System.out.println("使用分组法查找key为12的："+ +search(arr, 12));
    }

    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (key < arr[middle]) {
                end = middle - 1;
            } else if (key > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}