package com.hainiu.phone;

public class NewPhone extends Phone implements Look{
    public NewPhone() {
    }

    public NewPhone(String name, double price) {
        super(name, price);
    }

    @Override
    public void paly() {
        System.out.println("可以打王者荣耀");
    }

    @Override
    public void look() {
        System.out.println("可以边看视频边玩了");
    }
}
