package com.loljoa.server.db.repository.boardComment;

import com.loljoa.server.db.entity.LeagueComment;
import com.loljoa.server.db.repository.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardCommentRepository extends CommonRepository<LeagueComment, Long>, BoardCommentRepositoryCustom {
}
