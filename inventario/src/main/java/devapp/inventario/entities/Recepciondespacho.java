package devapp.inventario.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recepciondespacho")
public class Recepciondespacho {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idrecepciondespacho;
	
	private int idcliente;
	private float valortotal;
	private float valorgarantia;
	
	
	public Recepciondespacho(int idcliente, float valortotal, float valorgarantia) {
		this.idcliente = idcliente;
		this.valortotal = valortotal;
		this.valorgarantia = valorgarantia;
	}
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public float getValortotal() {
		return valortotal;
	}
	public void setValortotal(float valortotal) {
		this.valortotal = valortotal;
	}
	public float getValorgarantia() {
		return valorgarantia;
	}
	public void setValorgarantia(float valorgarantia) {
		this.valorgarantia = valorgarantia;
	}
	public int getIdrecepciondespacho() {
		return idrecepciondespacho;
	}
	
	
	
}
