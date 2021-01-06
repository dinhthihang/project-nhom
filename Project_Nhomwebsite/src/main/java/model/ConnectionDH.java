package model;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class ConnectionDH {
    static Connection con;

//    public static Statement connect() throws ClassNotFoundException, SQLException {
//        if (con == null || con.isClosed()) {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webdongho", "root", "");
//            return con.createStatement();
//
//        } else {
//            return con.createStatement();
//        }
//    }
    public static  Connection connect() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webdongho", "root", "");
            System.out.println("connect successfully!");
        } catch (Exception e) {
            System.out.println("connect failure!");
            e.printStackTrace();
        }
        return con;
    }
    public void thucThiSQL(String sql) throws Exception{
        Connection connection = (Connection) connect();
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);

    }
    public ResultSet chonDuLieu(String sql) throws Exception{
        Connection connect = (Connection) connect();
        Statement stmt = connect.createStatement();
        ResultSet rs=	stmt.executeQuery(sql);
        return rs;
    }


    public static void main(String[] args) throws Exception {
        String taikhoan = "1";
        String sodienthoai ="11";
        String maxacthuc ="1111";
        String email ="11111";
        String matkhau ="1111111";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webdongho", "root", "");
        PreparedStatement pst = conn.prepareStatement("insert into" +
                " khachhang(taikhoan,sodienthoai,maxacthuc,email,matkhau ) values (?,?,?,?,?)");
        pst.setString(1,taikhoan);
        pst.setString(2,sodienthoai);
        pst.setString(3,maxacthuc);
        pst.setString(4,email);
        pst.setString(5,matkhau);
        pst.executeUpdate();


//        Connection con = connect();
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery(" INSERT INTO khachhang VALUES('181','122','1314','2131','134525151');");
//        rs.last();
//        System.out.println(rs.getRow());
//        rs.beforeFirst();
//        while (rs.next()) {
//            System.out.println(rs.getString(2));
//        }
//
//
   }
}
