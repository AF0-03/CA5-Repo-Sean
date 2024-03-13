package org.example;

import java.sql.SQLException;
import java.util.List;

public interface DAO<p> {
    Player get(int id) throws SQLException;

    List<Player> getAll() throws SQLException;

    int save(Player p) throws SQLException;

    int insert(Player p) throws SQLException;

    int update(Player p) throws SQLException;

    int delete(Player p) throws SQLException;
}
