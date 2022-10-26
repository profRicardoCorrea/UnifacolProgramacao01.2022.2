package  br.futebolonline.interfaces.servico;

import java.util.ArrayList;
import java.util.Date;

import br.futebolonline.entidades.Time;
import br.futebolonline.enums.TimeStatusEnum;



public interface ITimeServico {
	 
	public void cadastrar(String nome ,int idTecnico,Date dataCriacao,TimeStatusEnum statusEnum); 
	public ArrayList<Time> persquisarPorNome(String nome);	
	public ArrayList<Time> persquisarStatus(TimeStatusEnum status);
	 

}
