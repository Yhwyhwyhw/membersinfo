package com.yhw.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;

public class BaseDao {
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql:///membersinfo_db?serverTimezone=UTC";
    private final String username = "root";
    private final String password = "root";

    protected Connection conn;
    protected ResultSet resultSet;
    private PreparedStatement ptemt;


    private void open() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void closeAll() {
        try {
            if (resultSet != null) resultSet.close();
            if (ptemt != null) ptemt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public int execUpdate(String sql, Object... objs) {
        try {
            open();
            ptemt = conn.prepareStatement(sql);
            if (objs != null) {
                for (int i = 0; i < objs.length; i++) {
                    ptemt.setObject(i + 1, objs[i]);
                }
            }
            return ptemt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return -1;
    }

    public ResultSet execQuery(String sql, Object... objs) {
        try {
            open();
            ptemt = conn.prepareStatement(sql);
            if (objs != null) {
                for (int i = 0; i < objs.length; i++) {
                    ptemt.setObject(i + 1, objs[i]);
                }
            }
            return ptemt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

