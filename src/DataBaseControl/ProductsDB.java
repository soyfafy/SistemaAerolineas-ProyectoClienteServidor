package DataBaseControl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductsDB {
    private String dbPath = "src\\DB\\productos-ventas.db";
     Connection dbConnection;
    
    public ProductsDB() throws SQLException{
        dbConnection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
    }
}
