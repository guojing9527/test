package com.hainiu.phone;

public class PhoneTest {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        oldPhone.setName("老年机");
        oldPhone.setPrice(999.9);
        System.out.println(oldPhone.getName());
        System.out.println(oldPhone.getPrice());
        oldPhone.open();
        oldPhone.paly();
        NewPhone n = new NewPhone("智能机",6999.0);
        System.out.println(n.getName());
        System.out.println(n.getPrice());
        n.open();
        n.look();
        n.paly();
    }
}
