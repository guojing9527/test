package com.hainiu.phone;

public abstract class Phone {
   /* 3、抽象类接口案例
    oop7包 手机体系
*/
    private String name;
    private double price;
    public void open(){
        System.out.println("所有手机都能开机");
    }
    public abstract void paly();

    public Phone() {
    }

    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
