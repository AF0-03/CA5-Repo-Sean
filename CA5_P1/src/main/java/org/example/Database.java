package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database
{
    private static String url = "jdbc:mariadb://localhost:3306/PremierLeagueDB";
    private static String user = "root";
    private static String password = "password";

    private Database()
    {
    }

    public static Connection getConnection() throws SQLException
    {
        Connection connection = null;
        connection = DriverManager.getConnection(url, user, password);

        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException var2) {
        }

    }

    public static void closePreparedStatement(PreparedStatement preparedstatement) {
        try {
            if (preparedstatement != null) {
                preparedstatement.close();
            }
        } catch (SQLException var2) {
        }

    }
}
