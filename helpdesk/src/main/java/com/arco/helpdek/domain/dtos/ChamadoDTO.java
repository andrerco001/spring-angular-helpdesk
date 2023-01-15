package com.arco.helpdek.domain.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import com.arco.helpdek.domain.Chamado;
import com.arco.helpdek.domain.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ChamadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAbertura = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFechamento;
	private Integer prioridade;
	private Status status;
	private String titulo;
	private String observacoes;
	private Integer tecnico;
	private Integer cliente;
	private String nomeTecnico;
	private String nomeCliente;

	public ChamadoDTO() {
		super();
	}

	public ChamadoDTO(Chamado chamado) {
		super();
		this.id = chamado.getId();
		this.dataAbertura = chamado.getDataAbertura();
		this.dataFechamento = chamado.getDataFechamento();
		this.prioridade = chamado.getPrioridade().getCodigo();
		this.status = chamado.getStatus();
		this.titulo = chamado.getTitulo();
		this.observacoes = chamado.getObservacoes();
		this.tecnico = chamado.getTecnico().getId();
		this.cliente = chamado.getCliente().getId();
		this.nomeTecnico = chamado.getTecnico().getNome();
		this.nomeCliente = chamado.getCliente().getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Integer getTecnico() {
		return tecnico;
	}

	public void setTecnico(Integer tecnico) {
		this.tecnico = tecnico;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	public String getNomeTecnico() {
		return nomeTecnico;
	}

	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
}