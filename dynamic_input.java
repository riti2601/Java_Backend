import java.sql.*;
import java.util.*;

public class dynamic_input {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javabackend";
            String username = "root";
            String password = "12345678";

            Connection con = DriverManager.getConnection(url, username, password);

            String q = "insert into table1(tname,icity) values(?,?)";

            PreparedStatement pstt = con.prepareStatement(q);
            System.out.println("Enter your data-");
            String name = read.nextLine();
            String city = read.nextLine();

            pstt.setString(1, name);
            pstt.setString(2, city);

            pstt.executeUpdate();
            System.out.println("done");

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            read.close();
        }

    }
}
