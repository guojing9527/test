package com.hainiu.jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo01 {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://11.94.204.84/mysql_day02?characterEncoding=utf-8";
        String user = "root";
        String password = "hainiu";
        Connection conn = null;
        Statement stmt = null;
        try{
        Class.forName(driver);
        conn=(Connection) DriverManager.getConnection(url, user, password);
        String sql = "insert into category (cid,cname) values(7,'图书');";

        stmt = conn.createStatement();
        int executeUpdate = stmt.executeUpdate(sql);
        if(executeUpdate > 0){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
    }catch(Exception e){
        e.printStackTrace();
    }finally {
            // 释放资源
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
