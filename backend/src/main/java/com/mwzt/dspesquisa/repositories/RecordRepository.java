package com.mwzt.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mwzt.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
