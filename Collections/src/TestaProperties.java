import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestaProperties {
	
	public static void main(String[] args) {
		
		Properties config = new Properties();
		
		config.setProperty("database.login", "scott");
		config.setProperty("database.password", "tiger");
		config.setProperty("database.url", "jdbc:mysql:/localhost/teste");
		
		String login = config.getProperty("database.login");
		String password = config.getProperty("database.password");
		String url = config.getProperty("database.url");
		try {
			DriverManager.getConnection(url, login, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
