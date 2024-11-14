package com.amaraldev.dslist.controllers;


import com.amaraldev.dslist.dto.GameMinDto;
import com.amaraldev.dslist.entities.Game;
import com.amaraldev.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> getGames() {
        List<GameMinDto> result= gameService.FindAll();
        return result;
    }
}
