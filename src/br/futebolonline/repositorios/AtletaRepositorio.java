package br.futebolonline.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.futebolonline.entidades.Atleta;
import br.futebolonline.entidades.Time;
import br.futebolonline.enums.JogadorStatusEnum;
import br.futebolonline.enums.PosicaoJogadorEnum;
import br.futebolonline.interfaces.repositorio.IAtletaRepositorio;
import br.futebolonline.interfaces.repositorio.IBasicoRepositorio;

public class AtletaRepositorio implements IBasicoRepositorio<Atleta>, IAtletaRepositorio {
	private ArrayList<Atleta> atletasRepositorio;

	public AtletaRepositorio(ArrayList<Atleta> atletasRepositorio) {
		this.atletasRepositorio = atletasRepositorio;
	}

	public void salvar(Atleta atleta) {
		try {
			this.atletasRepositorio.add(atleta);

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Atleta.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		}

	}

	public void alterar(Atleta atleta) {
		try {
			for (Atleta atletaPesquisa : atletasRepositorio) {
				if (atletaPesquisa.getCpf().equals(atleta.getCpf())) {
					atletaPesquisa = atleta;
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Atleta.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();

		}

	}

	@SuppressWarnings("unchecked")
	public ArrayList<Atleta> listarTodos() {

		try {
			return this.atletasRepositorio;
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Atleta.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
			return new ArrayList<Atleta>();

		}
	}
 

	public Atleta listarPorCodigo(long codigo) {
		try {
			for (Atleta atletaPesquisa : atletasRepositorio) {
				if (atletaPesquisa.getCodigo() == codigo) {
					return atletaPesquisa;
				}
			}

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Atleta.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		} finally {
			return null;
		}

	}

	 

	public void excluirPorCodigo(long codigo) {
		try {
			for (Atleta atletaPesquisa : atletasRepositorio) {
				if (atletaPesquisa.getCodigo() ==codigo) {
					atletasRepositorio.remove(atletaPesquisa);
					break;
				}
			}

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Atleta.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		}
	}

	@Override
	public ArrayList<Atleta> pesquisarPorPosicao(PosicaoJogadorEnum posicao) {
		ArrayList<Atleta> resultados=new ArrayList<Atleta>();
		try {
			for (Atleta atletaPesquisa : atletasRepositorio) {
				if (atletaPesquisa.getPosicao() == posicao) {
					resultados.add(atletaPesquisa);
				}
			}

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Atleta.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();

		} finally {
			return resultados;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public ArrayList<Atleta> pesquisarPorTime(Time time) {
		ArrayList<Atleta> resultados=new ArrayList<Atleta>();
		try {
			for (Atleta atletaPesquisa : atletasRepositorio) {
				if (atletaPesquisa.getTime().getCodigo() == time.getCodigo()) {
					resultados.add(atletaPesquisa);
				}
			}

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Atleta.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();

		} finally {
			return resultados;
		}
	}
	@SuppressWarnings("finally")
	@Override
	public ArrayList<Atleta> pesquisarPorStatus(JogadorStatusEnum status) {
		ArrayList<Atleta> resultados=new ArrayList<Atleta>();
		try {
			for (Atleta atletaPesquisa : atletasRepositorio) {
				if (atletaPesquisa.getStatus() == status) {
					resultados.add(atletaPesquisa);
				}
			}

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Atleta.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();

		} finally {
			return resultados;
		}
	}

}
