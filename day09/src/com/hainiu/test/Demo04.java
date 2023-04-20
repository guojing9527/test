package com.hainiu.test;

public class Demo04 {
    //    4、将整数数组中的元素按照格式拼成一个字符串。参见stringbuilderdemo  Demo03
    public static void main(String[] args) {
    int[] arr = {1,3,2,4,5,6,7};
        String a = array(arr);
        System.out.println(a);
    }
    public static String array(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length -1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
