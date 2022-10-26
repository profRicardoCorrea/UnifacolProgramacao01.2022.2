package br.futebolonline.interfaces.servico;

import java.util.ArrayList;

import br.futebolonline.entidades.Atleta;
import br.futebolonline.enums.CartoesEnum;

public interface ICartaoServico {
	ArrayList<CartoesEnum> pesquisarPorCartao(CartoesEnum cartao);
	ArrayList<CartoesEnum> pesquisarPorAtleta(Atleta atleta);
}
