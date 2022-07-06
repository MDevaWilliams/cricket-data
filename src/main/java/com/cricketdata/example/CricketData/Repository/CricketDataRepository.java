package com.cricketdata.example.CricketData.Repository;

import com.cricketdata.example.CricketData.resource.entity.CricketData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketDataRepository extends JpaRepository<CricketData, Integer> {

}

