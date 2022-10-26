package  br.futebolonline.interfaces.servico;

import java.util.ArrayList;

 

public interface IBasicoServico<Entidade> {
	public void salvar(Entidade et);
	public void alterar(Entidade et); 
	public ArrayList<Entidade> listarTodos();
	public Entidade listarPorCodigo(long condigo);
	public void excluir(Entidade et);
	public void excluirPorCodigo(long  condigo);
}
