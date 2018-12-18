package com.example;

import static java.lang.Integer.*;

public class test03 {
    public int max = 0;
    public int min = MAX_VALUE;

    public int Min(int a, int b) {
        if (a <= b)
            return a;
        else
            return b;
    }

    public int Max(int a, int b) {
        if (a >= b)
            return a;
        else
            return b;
    }

    public void min_max(int a[]) {
        if (a.length == 1) {
            max = Max(max, a[0]);
            min = Min(min, a[0]);
        } else {
            int m[] = new int[a.length / 2];
            int n[] = new int[a.length - a.length / 2];
            System.arraycopy(a, 0, m, 0, m.length);
            System.arraycopy(a, m.length, n, 0, n.length);
            min_max(m);
            min_max(n);
        }
    }

    public static void main(String[] args) {
        test03 object = new test03();
        int[] array = new int[100];
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = (int) (Math.random() * 50 + 1);
            System.out.print(array[i] + " ");
        }
        object.min_max(array);
        System.out.println();
        System.out.println("使用分治法最大值是：" + object.max);
        System.out.println("使用分支发最小值是：" + object.min);
    }
}