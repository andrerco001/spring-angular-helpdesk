package com.arco.helpdek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arco.helpdek.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}