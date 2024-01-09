package com.example.player.model;
package com.example.player.model.Player;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PlayerRowMapper implements RowMapper<Player> {
    public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Player(
                rs.getInt("playerId"),
                rs.getString("playerName"),
                rs.getInd("jerseyNumber"),
                rs.getString("role"));

    }
}