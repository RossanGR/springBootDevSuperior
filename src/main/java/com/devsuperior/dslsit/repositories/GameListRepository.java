package com.devsuperior.dslsit.repositories;

import com.devsuperior.dslsit.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
