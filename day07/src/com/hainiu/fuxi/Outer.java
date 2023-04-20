package com.hainiu.fuxi;

public class Outer {
    int num = 10;
   /* private class Inner{
        public void show(){
            System.out.println("private  inner 里面的show（）方法");
        }
    }*/
    // method 在 inner 外边
  /* public void methods (){
       Inner i = new Inner();
       i.show();
   }*/
   static class Inner{
        public void show(){
            System.out.println("static   inner 里面的show（）方法");
        }
        public static void method (){
            System.out.println("method 在inner里面,要用static修饰");
        }
    }

}

