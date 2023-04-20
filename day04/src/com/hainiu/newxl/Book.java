package com.hainiu.newxl;

public class Book {
    /** 1、熟练掌握标准javabean的编写
             私有成员变量
     提供无参数和全参数构造
             提供get和set方法
     打印对象查看属性方便 -- 生成toString方法

             Book类*/
    private String bookName;

    public Book() {
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
