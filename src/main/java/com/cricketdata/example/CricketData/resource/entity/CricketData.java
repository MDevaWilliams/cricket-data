package com.cricketdata.example.CricketData.resource.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CricketData {
    @Id
    private int id;
    private String name;
    private int runscored;
    private String playerType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunscored() {
        return runscored;
    }

    public void setRunscored(int runscored) {
        this.runscored = runscored;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }
    public CricketData(int id, String name, int runscored, String playerType ) {
        super();
        this.id = id;
        this.name = name;
        this.runscored = runscored ;
        this.playerType = playerType;
    }
    public CricketData() {
        super();
    }
    }
