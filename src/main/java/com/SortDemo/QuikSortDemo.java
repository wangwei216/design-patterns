package com.SortDemo;


import java.util.Arrays;

//快速排序
public class QuikSortDemo {



    //s表示一个数组，l表示数组最左侧的，r表示数组最右侧的
    public static int AdjustArray(int s[], int l, int r) {

        int i = l, j = r;
        int x = s[l]; //s[l]即s[i]就是第一个坑，也就是表示的是第一个基准数
        //这里表示当i和j重合时候跳出循环
        while (i < j) {
            //先从右向左进行找数组中,比基准数X小的数，如果大于或者等于就停下来，准备交换
            while (i < j && s[j] >= x) {
                j--;
            }
            //这个有点像判断游标移动的次数的大小比较
            if (i < j) {
                s[i] = s[j]; //这个就是进行交换
                i++;
            }


            // 从左向右找大于或等于x的数来填s[j]， 这个就是当
            while (i < j && s[i] < x) {
                i++;
            }
            if (i < j) {
                s[j] = s[i]; //将s[i]填到s[j]中，s[i]就形成了一个新的坑
                j--;
            }

            //这里是当i和j移动的次数
            s[i] = x;


        }
        return i;

    }

    static void quick_sort1(int s[], int l, int r) {
        if (l < r) {
            int i = AdjustArray(s, l, r);//先成挖坑填数法调整s[]
            quick_sort1(s, l, i - 1); // 递归调用
            quick_sort1(s, i + 1, r);
        }
    }

    /*
     * 思路：
     * 1. 需要先把数组 数组最左、最右侧传进来
     * 2. 当左侧值不能大于等于右侧值
     * 3. 当左侧的下标i大于等于j时，跳出循环，并且去找比第一个基准数小的数
     * */

    //快速排序集中到一个方法中的
    static void quick_sort(int s[], int l, int r) {
        if (l < r) {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            //当j和i相等的时候就跳出循环
            while (i < j && s[j] >= x) // 从右向左找第一个小于x的数
            {
                j--;
            }
            if (i < j)
                //这一步表示先把s[j]的值给s[i],然后i++
                s[i++] = s[j];
            System.out.println("从右向左找---->" + Arrays.toString(s));
            while (i < j && s[i] < x) // 从左向右找第一个大于等于x的数
            {
                i++;
            }
            if (i < j)
                s[j--] = s[i];
            System.out.println("从左-->右找---->" + Arrays.toString(s));
            System.out.println("此时i>=j" + Arrays.toString(s));
            s[i] = x;
            System.out.println("跳出循环的s[i]的值也就是x为：" + s[i]);
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }


    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("kaishi" + Arrays.toString(array));
        quick_sort(array, 0, array.length - 1);
        System.out.println("随机生成的15个数，使用快速排序结果为：------------->" + Arrays.toString(array));

    }


}
