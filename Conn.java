import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;

    public Connection getC(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
              c= DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem","root","tushar@123");
             s=c.createStatement();
            return  c;
        }catch (Exception e){
            e.printStackTrace();
        }
      return  c;
    }
}
