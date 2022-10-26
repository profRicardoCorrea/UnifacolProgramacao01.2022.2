package br.futebolonline.repositorios;

import java.util.ArrayList;

import br.futebolonline.entidades.Atleta;
import br.futebolonline.entidades.Cartao;
import br.futebolonline.enums.CartoesEnum;
import br.futebolonline.interfaces.repositorio.IBasicoRepositorio;
import br.futebolonline.interfaces.repositorio.ICartaoRepositorio;

public class CartaoRepositorio implements IBasicoRepositorio<Cartao>, ICartaoRepositorio {

	private ArrayList<Cartao> cartaoRepositorio;

	public CartaoRepositorio(ArrayList<Cartao> cartaoRepositorio) {
		this.cartaoRepositorio = cartaoRepositorio;
	}

	public void salvar(Cartao Cartao) {
		try {
			this.cartaoRepositorio.add(Cartao);

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Cartao.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		}

	}

	public void alterar(Cartao Cartao) {
		try {
			for (Cartao CartaoPesquisa : cartaoRepositorio) {
				if (CartaoPesquisa.getCodigo().equals(Cartao.getCodigo())) {
					CartaoPesquisa = Cartao;
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Cartao.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();

		}

	}

	@SuppressWarnings("unchecked")
	public ArrayList<Cartao> listarTodos() {

		try {
			return this.cartaoRepositorio;
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Cartao.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
			return new ArrayList<Cartao>();

		}
	} 
	public Cartao listarPorCodigo(long codigo) {
		try {
			for (Cartao CartaoPesquisa : cartaoRepositorio) {
				if (CartaoPesquisa.getCodigo() == codigo) {
					return CartaoPesquisa;
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Cartao.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		} finally {
			return null;
		}

	}

	public void excluirPorCodigo(long codigo) {
		try {
			for (Cartao CartaoPesquisa : cartaoRepositorio) {
				if (CartaoPesquisa.getCodigo() == codigo) {
					cartaoRepositorio.remove(CartaoPesquisa);
					break;
				}
			}

		} catch (Exception ex) {
			System.out.println(">>>Error:" + Cartao.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		}
	}

	@Override
	public ArrayList<Cartao> pesquisarPorCartao(CartoesEnum cartao) {
		ArrayList<Cartao> reusltadoCartoes=new ArrayList<Cartao>();
		try {
			for (Cartao CartaoPesquisa : cartaoRepositorio) {
				if (CartaoPesquisa.getCartao() == cartao) {
					reusltadoCartoes.add(CartaoPesquisa);
				}
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Cartao.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		} finally {
			return null;
		}
	}

	@Override
	public ArrayList<Cartao> pesquisarPorAtleta(Atleta atleta) {
		ArrayList<Cartao> reusltadoCartoes=new ArrayList<Cartao>();
		try {
			for (Cartao CartaoPesquisa : cartaoRepositorio) {
				for (Atleta atletaPesquisa : CartaoPesquisa.getAtletas()) {
					if (atletaPesquisa.getCpf().equals(atleta.getCpf())) {
						reusltadoCartoes.add(CartaoPesquisa);
					}
				} 
				
			}
		} catch (Exception ex) {
			System.out.println(">>>Error:" + Cartao.class.getName() + " message_error:" + ex.getMessage());
			ex.printStackTrace();
		} finally {
			return null;
		}
	}

}
