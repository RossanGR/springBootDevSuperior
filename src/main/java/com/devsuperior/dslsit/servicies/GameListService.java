package com.devsuperior.dslsit.servicies;

import com.devsuperior.dslsit.dto.GameListDTO;
import com.devsuperior.dslsit.entities.GameList;
import com.devsuperior.dslsit.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll(){
        return gameListRepository.findAll().stream().map(GameListDTO::new).toList();
    }

}
