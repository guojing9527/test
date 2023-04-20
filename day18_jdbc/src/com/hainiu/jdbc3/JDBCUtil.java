package com.hainiu.jdbc3;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.*;

public class JDBCUtil {

    // 私有构造 不让其他人创建对象
    private JDBCUtil() {
    }

    // 数据库连接四大属性
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/mysql_day03?useSSL=false&characterEncoding=utf-8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    // 初始化druid连接池
    private static DruidDataSource dataSource = null;


    // 静态代码块 -- 初始化连接池
    static {
        // 创建连接池对象
    dataSource = new DruidDataSource();
    dataSource.setDriverClassName(DRIVER);
    dataSource.setUrl(URL);
    dataSource.setUsername(USERNAME);
    dataSource.setPassword(PASSWORD);
    }

    /**
     * 获取数据库连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() {
        DruidPooledConnection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }
    /**
     * 关闭结果集、SQL处理对象和连接
     * @param resultSet
     * @param statement
     * @param connection
     * @throws SQLException
     */
    public static void close(ResultSet resultSet,Statement statement,Connection connection) throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    /**
     * 关闭SQL处理对象和连接
     * @param statement
     * @param connection
     * @throws SQLException
     */
    public static void close(Statement statement,Connection connection) throws SQLException {
        close(null,statement,connection);
    }

}