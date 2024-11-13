package com.devsuperior.dslsit.controllers;

import com.devsuperior.dslsit.dto.GameListDTO;
import com.devsuperior.dslsit.dto.GameMinDTO;
import com.devsuperior.dslsit.servicies.GameListService;
import com.devsuperior.dslsit.servicies.GameService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GameListController {
    private static final Logger log = LogManager.getLogger(GameListController.class);
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping("/lists")
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping("/lists/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        log.info("Id: " + listId);
        return gameService.findByList(listId);
    }
}
