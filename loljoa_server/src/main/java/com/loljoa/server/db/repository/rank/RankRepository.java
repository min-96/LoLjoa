package com.loljoa.server.db.repository.rank;

import com.loljoa.server.db.entity.Rank;
import com.loljoa.server.db.repository.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankRepository extends CommonRepository<Rank, Long>, RankRepositoryCustom {
}
