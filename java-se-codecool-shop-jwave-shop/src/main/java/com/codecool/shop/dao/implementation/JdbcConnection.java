package com.codecool.shop.dao.implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by flavia on 2017.05.10..
 */

/**
 * <h1>Database connection</h1>
 * This class creating a postgresql database
 * connection,detecting username and password
 *
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Zahoranszky Daniel
 * @version 1.0
 * @since   2017-05-18
 */
public class JdbcConnection {

    private static final String DATABASE = "jdbc:postgresql://localhost:5432/codecoolshop";
    private static final String DB_USER = "gabor";
    private static final String DB_PASSWORD = "gabor";

    public Connection getConnection() throws SQLException {
        /**
         * This method is used to add return database
         * connection
         * @param
         * @param
         * @return
         */
        return DriverManager.getConnection(
                DATABASE,
                DB_USER,
                DB_PASSWORD);
    }

    public void executeQuery(String query) {
        try (Connection connection = getConnection();
             Statement statement =connection.createStatement();
        ){
            statement.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
