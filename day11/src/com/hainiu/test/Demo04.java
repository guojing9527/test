package com.hainiu.test;
import java.lang.Comparable;
import java.util.TreeSet;

public class Demo04 {
   /* 4、定义一个Worker类（属性 姓名name 年龄age 工资salary）
    创建几个Worker对象，存入TreeMap集合，要求：按照薪资从大到小排序，如果薪资相同，
    按照年龄从小到大；如果也相同，按照姓名字典顺序排序。*/
   public static void main(String[] args) {
       TreeSet<Worker> map = new TreeSet<>();
       map.add(new Worker("Tom",22,6000));
       map.add(new Worker("Jerry",27,7000));
       map.add(new Worker("JerryNi",26,7000));
       map.add(new Worker("JerryNiHao",26,7000));
       map.add(new Worker("Ni",25,8000));
       map.add(new Worker("Hao",21,16000));
       for (Worker worker : map) {
           System.out.println(worker);
       }
   }
}
