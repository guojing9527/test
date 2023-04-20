package com.hainiu.zhouce;

public class MathTeacherTest {
    public static void main(String[] args) {
       /* 在测试类中，创建MathTeacher的对象进行测试，要求创建对象时，既可以使用空参构造，也可以使用带参构造；
        并且 teach方法和showInfo方法都能按照格式打印输出。*/
        MathTeacher mt = new MathTeacher();
        mt.setName("诸葛亮");
        mt.setAge(20);
        mt.setPhoneNumber("13131213827");
        mt.teach();
        mt.showInfo();
        MathTeacher mt1 = new MathTeacher("黄月英",19,"13131213828");
        mt1.teach();
        mt1.showInfo();
    }
}
