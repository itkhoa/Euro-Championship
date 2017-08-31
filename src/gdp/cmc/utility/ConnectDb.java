package gdp.cmc.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {
  static String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
  static String ConnectionURL = "jdbc:sqlserver://localhost:1433" 
      + ";instance=SQLEXPRESS;databaseName=Euro_Champion;";
  static String userName = "demo1";
  static String password = "demo1234";
  
  /**
   * Method return connection database
   * 
   * @throws ClassNotFoundException
   * 
   * @throws SQLException.
   * 
   */
  public static Connection connect() throws ClassNotFoundException, SQLException {
    //load Driver
    Class.forName(Driver);
    //get connection
    Connection cn = DriverManager.getConnection(ConnectionURL, userName, password);
    return cn;
  }
}