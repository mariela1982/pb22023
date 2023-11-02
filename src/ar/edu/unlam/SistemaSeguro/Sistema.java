package ar.edu.unlam.SistemaSeguro;

import java.util.TreeSet;

public class Sistema  {
	
	private String nombre ="";
	private  TreeSet<Usuario> usuario;

	public Sistema(String nombre) {
		this.setNombre(nombre);
		usuario = new TreeSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TreeSet<Usuario> getUsuarioNuevo() {
		return usuario;
	}

	public void setUsuarioNuevo(Usuario usuarioNuevo) {
		this.usuario.add(usuarioNuevo);
	}

	public Boolean bloquearUsuario(Usuario nuevo) {
		if(nuevo instanceof Bloqueable ) {
			((UsuarioBasico)nuevo).esbloqueable(true);
			return true;
			
		} return false;
		
		
	}

	public void ingresarContraseña(Usuario nuevo, String contraseñaIncorrecta) {
		
		for (Usuario actual : usuario) {
			if (actual.getContraseña() != contraseñaIncorrecta && intentos<4) {
				intentos++;
				
			}
			
			
		} 
		
	}

	
	

}
