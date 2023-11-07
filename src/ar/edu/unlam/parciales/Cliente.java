package ar.edu.unlam.parciales;

public class Cliente {
	private String cuit="";
	private String nombre = "";

	public Cliente(String cuit, String nombreDelCliente) {
		this.cuit = cuit;
		this.nombre = nombreDelCliente;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
