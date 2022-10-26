package br.futebolonline.interfaces.repositorio;

import java.util.ArrayList;

import br.futebolonline.entidades.Atleta;
import br.futebolonline.entidades.Time;
import br.futebolonline.enums.JogadorStatusEnum;
import br.futebolonline.enums.PosicaoJogadorEnum;

public interface  IAtletaRepositorio{
	ArrayList<Atleta> pesquisarPorPosicao(PosicaoJogadorEnum posicao);
	ArrayList<Atleta> pesquisarPorTime(Time time);
	ArrayList<Atleta> pesquisarPorStatus(JogadorStatusEnum status);

}
