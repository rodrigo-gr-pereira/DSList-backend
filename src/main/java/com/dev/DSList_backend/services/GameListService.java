package com.dev.DSList_backend.services;

import com.dev.DSList_backend.dto.GameDTO;
import com.dev.DSList_backend.dto.GameListDTO;
import com.dev.DSList_backend.dto.GameMinDTO;
import com.dev.DSList_backend.entities.Game;
import com.dev.DSList_backend.entities.GameList;
import com.dev.DSList_backend.repositories.GameListRepository;
import com.dev.DSList_backend.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
