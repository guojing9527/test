package com.hainiu.newlx;

import java.util.Arrays;
import java.util.Scanner;

public class Demo08 {
    /*java语言中，数组是长度固定的，即数组一旦初始化，该数组的长度就固定不变了。
    那么如果有更多的元素要存入数组，就需要定义新的数组来实现。
    现有如下数组：

    int[] arr = {11, 22, 33, 44, 55};

    a、请通过键盘再录入一个整数，将其存储到已有元素的尾部，并遍历数组打印所有的元素。
    b、观察发现，原数组中的元素是按照升序排序的，请重新实现上述第一问中的需求，
    保证元素应添加到合适的位置，使得数组中的数据仍然保持升序。*/
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr1 = new int[arr.length + 1];
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            arr1[j] = arr[j];
        }
        arr1[arr.length] = i;
        System.out.println(Arrays.toString(arr1));
    }
}
