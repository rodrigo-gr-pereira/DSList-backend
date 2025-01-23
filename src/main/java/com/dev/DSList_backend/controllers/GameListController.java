package com.dev.DSList_backend.controllers;

import com.dev.DSList_backend.dto.GameDTO;
import com.dev.DSList_backend.dto.GameListDTO;
import com.dev.DSList_backend.dto.GameMinDTO;
import com.dev.DSList_backend.services.GameListService;
import com.dev.DSList_backend.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
