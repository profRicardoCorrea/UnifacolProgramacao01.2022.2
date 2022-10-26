package br.futebolonline.entidades;
 
import java.util.Date;
import java.util.List; 
import br.futebolonline.enums.CartoesEnum; 
 
public class Cartao  extends EntidadeBasica  { 
	 
	private CartoesEnum cartao;	 
	private Date dataAplicacao;		 
	private Date fimAplicacao;
	private float valorMulta;
	private List<Atleta> atletas ;
	
	
	public List<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}
	public CartoesEnum getCartao() {
		return cartao;
	}
	public void setCartao(CartoesEnum cartao) {
		this.cartao = cartao;
	}
	public Date getDataAplicacao() {
		return dataAplicacao;
	}
	public void setDataAplicacao(Date dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}
	public Date getFimAplicacao() {
		return fimAplicacao;
	}
	public void setFimAplicacao(Date fimAplicacao) {
		this.fimAplicacao = fimAplicacao;
	}
	public float getValorMulta() {
		return valorMulta;
	}
	public void setValorMulta(float valorMulta) {
		this.valorMulta = valorMulta;
	}
	

}
