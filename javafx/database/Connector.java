package javafx.database;

import javaf.database.Connecter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private Connection conn;
    private static Connecter _instance;

    public Connector() {
        String host = "jdbc:mysql://localhost:3306/list";
        String user = "root";
        String pwd = "root";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(host,user,pwd);
        }catch(SQLException e){
            System.out.println(e.getErrorCode());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Connecter getInstance() throws SQLException, ClassNotFoundException{
        if (_instance == null){
            _instance = new Connecter();
        }
        return _instance;
    }
    public Connector(int id, String name) {
    }

//    public static Connector getInstance() throws SQLException, ClassNotFoundException {
//        if(_instance == null){
//            _instance = new Connector();
//        }
//        return _instance;
//    }

    public Connection getConn() {
        return conn;
    }
}
