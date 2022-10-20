package gui;


import entidades.Jogador;
import enums.PosicaoJogador;
import servicos.JogadorServico;

public class MainJogador {
	public static void main(String[]args) {
		System.out.println(PosicaoJogador.Atacante.ordinal());
		System.out.println(PosicaoJogador.Goleiro.ordinal());
		PosicaoJogador p=PosicaoJogador.Goleiro;
		
		if(p==PosicaoJogador.Goleiro) {
			System.out.println("GOLEIRO");
			System.out.println(p);
		}
		
		Jogador j= new Jogador();
		
		j.setNome("Jogaor 1");
		j.setCpf("0000000");
		j.setCamisa(12);
		j.setPosicao(PosicaoJogador.MeioCampo);
		j.setTime("Sport");
		System.out.println(j.getNome());
		
		JogadorServico js=new JogadorServico();
		js.contratar(j);
		js.contratar("Jogaor 2","111111","TIME 2",PosicaoJogador.Atacante,2);
		
	}

}
