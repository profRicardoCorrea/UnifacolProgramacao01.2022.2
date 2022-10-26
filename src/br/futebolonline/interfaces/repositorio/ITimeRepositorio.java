package  br.futebolonline.interfaces.repositorio;

import java.util.ArrayList;

import br.futebolonline.entidades.Time;
import br.futebolonline.enums.TimeStatusEnum;

 

 

public interface ITimeRepositorio {
	 
	public ArrayList<Time> persquisarPorNome(String nome);
	public ArrayList<Time> persquisarStatus(TimeStatusEnum status);
	 
	

}
