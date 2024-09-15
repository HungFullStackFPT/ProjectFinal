package DAO;


import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.jsp.tagext.TryCatchFinally;


public class DBContext {
    private String url = "jdbc:sqlserver://VIETHUNG;databaseName=prj301_assignment;encrypt=true;trustServerCertificate=true;";
    private String className = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String username = "sa";
    private String password = "123";
    
    public Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(className);
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
 