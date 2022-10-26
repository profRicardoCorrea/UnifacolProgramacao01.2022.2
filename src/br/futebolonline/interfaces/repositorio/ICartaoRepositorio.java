package br.futebolonline.interfaces.repositorio;

import java.util.ArrayList;

import br.futebolonline.entidades.Atleta;
import br.futebolonline.entidades.Cartao;
import br.futebolonline.enums.CartoesEnum;

public interface ICartaoRepositorio {
	ArrayList<Cartao> pesquisarPorCartao(CartoesEnum cartao);
	ArrayList<Cartao> pesquisarPorAtleta(Atleta atleta);
}
