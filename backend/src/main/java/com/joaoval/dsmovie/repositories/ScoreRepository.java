package com.joaoval.dsmovie.repositories;

import com.joaoval.dsmovie.entities.Score;
import com.joaoval.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
