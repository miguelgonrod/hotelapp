package co.edu.javeriana.fbd.hotelapp3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDeveloper {
    
    private final String host;
    private final String port;
    private final String user;
    private final String pass;
    private final String database;
    private Connection connection;

    public SQLDeveloper() {
        this.host = "orion.javeriana.edu.co";
        this.port = "1521";
        this.user = "is107403";
        this.pass = "4v6nI32eV7";
        this.database = "LAB";
        this.connection = null;
    }
   
    public void conectar(){
        try {
            String path = "jdbc:oracle:thin:@" + host + ":" + port + "/" + database;
            System.out.println(path);
            this.connection = DriverManager.getConnection(path, user, pass);
            System.out.println("Se conecto");
        } catch (SQLException ex) {
            System.out.println("No se conecto");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            this.connection=null;
        }catch(Exception ex){
            System.out.println("No se conecto");
            System.out.println("Exception: " + ex.getMessage());
            this.connection=null;
        }
    }

    public void desconectar() {
        try {
            this.connection.close();
            System.out.println("Se desconecto");
        } catch (SQLException ex) {
            System.out.println("No se desconecto");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        this.connection = null;
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    
}