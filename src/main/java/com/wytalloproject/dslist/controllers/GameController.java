package com.wytalloproject.dslist.controllers;

import com.wytalloproject.dslist.dto.GameMinDTO;
import com.wytalloproject.dslist.entities.Game;
import com.wytalloproject.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        var result = gameService.findAll();
        return result;
    }
}
