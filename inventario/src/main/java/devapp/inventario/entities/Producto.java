package devapp.inventario.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproducto;
	private int categoria;
	private String nombre;
	private String descripcion;
	private float valorunitario;
	private int cantidad;
	
	public Producto(int categoria, String nombre, String descripcion, float valorunitario, int cantidad) {
		super();
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.valorunitario = valorunitario;
		this.cantidad = cantidad;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(float valorunitario) {
		this.valorunitario = valorunitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdproducto() {
		return idproducto;
	}
	
	
}
