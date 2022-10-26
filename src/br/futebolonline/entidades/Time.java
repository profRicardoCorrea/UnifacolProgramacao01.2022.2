package br.futebolonline.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.futebolonline.enums.TimeStatusEnum;

public class Time extends EntidadeBasica {

	private String nome;
	private Date dataCriacao;
	private Atleta tecnico;
	private List<Atleta> jogadores;
	private TimeStatusEnum status;

	public Time(String nome) {
		this.nome = nome;
	}

	public Time(String nome, Atleta tecnico) {
		this.nome = nome;
		this.tecnico = tecnico;
	}

	public Time() {	}

	public Time(String nome, Date dataCriacao, Atleta tecnico, List<Atleta> jogadores, TimeStatusEnum status) {
		super();
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.tecnico = tecnico;
		this.jogadores = jogadores;
		this.status = status;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public void setJogadores(List<Atleta> jogadores) {
		this.jogadores = jogadores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Atleta getTecnico() {
		return tecnico;
	}

	public void setTecnico(Atleta tecnico) {
		this.tecnico = tecnico;
	}

	public List<Atleta> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Atleta> jogadores) {
		this.jogadores = jogadores;
	}

	public TimeStatusEnum getStatus() {
		return status;
	}

	public void setStatus(TimeStatusEnum status) {
		this.status = status;
	}

}
