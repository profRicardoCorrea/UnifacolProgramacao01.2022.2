package br.futebolonline.interfaces.servico;

import java.util.ArrayList;
import java.util.Date;

import br.futebolonline.entidades.Funcionario;
import br.futebolonline.enums.GeneroEnum;
import br.futebolonline.enums.SexoEnum;
import br.futebolonline.enums.TipoFuncionarioEnum;

public interface IFuncionarioServico {
	void cadastrar(String nome, String cpf, Date dtNascimento, SexoEnum sexoEnum, GeneroEnum generoEnum, int matricula,
			Date dtContratacao, Date dtDemissao, Date dtRenovacao, TipoFuncionarioEnum tipoFuncionario, float salario);
	Funcionario pesquisarPorMatricula(int matricula);
	ArrayList<Funcionario> pesquisarPorDtContratacao( Date dataContratacao); 
	ArrayList<Funcionario> pesquisarPorTipo(  TipoFuncionarioEnum tipoFuncionario);
	

}
