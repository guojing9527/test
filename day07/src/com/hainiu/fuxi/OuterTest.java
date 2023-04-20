package com.hainiu.fuxi;

import java.lang.reflect.Method;

public class OuterTest {
    public static void main(String[] args) {
      /* Outer o = new Outer();
       o.methods();*/
        Outer.Inner o = new Outer.Inner();
        o.show();
        Outer.Inner.method();
    }
}
