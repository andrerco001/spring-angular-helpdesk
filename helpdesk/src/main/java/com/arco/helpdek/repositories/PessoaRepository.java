package com.arco.helpdek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arco.helpdek.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}