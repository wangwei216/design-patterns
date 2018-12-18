package com.SortDemo;

import java.util.Arrays;

public class MaoPaoSort {

    private int[] arr;

    public MaoPaoSort(int[] arr){
        this.arr = arr;
    }

    //这是进行冒泡排序
    public void doMaoPaoSort(int[] arr){

        int temp;
        //第一次需要进行比较n-1次
        for (int i=0;i<arr.length-1;i++){
            //当第一次遍历完之后，以后每次遍历都会
            for (int j=0;j<arr.length-i-1;j++){
                //如果相邻的两个数前面的大于后面的，那么进行交换
                if (arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }


    public static void main(String[] args){
        int[] array = {20,5,70,6,3,27,19};
        System.out.println(array.toString());
        MaoPaoSort maoPaoSort = new MaoPaoSort(array);
        maoPaoSort.doMaoPaoSort(array);
        System.out.println(Arrays.toString(array));

    }
}
