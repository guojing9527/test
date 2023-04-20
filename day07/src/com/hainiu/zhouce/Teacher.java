package com.hainiu.zhouce;

public abstract class Teacher {
    /*1、定义一个教师Teacher类，该类为抽象的。
    其中有字段：姓名（name），年龄（age），联系方式（phoneNumber）
    编写无参和包含全部参数的构造方法
    其中字段需要符合封装的思想，提供相应的getter和setter
    定义一个抽象方法teach()
    定义一个实现的方法showInfo()，输出"我叫xxx，我的年龄是xxx，我的联系方式是xxx"
            （注意：其中的xxx为真实的字段值）*/
    private String name;
    private int age;
    private String phoneNumber;
    public abstract void teach();
    public void showInfo(){
        System.out.println("我叫:"+name+",我的年龄是:"+age+",我的联系方式是:"+phoneNumber);
    }

    public Teacher() {
    }

    public Teacher(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
