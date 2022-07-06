package com.cricketdata.example.CricketData.controller;


import com.cricketdata.example.CricketData.Service.CricketDataService;
import com.cricketdata.example.CricketData.resource.entity.CricketData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CricketDataController {

    @Autowired
    private CricketDataService service;

    @GetMapping("/player/{id}")
    public CricketData getPlayerById(@PathVariable int id) {
        return service.getPlayerById(id);
    }

    @GetMapping("/Player")
    public List<CricketData> getPlayer(){
        return service.getAllPlayer();
    }
    @PostMapping("/Player")
    public CricketData savePlayer(@RequestBody CricketData Player) {
        return service.addPlayer(Player);
    }

}
