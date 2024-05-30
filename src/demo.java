import java.sql.*;

public class demo {
    public static void main(String[] args) throws SQLException {
        String sql = "select name from student where id = 2";
        String url = "jdbc:mysql://localhost:3306/clg";
        String username = "root";
        String password = "0000";
        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
        con.close();
    }
}
