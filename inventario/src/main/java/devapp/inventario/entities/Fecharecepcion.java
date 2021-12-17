package devapp.inventario.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fecharecepcion")
public class Fecharecepcion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idfecharecepcion;
	
	
	private int iddespacho;
	private int idempleado;
	private String estado;
	private String fecha;
	
	public Fecharecepcion(int iddespacho, int idempleado, String estado, String fecha) {
		this.iddespacho = iddespacho;
		this.idempleado = idempleado;
		this.estado = estado;
		this.fecha = fecha;
	}

	public int getIddespacho() {
		return iddespacho;
	}

	public void setIddespacho(int iddespacho) {
		this.iddespacho = iddespacho;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getIdfecharecepcion() {
		return idfecharecepcion;
	}
	
	
	
	
	
	
	
}
