import java.sql.*;

public class preparedstt {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/javabackend";
            String username = "root";
            String password = "12345678";

            Connection con = DriverManager.getConnection(url, username, password);

            String q = "insert into table1(tname,icity) values(?,?)";

            //get PreparedStatement object

            PreparedStatement pstt = con.prepareStatement(q);

            //setting the values to query

            pstt.setString(1,"Don");
            pstt.setString(2, "Delhi");

            pstt.executeUpdate(); //apan yaha pe again query pass nahi karenge as apan ne already prepared stt mein kardiya hai

            System.out.println("DONEEE!!!");


        } catch (Exception e) {
            e.printStackTrace(); //write correctly !!!
        }
    }
}
