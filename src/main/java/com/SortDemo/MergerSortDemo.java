package com.SortDemo;

import java.util.Arrays;

//归并排序
public class MergerSortDemo {


//              MERGE SORT(A, p, r)                                    //对A[p..r]进行归并排序
//             1 if  p < r
//             2     then q ← ⎣(p+r)/2⎦                                     //将A[p..r]分成两个子序列进行递归归并排序
//             3             MERGE-SORT (A, p, q)
//             4             MERGE-SORT (A, q+1, r)
//             5             MERGE (A, p, q, r)                           //将已排序的两个子序列进行合并
//

            /*
            * 1.先把传进来的有序数组进行排序，先分成左右两个部分
            * 2.拿到左边数组的长度，和右边数组的长度
            * 3.然后分别创建一个左、右部分的临时数组（此时左右数组都是空的）
            * 4.然后分别遍历左、右数组把原本传过来的大的数组分别复制到左侧和右侧数组中
            * 5.然后分别把i、j置为1,（为了后面合并俩数组）
            * 6.遍历大的数组的次数，好把左侧、和右侧的数组进行比较然后放到最终要合并的数组中去
            * */
//
//             MERGE(A, p, q, r)
//             1 n1 ← q-p+1;                                                  //计算左半部分已排序序列的长度
//             2 n2 2 ← r-q;                                                    //计算右半部分已排序序列的长度
//             3 create arrays L[1..n1+1] and R[1..n2+1]      //新建两个数组临时存储两个已排序序列，长度+1是因为最后有一个标志位
//             4 for i ← 1 to n1
//             5      do L[i] ← A[p + i-1]                                //copy左半部分已排序序列到L中
//             6 for j ← 1 to n2
//             7      do R[j] ← A[q + j]                                   //copy右半部分已排序序列到R中
//             8 L[n1+1] ← ∞                                                //L、R最后一位设置一个极大值作为标志位                       
//             9 R[n2+1] ← ∞
//            10 i ← 1
//            11 j ← 1
//            12 for k ← p to r                                              //进行合并
//            13      do if L[i] < R[j]
//            14          then A[k] ← L[i]
//            15                  i ← i + 1
//            16          else A[k] ← R[j]
//            17                  j ← j + 1



    public static void main(String[] args) {
        int[] a = {40, 9, 50, 7, 1, 8, 9, 5, 3};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    /*
     * 这个是表示把数组递归分割为一个只含有一个元素的数组进行比较
     * a表示你要分割的数组
     * low表示数组的最低位
     * high表示数组的最高位
     *
     * */
    public static void mergeSort(int[] a, int low, int high) {
        if (low < high) {//递归结束条件
            int mid = (low + high) / 2;
            //左子表递归排列有序
            mergeSort(a, low, mid);
            //右子表递归排列有序
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);//将两有序子表合并
        }

    }


    //两有序子表合并方法
    public static void merge(int[] a, int low, int mid, int high) {
        //这里把要排序数组copy一份，用来比较，原来的数组用来保存比较后的信息
        int[] temp = new int[9];
        //注意这里copy时，下标是从low开始的，要是为了保证copy的数组下标与目标数组下标一致，
        // 这样是为了方便后面的比较的下标操作
        for (int i = low; i <= high; i++) {
            //当然copy的数组保存时也可以从0开始保存，但是这样就要注意后面的比较操作时，i就不是小于mid了，
            //而是小于mid-low，j也不是小于high，j是小于high-low
            temp[i] = a[i];
        }

        //把数组分为前后相同的两端进行比较。i指向前半段，j指向后半段，k指向要保存的位置
        int i = low, j = mid + 1, k = low;
//        for(;;k++){ 这里我没有用for循环
        while (i <= mid && j <= high) {
            //比较
            if (temp[i] <= temp[j]) {
                a[k++] = temp[i++];
            } else {
                a[k++] = temp[j++];
            }

        }
        while (j <= high)//若第一个表没检测完，复制
            a[k++] = temp[j++];

        while (i <= mid)//若第二个表没检测完，复制
            a[k++] = temp[i++];
    }


}
