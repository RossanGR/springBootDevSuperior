package com.devsuperior.dslsit.repositories;

import com.devsuperior.dslsit.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}