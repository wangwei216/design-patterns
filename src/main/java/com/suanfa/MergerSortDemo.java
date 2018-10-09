package com.suanfa;

import java.util.Arrays;

public class MergerSortDemo {

    public static void main(String[] args) {
        int []a={40,9,50,7,1,8,9,5,3};
        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));

    }

    /*
    * 这个是表示把数组递归分割为一个只含有一个元素的数组进行比较
    * a表示你要分割的数组
    * low表示数组的最低位
    * high表示数组的最高位
    *
    * */
    public static void mergeSort(int[]a,int low,int high ){
        if(low<high){//递归结束条件
            int mid=(low+high)/2;
            //左子表递归排列有序
            mergeSort(a, low, mid);
            //右子表递归排列有序
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);//将两有序子表合并
        }

    }


    //两有序子表合并方法
    public static void merge(int []a,int low,int mid,int high){
        //这里把要排序数组copy一份，用来比较，原来的数组用来保存比较后的信息
        int [] temp=new int[9];
        //注意这里copy时，下标是从low开始的，要是为了保证copy的数组下标与目标数组下标一致，
        // 这样是为了方便后面的比较的下标操作
        for(int i=low;i<=high;i++){
            //当然copy的数组保存时也可以从0开始保存，但是这样就要注意后面的比较操作时，i就不是小于mid了，
            //而是小于mid-low，j也不是小于high，j是小于high-low
            temp[i]=a[i];
        }

        //把数组分为前后相同的两端进行比较。i指向前半段，j指向后半段，k指向要保存的位置
        int i=low,j=mid+1,k=low;
//        for(;;k++){ 这里我没有用for循环
        while (i<=mid && j<=high){
            //比较
            if(temp[i]<=temp[j]){
                a[k++]=temp[i++];
            }
            else {
                a[k++]=temp[j++];
            }

        }
        while(j<=high)//若第一个表没检测完，复制
            a[k++]=temp[j++];

        while(i<=mid)//若第二个表没检测完，复制
            a[k++]=temp[i++];
    }




}
