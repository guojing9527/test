package com.hainiu.jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo01 {
    public static void main(String[] args) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "insert into account(id, name, money) values (?,?,?)";
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1,0);
            statement.setString(2,"图书/电子书");
            statement.setDouble(3,4500);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                JDBCUtil.close(statement,conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
