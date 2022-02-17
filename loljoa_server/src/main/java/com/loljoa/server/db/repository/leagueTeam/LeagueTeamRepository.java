package com.loljoa.server.db.repository.leagueTeam;

import com.loljoa.server.db.repository.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueTeamRepository extends CommonRepository<LeagueTeam, Long>, LeagueTeamRepositoryCustom {
}
