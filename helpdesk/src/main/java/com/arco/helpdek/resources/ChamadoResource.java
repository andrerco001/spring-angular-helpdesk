package com.arco.helpdek.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arco.helpdek.domain.Chamado;
import com.arco.helpdek.domain.dtos.ChamadoDTO;
import com.arco.helpdek.services.ChamadoService;

@RestController
@RequestMapping(value = "/chamados")
public class ChamadoResource {

	@Autowired
	private ChamadoService chamadoService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<ChamadoDTO> findById(@PathVariable Integer id) {
		Chamado obj = chamadoService.findById(id);
		return ResponseEntity.ok().body(new ChamadoDTO(obj));
	}

	@GetMapping
	public ResponseEntity<List<ChamadoDTO>> findAll() {
		List<Chamado> chamados = chamadoService.fidAll();
		List<ChamadoDTO> chamadosDTO = chamados.stream().map(c -> new ChamadoDTO(c)).collect(Collectors.toList());
		return ResponseEntity.ok().body(chamadosDTO);
	}
}