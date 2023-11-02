package ar.edu.unlam.SistemaSeguro;

import java.util.Objects;

public abstract class  Usuario {
	private String nombre = "";
	private String contraseña = "";
	@SuppressWarnings("unused")
	private Integer intentos;
	

	public Usuario(String nombre) {
		this.setNombre(nombre);
		this.intentos = 0;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	

	protected abstract boolean crearContraseña(String contraseña)throws InvalidPasswordException;

	
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	

	
	

}
