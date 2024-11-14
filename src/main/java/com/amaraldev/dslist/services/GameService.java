package com.amaraldev.dslist.services;

import com.amaraldev.dslist.dto.GameMinDto;
import com.amaraldev.dslist.entities.Game;
import com.amaraldev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> FindAll() {
        List<Game> result =gameRepository.findAll();
        List<GameMinDto> dto= result.stream().map(x->new GameMinDto(x)).toList();
        return dto;
    }
}
