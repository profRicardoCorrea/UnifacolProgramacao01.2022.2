package servicos;

import entidades.Jogador;
import enums.PosicaoJogador;
import servicos.interfaces.IJogadorServico;

public class JogadorServico implements IJogadorServico {

	@Override
	public boolean contratar(Jogador jogador) {
		System.out.println("Nome JOGADOR OBJETO:"+jogador.getNome());
		return true;
	}

	@Override
	public boolean contratar(String nome, String cpf, String time, PosicaoJogador posicao, int camisa) {
		Jogador jog=new Jogador(nome, cpf, time, posicao, camisa);
		System.out.println("Nome JOGADOR PARMS:"+jog.getNome());
		return false;
	}

}
