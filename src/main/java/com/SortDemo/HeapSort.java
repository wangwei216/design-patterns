package com.SortDemo;

import java.util.Arrays;

public class HeapSort {

    private int[] arr;

    HeapSort(int[] arr){
        this.arr=arr;
    }

    public static void main(String[] args){

        int[] arr = {9, 3, 7, 2, 5, 4, 3, 6, 1};
        HeapSort heapSort = new HeapSort(arr);
        heapSort.BuidHeap(arr);
        System.out.println("堆排序之后为：---->"+Arrays.toString(arr));

    }


    public void BuidHeap(int[] arr){
        for (int i = arr.length / 2 - 1; i >= 0; i--){
            Heapify(arr,i);
            System.out.println(arr[i]);
        }
    }
    //arr表示传递过来的数组，i表示正在准备调整的节点的下标
    public void Heapify(int[] arr,int i){
        int l=0 , r=0;
        int size = arr.length;
        int largest=0;
        l = 2*i;
        r = 2*i + 1;
        //这一步是判断当前节点和左儿子节点进行比较
        if (l<=size ){
            if (arr[l]>arr[i]){
                largest = l;
            }else {
                largest = i;
            }
        }if (r<size){
            //经过和左儿子的比较，无论左儿子节点大还是父节点大，largest指向的下标都是其中最大的那个
            if (arr[r]>arr[largest]){
                largest = r;
            }
            //其实这里是在进行一个判断，只要当需要调整的堆的节点不是最大的那个的话，就进行交换最大的节点和那个需要调整的节点
        }if (largest!=i){
            //这里是把需要调整的那个节点与那个最大的下标节点进行交换
//            swap(arr,arr[largest],arr[i]);
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            Heapify(arr,largest);
        }

    }


    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
