package org.example;

import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {

        Connection con = Database.getConnection();

        //JDBC Connection Test
        if (con != null)
        {
            System.out.println("Database connection successful!");
        }

        // Insert Player Test
         /*PlayerDAO playerDAO = new PlayerDAOImpl();

         Player p = new Player(66, "Rashford", 70, 26);

        int result = playerDAO.insert(p);

        System.out.println(result); */

        // Delete Player by ID Test
        /* PlayerDAO playerDAO = new PlayerDAOImpl();

        Player p = playerDAO.get(66);

        int result = playerDAO.delete(p);

        System.out.println(result); */

        // Update Player Test
        /* PlayerDAO playerDAO = new PlayerDAOImpl();

        Player p = new Player(66, "S.Rashford", 77, 28);

        playerDAO.update(p);

        System.out.println(p); */
    }
}

