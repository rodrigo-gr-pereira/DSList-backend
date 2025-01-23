package com.dev.DSList_backend.repositories;

import com.dev.DSList_backend.entities.Game;
import com.dev.DSList_backend.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
