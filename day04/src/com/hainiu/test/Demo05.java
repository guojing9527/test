package com.hainiu.test;

import java.util.Arrays;

public class Demo05 {
    /*5、现获取到如下数组
    {1, 2, 0, 3, 4, 0, 0, 5};
    现在需要将其中的数据0，都放到数组的最后面，得到如下的结果：
    {1, 2, 3, 4, 5, 0, 0, 0}
    请编写程序，实现上述效果。不要改变元素的相对位置，无需排序*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 4, 0, 0, 5};
        int[] yan = getYan(arr);
        System.out.println(Arrays.toString(yan));

    }

    public static int[] getYan (int[] arr){
        int[] newArr = new int[arr.length];
        int a =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
              newArr[a++] = arr[i];

            }
        }
        return newArr;
    }
}
