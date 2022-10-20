package servicos.interfaces;

import entidades.Jogador;
import enums.PosicaoJogador;

public interface IJogadorServico {
	public boolean contratar(Jogador jogador);
	public boolean contratar(String nome, String cpf, String time, PosicaoJogador posicao, int camisa);

}
