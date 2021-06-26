package com.kshtzraj.ipldashboard.repository;

import com.kshtzraj.ipldashboard.model.Team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
