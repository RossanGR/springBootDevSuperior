package com.devsuperior.dslsit.servicies;

import com.devsuperior.dslsit.dto.GameMinDTO;
import com.devsuperior.dslsit.entities.Game;
import com.devsuperior.dslsit.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x-> new GameMinDTO(x)).toList();
//        Utilizando lambda
//        return result.stream().map(GameMinDTO::new).toList();
    }
}
