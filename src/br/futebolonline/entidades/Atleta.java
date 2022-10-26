package br.futebolonline.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.futebolonline.enums.JogadorStatusEnum;
import br.futebolonline.enums.PosicaoJogadorEnum;

public class Atleta extends Funcionario   {

	private PosicaoJogadorEnum posicao;

	private Time time;

	private JogadorStatusEnum status;

	private List<Cartao> cartoes = new ArrayList<Cartao>();

	public Atleta(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	public Atleta() {
		super(null, null);
		// TODO Auto-generated constructor stub
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public void setStatus(JogadorStatusEnum status) {
		this.status = status;
	}

	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}

	public PosicaoJogadorEnum getPosicao() {
		return posicao;
	}

	public void setPosicao(PosicaoJogadorEnum posicao) {
		this.posicao = posicao;
	}

	public JogadorStatusEnum getStatus() {
		return this.status;
	}

	public void setTitular(JogadorStatusEnum status) {
		this.status = status;
	}

	public List<Cartao> getCartoes() {
		return cartoes;
	}

	public void setCartoes(ArrayList<Cartao> cartoes) {
		this.cartoes = cartoes;
	}

}
