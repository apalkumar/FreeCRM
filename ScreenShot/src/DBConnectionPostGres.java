import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnectionPostGres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
		String url = "jdbc:postgresql://<replace>.com:5432/cherchertech";
        String username = "cherchertech";
        String password = "cherchertech";
        try {
            Connection db = DriverManager.getConnection(url, username, password);
            // create object for the Statement class
            Statement st = db.createStatement();
            // execute the quesry on database
            ResultSet rs = st.executeQuery("SELECT * FROM testuser");
            System.out.println("Data retrieved from the PostgreSQL database ");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " | "+rs.getString(2) +" | "+ rs.getString(3));
            }
            rs.close();
            // close the result set
            st.close();
            //close the database connection
            db.close();
            }
        catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

	}

}
