package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectDemo {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
//        获取连接
        String url="jdbc:mysql://127.0.0.1:3306/hotel";
        String username="root";
        String password="123456";
        Connection conn= DriverManager.getConnection(url,username,password);
         String type="普通用户";
        String sql="select * from user where type='"+type+"'";

        Statement stat= conn.createStatement();

        ResultSet rs=stat.executeQuery(sql);

        //创建集合
        List<User> list=new ArrayList<>();

//        遍历rs
        while (rs.next()){
            User user=new User();
            int id=rs.getInt("userid");
            String name=rs.getString("name");
            char sex=rs.getString(3).charAt(0);

            user.setUserId(id);
            user.setName(name);
            user.setSex(sex);

            list.add(user);
        }
        System.out.println(list);
        rs.close();
        conn.close();
    }
}
