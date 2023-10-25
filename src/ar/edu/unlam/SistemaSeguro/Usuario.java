package ar.edu.unlam.SistemaSeguro;

public abstract class  Usuario {
	private String nombre = "";
	private String contraseña = "";
	

	public Usuario(String nombre) {
		this.setNombre(nombre);
		
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
	
	public abstract void ingresarContraseña(String contraseña);

	protected abstract boolean crearContraseña(String contraseña2);

	
	

}
