package com.hainiu.test;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class Demo04 {
    /*小海牛收集到部分水浒英雄的卡片，我们以List集合中存储字符串数据来表示，如下：
    // 注意:以下代码直接复制使用即可

    请编写程序，开启3条线程，每条线程的任务都是从集合中取出（需要从集合中移除）第一张英雄卡片
    ，每次取卡需要耗时0.1秒，直到取完为止。
    要求程序可以正常执行，并且在多次执行的过程中不会出现异常情况。效果如下：

    线程B获得英雄：及时雨宋江
    线程B获得英雄：玉麒麟卢俊义
    线程B获得英雄：智多星吴用
    线程B获得英雄：入云龙公孙胜
    线程B获得英雄：大刀关胜
    线程B获得英雄：豹子头林冲
    线程B获得英雄：霹雳火秦明
    线程C获得英雄：双鞭呼延灼
    线程C获得英雄：小李广花荣
    线程C获得英雄：小旋风柴进
    线程C获得英雄：扑天雕李应
    线程C获得英雄：美髯公朱仝
    线程A获得英雄：花和尚鲁智深
    线程A获得英雄：行者武松

    说明：以上获取卡片的顺序仅为一次运行的效果，多次运行程序效果可能不一致。*/
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("及时雨宋江");
        list.add("玉麒麟卢俊义");
        list.add("智多星吴用");
        list.add("入云龙公孙胜");
        list.add("大刀关胜");
        list.add("豹子头林冲");
        list.add("霹雳火秦明");
        list.add("双鞭呼延灼");
        list.add("小李广花荣");
        list.add("小旋风柴进");
        list.add("扑天雕李应");
        list.add("美髯公朱仝");
        list.add("花和尚鲁智深");
        list.add("行者武松");
        //创建对象
        Doo d = new Doo(list);
        // 创建线程
        Thread threadB = new Thread(d);
        Thread threadC = new Thread(d);
        Thread threadA = new Thread(d);
        // 开启线程
        threadC.start();
        threadB.start();
        threadA.start();
    }
}
