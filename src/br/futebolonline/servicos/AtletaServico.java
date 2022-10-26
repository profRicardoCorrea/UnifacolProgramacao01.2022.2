package br.futebolonline.servicos;

import java.util.ArrayList;
import java.util.Date;

import br.futebolonline.entidades.Atleta;
import br.futebolonline.entidades.Time;
import br.futebolonline.enums.GeneroEnum;
import br.futebolonline.enums.JogadorStatusEnum;
import br.futebolonline.enums.PosicaoJogadorEnum;
import br.futebolonline.enums.SexoEnum;
import br.futebolonline.enums.TipoFuncionarioEnum;
import br.futebolonline.interfaces.servico.IAtletaServico;
import br.futebolonline.interfaces.servico.IBasicoServico;
import br.futebolonline.repositorios.AtletaRepositorio;
import br.futebolonline.repositorios.TimeMySqlRepositorio;

public class AtletaServico implements IBasicoServico<Atleta>, IAtletaServico{

	public void cadastrar(String nome, String cpf, Date dtNascimento, SexoEnum sexoEnum, GeneroEnum generoEnum,
			int matricula, Date dtContratacao, Date dtDemissao, Date dtRenovacao, TipoFuncionarioEnum tipoFuncionario,
			PosicaoJogadorEnum posicaoJogadorEnum, JogadorStatusEnum jogadorStatusEnum, long timeId) {
		try {
			
			Atleta novoAtleta=new Atleta(nome, cpf);
			novoAtleta.setDataContratacao(dtContratacao);
			novoAtleta.setDataDemissao(dtDemissao);
			novoAtleta.setDataNascimento(dtNascimento);
			novoAtleta.setDataRenovacao(dtRenovacao);
			novoAtleta.setSexo(sexoEnum);
			novoAtleta.setGenero(generoEnum);
			novoAtleta.setMatricula(matricula);
			novoAtleta.setTipoFuncionario(tipoFuncionario);
			novoAtleta.setPosicao(posicaoJogadorEnum);
			novoAtleta.setStatus(jogadorStatusEnum);
			novoAtleta.setTime(TimeMySqlRepositorio.getInstance().listarPorCodigo(timeId));
			
			AtletaRepositorio.getInstance().salvar(novoAtleta);
		} catch (Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		
	}

	@Override
	public ArrayList<Atleta> pesquisarPorPosicao(PosicaoJogadorEnum posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Atleta> pesquisarPorTime(Time time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Atleta> pesquisarPorStatus(JogadorStatusEnum status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salvar(Atleta et) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Atleta et) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Atleta> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Atleta listarPorCodigo(long condigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Atleta et) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirPorCodigo(long condigo) {
		// TODO Auto-generated method stub
		
	}

}
