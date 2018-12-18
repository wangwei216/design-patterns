package com.SortDemo;

/*
* 插入排序：
 * 1、以数组的某一位作为分隔位，比如index=1，假设左面的都是有序的.
 *
 * 2、将index位的数据拿出来，放到临时变量里，这时index位置就空出来了.
 *
 * 3、从leftindex=index-1开始将左面的数据与当前index位的数据（即temp）进行比较，如果array[leftindex]>temp,
 * 则将array[leftindex]后移一位，即array[leftindex+1]=array[leftindex],此时leftindex就空出来了.
 *
 * 4、再用index-2(即leftindex=leftindex-1)位的数据和temp比，重复步骤3，
 * 直到找到<=temp的数据或者比到了最左面（说明temp最小），停止比较，将temp放在当前空的位置上.
 *
 * 5、index向后挪1，即index=index+1，temp=array[index],重复步骤2-4，直到index=array.length,排序结束，
 * 此时数组中的数据即为从小到大的顺序.
* */
public class InsertSort {

    private int[] array;
    private int length;

    public InsertSort(int[] array){
        this.array=array;
        this.length=array.length;
    }

    public void display(){
        for(int a: array){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public void doInsertSort(){

        int temp =0;
        //外层遍历意思是先进行一个一个拿过来
        for (int i=1;i<length;i++){
            //从idex开始向左
            for (int j=i;j>0 && array[j]<array[j-1];j--){
                temp=array[j];
                array[j] =array[j-1];
                array[j-1]=temp;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {20,5,70,6,3,27,19};
        InsertSort is = new InsertSort(array);
        System.out.println("排序前的数据为：");
        is.display();
        is.doInsertSort();
        System.out.println("排序后的数据为：");
        is.display();
    }


}
