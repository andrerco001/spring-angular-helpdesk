package com.arco.helpdek.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arco.helpdek.domain.Chamado;
import com.arco.helpdek.domain.Cliente;
import com.arco.helpdek.domain.Tecnico;
import com.arco.helpdek.domain.enums.Perfil;
import com.arco.helpdek.domain.enums.Prioridade;
import com.arco.helpdek.domain.enums.Status;
import com.arco.helpdek.repositories.ChamadoRepository;
import com.arco.helpdek.repositories.ClienteRepository;
import com.arco.helpdek.repositories.TecnicoRepository;

@Service
public class DBServices {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "62537656040", "valdir@email.com", "123");
		tec1.addPerfis(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "56727930023", "torvalds@email.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}