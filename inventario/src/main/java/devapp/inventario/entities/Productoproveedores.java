package devapp.inventario.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productoprov")
public class Productoproveedores {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductoprov;

	private int idproducto;
	private int idprovedores;
	
	
	public Productoproveedores(int idproducto, int idprovedores) {
		this.idproducto = idproducto;
		this.idprovedores = idprovedores;
	}
	
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getIdprovedores() {
		return idprovedores;
	}
	public void setIdprovedores(int idprovedores) {
		this.idprovedores = idprovedores;
	}
	public int getId() {
		return idproductoprov;
	}
	
	
}
