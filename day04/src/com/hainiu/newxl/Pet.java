package com.hainiu.newxl;

public class Pet {

    /**
     * 2、继承案例
     * oop4包 Pet类和子类Cat、Dog
     */
    private String name;
    private String color;

    public void attack(){
        System.out.println(name+"都会攻击");
    }

    public Pet() {
    }

    public Pet(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
