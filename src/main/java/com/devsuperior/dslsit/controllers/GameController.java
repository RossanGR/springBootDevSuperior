package com.devsuperior.dslsit.controllers;

import com.devsuperior.dslsit.dto.GameDTO;
import com.devsuperior.dslsit.dto.GameMinDTO;
import com.devsuperior.dslsit.servicies.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/games/{id}")
    public GameDTO findById(@PathVariable(value = "id") Long id){
        return gameService.findById(id);
    }
}
