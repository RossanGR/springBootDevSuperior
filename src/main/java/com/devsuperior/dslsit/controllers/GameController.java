package com.devsuperior.dslsit.controllers;

import com.devsuperior.dslsit.dto.GameMinDTO;
import com.devsuperior.dslsit.entities.Game;
import com.devsuperior.dslsit.servicies.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GameController {

    @Autowired
    private GameService gameService;
    @GetMapping("/games")
    public List<GameMinDTO> findAll(){
//        List<Game> result =  gameService.findAll();
//        gameService.findAll().stream().toList();
        return gameService.findAll();
    }
}
