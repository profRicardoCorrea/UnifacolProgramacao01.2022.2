package br.futebolonline.interfaces.repositorio;

import java.util.ArrayList;
import java.util.Date;

import br.futebolonline.entidades.Funcionario;
import br.futebolonline.enums.TipoFuncionarioEnum;

public interface IFuncionarioRepositorio {
	Funcionario pesquisarPorMatricula(int matricula);
	ArrayList<Funcionario> pesquisarPorDtContratacao( Date dataContratacao); 
	ArrayList<Funcionario> pesquisarPorTipo(  TipoFuncionarioEnum tipoFuncionario);
}
