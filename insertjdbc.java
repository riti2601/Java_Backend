import java.sql.*;

public class insertjdbc {
    public static void main(String[] args) {
        
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/javabackend";
            String username = "root";
            String password = "12345678";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("done");
            
            // creating a query

            String q = "create table table1(tid int(20) primary key auto_increment, tname varchar(200) not null, icity varchar(400))";

            //create a stt

            Statement stt= con.createStatement();
            stt.executeUpdate(q);

            System.out.println("Table created");

            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
