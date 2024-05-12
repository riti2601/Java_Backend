//Program for JDBC 1st program:

import java.sql.*;

class firstjdbc{
    public static void main(String[] args) {
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //creating a connection 
            String url = "jdbc:mysql://localhost:3306/javabackend";
            String username = "root";
            String password = "12345678";
            Connection con = DriverManager.getConnection(url, username, password);

            if(con.isClosed()){
                System.out.println("Connection closed");
            }
            System.out.println("Connection has been created!!!");
            con.close();

            //create statement






        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
