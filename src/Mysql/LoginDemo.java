package Mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoginDemo {
    public static void main(String[] args) throws Exception {
        //注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        获取连接
        String url="jdbc:mysql://127.0.0.1:3306/hotel";
        String username="root";
        String password="123456";
        Connection conn= DriverManager.getConnection(url,username,password);

        String name="杨吉欢";
        String phone="1597002675";

        String sql="select * from user where name=? and phone=?";

//        prepareStatement防止sql注入
        PreparedStatement pst=conn.prepareStatement(sql);
//        设置参数
        pst.setString(1,name);
        pst.setString(2,phone);

//        ctrl+alt+v
        ResultSet rs = pst.executeQuery();

        if(rs.next()){
            System.out.println("登陆成功");
        }
        else {
            System.out.println("登陆失败");
        }
        pst.close();
        rs.close();
        conn.close();
    }
}
