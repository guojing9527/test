package com.hainiu.jdbc;

import javafx.scene.chart.CategoryAxis;

import java.sql.*;
import java.util.ArrayList;
import java.util.Locale;

public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://11.94.204.84:3306/mysql_day03?useSSL=false&characterEncoding=UTF-8";
        String username = "root";
        String password = "hainiu";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String sql = "select cid,cname from category";
        ResultSet resultSet = statement.executeQuery(sql);
        ArrayList<Category> list = new ArrayList<Category>();
        while(resultSet.next()) {
            int cid = resultSet.getInt("cid");
            String cname = resultSet.getString("cname");
            Category category = new Category(cid,cname);
            list.add(category);
        }
        for(Category category : list){
            System.out.println(category);
        }

        connection.close();
    }
}
