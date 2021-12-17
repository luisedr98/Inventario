package devapp.inventario.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detrecdes")
public class Detallerecdes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idderecdes;
	
	private int idproducto;
	private int iddespacho;
	private int cantidadproducto;
	private float subtotal;
	
	
	public Detallerecdes(int idproducto, int iddespacho, int cantidadproducto, float subtotal) {
		this.idproducto = idproducto;
		this.iddespacho = iddespacho;
		this.cantidadproducto = cantidadproducto;
		this.subtotal = subtotal;
	}


	public int getIdproducto() {
		return idproducto;
	}


	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}


	public int getIddespacho() {
		return iddespacho;
	}


	public void setIddespacho(int iddespacho) {
		this.iddespacho = iddespacho;
	}


	public int getCantidadproducto() {
		return cantidadproducto;
	}


	public void setCantidadproducto(int cantidadproducto) {
		this.cantidadproducto = cantidadproducto;
	}


	public float getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}


	public int getIdderecdes() {
		return idderecdes;
	}
	
	
	
	
}
