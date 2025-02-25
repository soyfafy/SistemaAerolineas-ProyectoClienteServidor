package ControlBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

    private static String credencialesPath = "src\\BD\\credenciales.db";
    private static String productosVentasPath = "src\\BD\\productos-ventas.db";
    private static String controlVentasPath = "src\\BD\\ControlVentas.db";
    public static String usuarios = "usuarios";
    public static String administradores = "administradores";

    public static String getCredencialesPath() {
        return credencialesPath;
    }

    public static String getProductosVentasPath() {
        return productosVentasPath;
    }

    Connection dbConnection = null;

    public DBConnection(String dbPath) throws SQLException {
        String strConnection = "jdbc:sqlite:" + dbPath;
        dbConnection = DriverManager.getConnection(strConnection);
    }

    public String getUserPassword(String inputEmail, String table) throws SQLException {
        PreparedStatement preparedStatement = dbConnection.prepareStatement("SELECT password FROM " + table + " WHERE email = ?");
        preparedStatement.setString(1, inputEmail);
        ResultSet passwordQuery = preparedStatement.executeQuery();

        if (passwordQuery.next()) {
            return passwordQuery.getString("password");
        } else {
            return null;
        }
    }
    


//    public void sqliteCommandExecution(String command){
//        try{
//            PreparedStatement pstm = dbConnection.prepareStatement(command);
//            pstm.execute();
//        }
//        catch (Exception e){
//            System.out.println("error: " + e);
//        }
//    }
}
