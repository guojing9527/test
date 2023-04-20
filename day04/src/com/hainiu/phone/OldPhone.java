package com.hainiu.phone;

public class OldPhone extends Phone{
    public OldPhone() {
    }

    public OldPhone(String name, double price) {
        super(name, price);
    }

    @Override
    public void paly() {
        System.out.println("可以玩俄罗斯方块");
    }
}
