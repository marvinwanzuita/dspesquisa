package com.mwzt.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mwzt.dspesquisa.dto.RecordDTO;
import com.mwzt.dspesquisa.dto.RecordInsertDTO;
import com.mwzt.dspesquisa.entities.Game;
import com.mwzt.dspesquisa.entities.Record;
import com.mwzt.dspesquisa.repositories.GameRepository;
import com.mwzt.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		repository.save(entity);
		return new RecordDTO(entity);
	}
	
}
