package com.arco.helpdek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arco.helpdek.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}