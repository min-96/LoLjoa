package com.loljoa.server.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class GameData {
    @Id
    @GeneratedValue
    private Long gameId;

    private String title;
    private UUID gameKey;

    @ManyToOne(targetEntity = League.class)
    private League league;

    public GameData(Long gameId) {
        this.gameId = gameId;
    }

    public GameData(String title, UUID gameKey) {
        this.title = title;
        this.gameKey = gameKey;
    }
}
