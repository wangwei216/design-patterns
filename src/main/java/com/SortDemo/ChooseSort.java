package com.SortDemo;

import java.util.Arrays;

/*
*
* 选择排序
* */
public class ChooseSort {

    public void chooseSort(int[] arr){
        int minIndex,temp;
        //第一层遍历是
        for (int i=0;i<arr.length-1;i++){
            minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                //这里是判断是不是还有比minIndex更小的数,如果比上一个的minIndex还小的话，就保存
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //此时到这里说明第一层遍历还在继续，并且这时已经找到了无序数组中最小的那个下标，然后开始交换
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

    }


    public static void main(String[] args) {
        int[] arr = {3,7,2,9,100,20};
        System.out.println("排序之前的数组---->"+Arrays.toString(arr));
        ChooseSort chooseSort = new ChooseSort();
        chooseSort.chooseSort(arr);
        System.out.println("选择排序之后的数组为——>"+Arrays.toString(arr));
    }


}
