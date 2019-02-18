package org.mzy;

import java.sql.*;

/**
 * @description:
 * @author: MeiZhiYuan(梅致远)
 * @create: 2019-02-13-21-22-40
 * @copyright: www.mzy.org .@版权所有，仿冒必究
 **/
public class HsqlDbTest {

    public static void main(String[] args) throws SQLException {
        initData();
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from tb_books");
        while(rs.next()){
            System.out.println(rs.getString("bookname") + "=>" + rs.getString("author"));
        }
        rs.close();
        stmt.close();
        conn.close();

    }

    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/bookdb", "SA", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void initData() throws SQLException {

        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        for (int i = 10; i < 30; i++) {
            String sql = "insert into tb_books(bookname,author) values('BookName"+i+"','Author"+i+"')";
            System.out.println(sql);
            stmt.addBatch(sql);
        }

        stmt.executeBatch();
        stmt.close();
        conn.close();
    }

}
