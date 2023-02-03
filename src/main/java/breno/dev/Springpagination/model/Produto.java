package breno.dev.Springpagination.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String descricao;
	private float valor;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}