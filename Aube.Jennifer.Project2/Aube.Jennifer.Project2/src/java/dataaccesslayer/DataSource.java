/**
 * DataSource.java
 * Jennifer Aube, 040507317
 * CST8288 OOPII
 * Project 2
 * July 27, 2017
 * George Krieger
 * Description: The purpose of this class to open a connection to connect the database.
 *
 */
package dataaccesslayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jennifer
 */
public class DataSource {

    private Connection connection = null;
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/potluckrecipes?autoReconnect=true&useSSL=false";
    private final String username = "scott";
    private final String password = "tiger";

    /**
     * DataSource is a no argument constructor.
     */
    public DataSource() {

    }

    /**
     * createConnection method will connect to the database to access the table.
     *
     * @return
     */
    public Connection createConnection() throws SQLException, ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(DATABASE_URL, username, password);

        return connection;
    }

}
