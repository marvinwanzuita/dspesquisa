package com.mwzt.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mwzt.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
