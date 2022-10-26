package br.futebolonline.repositorios;

import java.util.ArrayList;
 
import br.futebolonline.entidades.Time;
import br.futebolonline.enums.TimeStatusEnum; 
import br.futebolonline.interfaces.repositorio.IBasicoRepositorio;
import br.futebolonline.interfaces.repositorio.ITimeRepositorio; 

public class TimeRepositorio implements IBasicoRepositorio<Time>, ITimeRepositorio {

	private ArrayList<Time> timeRepositorio;

	public TimeRepositorio(ArrayList<Time> timeRepositorio) {
		this.timeRepositorio = timeRepositorio;
	}

	public void salvar(Time time) {
		try {
			this.timeRepositorio.add(time);

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Time.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		}

	}

	public void alterar(Time time) {
		try {
			for (Time TimePesquisa : timeRepositorio) {
				if (TimePesquisa.getCodigo().equals(time.getCodigo())) {
					TimePesquisa = time;
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Time.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();

		}

	}

	@SuppressWarnings("unchecked")
	public ArrayList<Time> listarTodos() {

		try {
			return this.timeRepositorio;
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Time.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
			return new ArrayList<Time>();

		}
	}

	@Override
	public void excluirPorCodigo(long codigo) {
		try {
			for (Time timePesquisa : timeRepositorio) {
				if (timePesquisa.getCodigo()==codigo) {
					timeRepositorio.remove(timePesquisa);
					break;
				}
			}

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Time.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		}
	}

	public Time listarPorCodigo(long codigo) {
		try {
			for (Time timePesquisa : timeRepositorio) {
				if (timePesquisa.getCodigo() == codigo) {
					return timePesquisa;
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Time.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		} finally {
			return null;
		}

	}

	@Override
	public ArrayList<Time> persquisarPorNome(String nome) {
		ArrayList<Time> resultadoPesquisa=new ArrayList<Time> ();
		try {
			for (Time timePesquisa : timeRepositorio) {
				if (timePesquisa.getNome().equals(nome)) {
					resultadoPesquisa.add(timePesquisa);
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Time.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		} finally {
			return resultadoPesquisa;
		}
	}

	@Override
	public ArrayList<Time> persquisarStatus(TimeStatusEnum status) {
		ArrayList<Time> resultadoPesquisa=new ArrayList<Time> ();
		try {
			for (Time timePesquisa : timeRepositorio) {
				if (timePesquisa.getStatus()==status) {
					resultadoPesquisa.add(timePesquisa);
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Time.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		} finally {
			return resultadoPesquisa;
		}
	}
 

}
