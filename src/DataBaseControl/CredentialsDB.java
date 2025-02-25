package DataBaseControl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CredentialsDB {
    private String dbPath = "src\\DB\\credenciales.db";
    public static String usuarios = "users";
    public static String administradores = "admins";
    Connection dbConnection;

    
    public CredentialsDB() throws SQLException{
        dbConnection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
    }
    
public String getUserPassword(String inputEmail, String table) throws SQLException {
    PreparedStatement preparedStatement = dbConnection.prepareStatement("SELECT password FROM " + table + " WHERE email = ?");
    preparedStatement.setString(1, inputEmail);
    ResultSet passwordQuery = preparedStatement.executeQuery();

    if (passwordQuery.next()) {
        String password = passwordQuery.getString("password");
        return password;
    } else {
        return null; // Si no se encontró ningún registro en la base de datos, devuelve null
    }
}

    public void setNewAdmin(String id, String username, String email, String password, String accessLevel) throws SQLException {
        PreparedStatement preparedStatement = dbConnection.prepareStatement("INSERT INTO admins(id, username, email, password, access_level) VALUES("
                + id + ","
                + username + ","
                + email + ","
                + password + ","
                + accessLevel + ");");
        preparedStatement.execute();
    }
    
    public void setNewUser(String id, String username, String email, String password) throws SQLException{
 
        PreparedStatement preparedStatement = dbConnection.prepareStatement("INSERT INTO users(id, username, email, password, shopping_history) VALUES("
                + "'" + id + "'" + ","
                + "'" + username + "'" + ","
                + "'" + email + "'" + ","
                + "'" + password + "'" + ","
                + "' ');");
        preparedStatement.execute();
    }
    
    public boolean checkUserExistence(String userEmail, String table) throws SQLException {
        boolean isUserExist = false;
        String sql = "SELECT email FROM " + table + " WHERE email = ?";

        try ( Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Farg-\\Documents\\NetBeansProjects\\ProyectoPrograCS-G8\\src\\DB\\credenciales.db");  PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, userEmail);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                isUserExist = true;
            }
        }

        return isUserExist;
    }


}