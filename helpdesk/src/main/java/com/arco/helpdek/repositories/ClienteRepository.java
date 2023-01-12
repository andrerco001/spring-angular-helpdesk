package com.arco.helpdek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arco.helpdek.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}