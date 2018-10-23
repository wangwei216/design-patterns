package com.suanfa;


import java.util.Arrays;

public class TestQuickSort {


    /*
    * 思路;
    *   1.首先
    *
    * */


    public static void quick_sort(int[] arr, int l, int r){

        //当l等于r的时候跳出这个循环
        if (l < r){
         //i 和 j表示一个左边的数组下标，一个表示右边的数组的下标
            int i = l, j = r, x = arr[l];

            while (i < j){

              //然后从右边开始找比数组的第一个数作为基准数小的的那个进行表换
              while (i < j && arr[j] >= x){
                  j--;
              }
              if (i < j){
                  arr[i] = arr[j];
                  i++;
              }

              //然后是从左---->向右去找 大于基准数X的
              while (i < j && arr[i] < x) {
                  i++;
              }
              if (i < j){
                  arr[j] = arr[i];
                  //这里是为了下次循环继续进行
                  j--;
              }

          }
            //到这里相当于把整个数组排好序了，原先数组中比X（也就是数组的第一个数）大的都在X后面，比X小的都在X前面，而且i就是数组中间的那个下标
            arr[i] = x;
            quick_sort(arr,l,i-1);
            quick_sort(arr,i+1,r);
        }

    }



    public static void main(String[] args){

        int[] array = new int[5];
        for (int i=0;i<5;i++){
            array[i] = (int) (Math.random()*100);
        }
        System.out.println("kaishi"+ Arrays.toString(array));
        quick_sort(array,0,array.length-1);
        System.out.println("随机生成的15个数，使用快速排序结果为：------------->"+Arrays.toString(array));

    }



}
