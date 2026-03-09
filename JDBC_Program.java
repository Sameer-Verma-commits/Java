import java.sql.*;

public class JDBC_Program {

    public static void main(String[] args) {

        // Database credentials
        String url = "jdbc:mysql://localhost/support_team";
        String username = "root";
        String password = "1234";
        try {
            // 1. Load JDBC Driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);
            // 3. genetrate statement
            Statement stmt = con.createStatement();
            // 4. Execute SELECT Query
            String query = "SELECT * FROM alert_log";
            ResultSet rs = stmt.executeQuery(query);

            // 5. Process ResultSet
            while (rs.next()) {
                String Log_Time = rs.getString("log_time");
                String Type = rs.getString("type");
                String Error_Msg = rs.getString("error_msg");

                System.out.println(Log_Time + "  |  " + Type + "  |  " + Error_Msg);
            }
            // 6. Close resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
