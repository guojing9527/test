package com.hainiu.cheshi;

import java.util.Arrays;

public class Demo01 {
    /*    3、回文数是指正读反读都一样的数字。
        设n是一任意自然数，若将n的各位数字反向排列所得自然数n1与n相等，则称n为一回文数。
        例如，若n=1234321，则称n为一回文数；但若n=1234567，则n不是回文数。
        请编程查找所有的四位数的回文数。*/
public static void main(String[] args) {
    int[] arr =new int[4];
    for (int q = 1; q < 10; q++) {
        arr[0] = q;
        for (int b = 0; b < 10; b++) {
            arr[1] = b;
            for (int s = 0; s < 10; s++) {
                arr[2] = s;
                for (int g = 0; g < 10; g++) {
                    arr[3] = g;
                    if (arr[0] == arr[3]  && arr[1] == arr[2]){
                        for (int i = 0; i < arr.length; i++) {
                            System.out.print(arr[i]);
                        }
                        System.out.println();
                        }
                    }
                   }
                }
            }
        }
   /* public static void main(String[] args) {
        for (int q = 1; q < 10; q++) {
            for (int b = 0; b < 10; b++) {
                for (int s = 0; s < 10; s++) {
                    for (int g = 0; g < 10; g++) {
                        if (q == g && b == s) {
                            int sum = q * 1000 + b * 100 + s * 10 + g;
                            System.out.println(sum);
                        }
                    }
                }
            }
        }
    }*/
}


