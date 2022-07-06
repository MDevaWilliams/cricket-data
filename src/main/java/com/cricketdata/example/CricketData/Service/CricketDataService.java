package com.cricketdata.example.CricketData.Service;

import com.cricketdata.example.CricketData.Repository.CricketDataRepository;
import com.cricketdata.example.CricketData.resource.entity.CricketData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CricketDataService {
    @Autowired
    private CricketDataRepository repository;

    // to add the Player
    public CricketData addPlayer(CricketData Player) {
        return repository.save(Player);
    }

    // to get the Player based on his id
    public CricketData getPlayerById(int id) {
        return repository.findById(id).orElse(null);
    }

    // to get all the Player
    public List<CricketData> getAllPlayer() {
        return repository.findAll();
    }



    // to delete the Player
    public String deletePlayer(int id) {
        repository.deleteById(id);
        return "Player deleted";
    }

}
