package Mysql;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

public class UserTest {

    @Test
    public  void testSelectAll() throws Exception {
    Properties prop=new Properties();
    prop.load(new FileInputStream("src/Druid/druid.properties"));

    DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);

    Connection con=dataSource.getConnection();

    String sql="select * from user";
    PreparedStatement pres = con.prepareStatement(sql);

    ResultSet rs = pres.executeQuery();

    User user=null;
    ArrayList<User> list=new ArrayList<>();

    while(rs.next()){
        int userid = rs.getInt("userid");
        String name = rs.getString("name");
        char sex = rs.getString("sex").charAt(0);
        String idnumber = rs.getString("idnumber");
        String phone = rs.getString("phone");
        String type = rs.getString("type");

        user=new User();
        user.setUserId(userid);
        user.setName(name);
        user.setSex(sex);
        user.setIdnumber(idnumber);
        user.setPhone(phone);
        user.setType(type);

        list.add(user);

    }

        System.out.println(list);
    rs.close();
    pres.close();
    con.close();

    }
}
