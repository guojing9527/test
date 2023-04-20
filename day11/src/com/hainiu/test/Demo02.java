package com.hainiu.test;

import java.util.LinkedList;

public class Demo02 {
    public static void main(String[] args) {
//        2、LinkedList 1-108号 排序拿好，拿起一张扔掉，拿起一张放到最下面。反复操作，直到剩余一张，剩的谁？
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 108; i++) {
            list.add(i);
        }
        while (list.size() > 1) {
            list.removeFirst();
            list.addLast(list.removeFirst());
        }
        System.out.println(list.getFirst());

    }
}
