package com.loljoa.server.db.repository.league;

import com.loljoa.server.db.entity.League;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.loljoa.server.db.entity.QGameData.gameData;
import static com.loljoa.server.db.entity.QLeague.league;
import static com.loljoa.server.db.entity.QLeagueCategory.leagueCategory;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class LeagueRepositoryImpl implements LeagueRepositoryCustom {
    private final JPAQueryFactory factory;

    @Override
    public List<League> getLeagueByCategory(String category) {
        return factory
                .selectFrom(league)
                .join(league.category(), leagueCategory).fetchJoin()
                .join(league.gameData, gameData).fetchJoin()
                .distinct()
                .where(league.category().name.eq(category))
                .fetch();
    }
}