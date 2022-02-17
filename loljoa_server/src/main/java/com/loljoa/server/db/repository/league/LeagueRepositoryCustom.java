package com.loljoa.server.db.repository.league;

import com.loljoa.server.db.entity.League;

import java.util.List;

public interface LeagueRepositoryCustom {

    List<League> getLeagueByCategory(String category);
}