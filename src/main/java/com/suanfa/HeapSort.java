package com.suanfa;

import java.util.Arrays;

/*
 * 堆排序demo的总体思路
 *  1. 先进行把一个数组进行排成大根堆或者是一个小根堆
 *  2.
 *
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 60, 5, 4, 3, 20, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        //1.构建大顶堆
        System.out.println(arr.length);
        //(arr.length / 2 - 1)表示的是一个堆的最后面的不是叶子节点的节点
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for (int j = arr.length - 1; j > 0; j--) {
            swap(arr, 0, j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr, 0, j);//重新对堆进行调整
        }
    }

    /*
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     *
     * @param arr
     * @param parent 表示调整的父节点
     * @param length
     */
    public static void adjustHeap(int[] arr, int parent, int length) {
        int temp = arr[parent];//先取出当前元素i
        for (int k = parent * 2 + 1; k < length; k = k * 2 + 1) {//从i结点的左子结点也就是2i+1处开始，右节点是2*i + 2
            if (k + 1 < length && arr[k] < arr[k + 1]) {//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if (arr[k] > temp) {//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[parent] = arr[k];
                parent = k;
            } else {
                break;
            }
        }
        arr[parent] = temp;//将temp值放到最终的位置
    }

    /*
     * 交换元素
     *  这个表示把数组中的A跟B进行交换
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}