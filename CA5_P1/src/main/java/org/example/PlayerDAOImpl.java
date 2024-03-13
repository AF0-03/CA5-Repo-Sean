package org.example;

import org.example.Database;
import org.example.Player;
import org.example.PlayerDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.PreparedStatement;

public class PlayerDAOImpl implements PlayerDAO {

    @Override
    public Player get(int id) throws SQLException {
        Connection con = Database.getConnection();
        Player p = null;

        String sql = "SELECT id, name, rating, age FROM Player where id = ?";

        PreparedStatement statement = con.prepareStatement(sql);

        statement.setInt(1, id);

        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            int oid = rs.getInt("id");
            String name = rs.getString("name");
            int rating = rs.getInt("rating");
            int age = rs.getInt("age");

            p = new Player(oid, name, rating, age);
        }
        return p;
    }

    @Override
    public List<Player> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(Player p) throws SQLException {
        return 0;
    }

    @Override
    //Feature 4: Insert Player (Seán Afolabi)
    public int insert(Player p) throws SQLException {
        Connection con = Database.getConnection();

        String sql = "INSERT INTO Player (id ,name, rating, age) VALUES (?, ?, ?, ?)";

        PreparedStatement statement = con.prepareStatement(sql);

        statement.setInt(1, p.getId());
        statement.setString(2, p.getName());
        statement.setInt(3, p.getRating());
        statement.setInt(4, p.getAge());

        int result = statement.executeUpdate();

        Database.closePreparedStatement(statement);
        Database.closeConnection(con);

        return result;
    }

    @Override
    // Feature 5: Update Player (Sean Afolabi)
    public int update(Player p) throws SQLException {
        Connection con = Database.getConnection();

        String sql = "UPDATE players set id = ?, name = ?, rating = ?, age = ?";

        PreparedStatement statement = con.prepareStatement(sql);

        statement.setInt(1, p.getId());
        statement.setString(2, p.getName());
        statement.setInt(3, p.getRating());
        statement.setInt(4, p.getAge());

        int result = statement.executeUpdate();

        Database.closePreparedStatement(statement);
        Database.closeConnection(con);

        return result;
    }

    @Override
    //Feature 3: Delete Player by ID (Al-Azeem)
    public int delete(Player p) throws SQLException {
        Connection con = Database.getConnection();

        String sql = "DELETE FROM Player where id = ?";

        PreparedStatement statement = con.prepareStatement(sql);

        statement.setInt(1, p.getId());

        int result = statement.executeUpdate();

        Database.closePreparedStatement(statement);
        Database.closeConnection(con);

        return result;
    }
}



