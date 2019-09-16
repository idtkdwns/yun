package model;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper
{
	  public Connection getConnection(String driver, String dbid, String dbpw) throws Exception {
	    Class.forName("org.mariadb.jdbc.Driver");
	    
	    Connection conn = null;
	    
	    return DriverManager.getConnection(driver, dbid, dbpw);
	  }
	}
