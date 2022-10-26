package br.futebolonline.repositorios;

import java.util.ArrayList;
import java.util.Date;

import br.futebolonline.entidades.Funcionario; 
import br.futebolonline.enums.TipoFuncionarioEnum;
import br.futebolonline.interfaces.repositorio.IBasicoRepositorio;
import br.futebolonline.interfaces.repositorio.IFuncionarioRepositorio; 

public class FuncionarioRepositorio implements IBasicoRepositorio<Funcionario>, IFuncionarioRepositorio {

	private ArrayList<Funcionario> funcionarioRepositorio;

	public FuncionarioRepositorio(ArrayList<Funcionario> funcionarioRepositorio) {
		this.funcionarioRepositorio = funcionarioRepositorio;
	}

	public void salvar(Funcionario funcionario) {
		try {
			this.funcionarioRepositorio.add(funcionario);

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Funcionario.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		}

	}

	public void alterar(Funcionario funcionario) {
		try {
			for (Funcionario FuncionarioPesquisa : funcionarioRepositorio) {
				if (FuncionarioPesquisa.getCodigo().equals(funcionario.getCodigo())) {
					FuncionarioPesquisa = funcionario;
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Funcionario.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();

		}

	}

	@SuppressWarnings("unchecked")
	public ArrayList<Funcionario> listarTodos() {

		try {
			return this.funcionarioRepositorio;
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Funcionario.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
			return new ArrayList<Funcionario>();

		}
	}

	@Override
	public void excluirPorCodigo(long codigo) {
		try {
			for (Funcionario funcionarioPesquisa : funcionarioRepositorio) {
				if (funcionarioPesquisa.getCodigo()==codigo) {
					funcionarioRepositorio.remove(funcionarioPesquisa);
					break;
				}
			}

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Funcionario.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		}
	}

	public Funcionario listarPorCodigo(long codigo) {
		try {
			for (Funcionario funcionarioPesquisa : funcionarioRepositorio) {
				if (funcionarioPesquisa.getCodigo() == codigo) {
					return funcionarioPesquisa;
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Funcionario.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		} finally {
			return null;
		}

	}

	@Override
	public Funcionario pesquisarPorMatricula(int matricula) {
		try {
			for (Funcionario funcionarioPesquisa : funcionarioRepositorio) {
				if (funcionarioPesquisa.getMatricula() == matricula) {
					return funcionarioPesquisa;
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Funcionario.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		} finally {
			return null;
		}
	}

	@Override
	public ArrayList<Funcionario> pesquisarPorDtContratacao(Date dataContratacao) {
		ArrayList<Funcionario> resultado = new ArrayList<Funcionario>();
		try {
			for (Funcionario funcionarioPesquisa : funcionarioRepositorio) {
				if (funcionarioPesquisa.getDataContratacao() == dataContratacao) {
					resultado.add(funcionarioPesquisa);
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Funcionario.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		} finally {
			return resultado;
		}
	}

	@Override
	public ArrayList<Funcionario> pesquisarPorTipo(TipoFuncionarioEnum tipoFuncionario) {
		ArrayList<Funcionario> resultado = new ArrayList<Funcionario>();
		try {
			for (Funcionario funcionarioPesquisa : funcionarioRepositorio) {
				if (funcionarioPesquisa.getTipoFuncionario() == tipoFuncionario) {
					resultado.add(funcionarioPesquisa);
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Funcionario.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		} finally {
			return resultado;
		}
	}

}
