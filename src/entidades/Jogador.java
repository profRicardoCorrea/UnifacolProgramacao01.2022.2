package entidades;

import enums.PosicaoJogador;

public class Jogador extends Pessoa{
	private String time;
	private PosicaoJogador posicao;
	private int camisa;
	
	
	
	public Jogador(String nome, String cpf, String time, PosicaoJogador posicao, int camisa) {
		super(nome, cpf);
		this.time = time;
		this.posicao = posicao;
		this.camisa = camisa;
	}
	
	public Jogador() {}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public PosicaoJogador getPosicao() {
		return posicao;
	}
	public void setPosicao(PosicaoJogador posicao) {
		this.posicao = posicao;
	}
	public int getCamisa() {
		return camisa;
	}
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}

	@Override
	public String validarCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
