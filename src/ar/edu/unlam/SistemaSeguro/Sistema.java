package ar.edu.unlam.SistemaSeguro;

import java.util.TreeSet;

public class Sistema  {
	
	private String nombre ="";
	private  TreeSet<Usuario> usuario;
	private Integer intentos = 0;

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

	public void login(Usuario nuevo, String contraseña) {
		
		Usuario actual = buscarUsuario(nuevo);
		if (actual != null)
		do {
			if (actual.getContraseña() != contraseña ) {
				 intentos++;
				 ingresarContraseña(contraseña);
			}
			
			
		} while  (intentos<3);
		
	}

	private void ingresarContraseña(String contraseña) {
		
		
	}

	private Usuario buscarUsuario(Usuario nuevo) {
		for(Usuario actual:usuario) {
			if (actual.getNombre().equals(nuevo.getNombre())) {
				return nuevo;
				}
		}
		return null;
	}

	
	

}
