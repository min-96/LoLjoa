package com.loljoa.server.db.dto;

import com.loljoa.server.db.entity.GameData;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class LeagueScheduleDto {
    String title;
    Date startTime;
    List<Long> gameData = new ArrayList<>();

    public LeagueScheduleDto(String title, Date startTime, List<GameData> gameData) {
        this.title = title;
        this.startTime = startTime;
        for(GameData game : gameData) {
            this.gameData.add(game.getGameId());
        }
    }
}
