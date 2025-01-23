package com.dev.DSList_backend.repositories;

import com.dev.DSList_backend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
