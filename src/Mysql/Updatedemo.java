package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Updatedemo {

    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
//        获取连接
        String url="jdbc:mysql://127.0.0.1:3306/hotel";
        String username="root";
        String password="123456";
        Connection conn=DriverManager.getConnection(url,username,password);

        //sql语句
        String sql="update user set name='杨吉欢' where userid=1";

        //获取Statement对象
        Statement stat=conn.createStatement();
//        修改结果
        int count=stat.executeUpdate(sql);

        System.out.println(count);

        stat.close();
        conn.close();
    }
}
