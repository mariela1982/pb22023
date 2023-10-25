package ar.edu.unlam.SistemaSeguro;

import java.util.TreeSet;

public class Sistema implements Comparable<Usuario> {
	
	private String nombre ="";
	private  TreeSet<Usuario> usuario;

	public Sistema(String nombre) {
		this.setNombre(nombre);
		setUsuario(new TreeSet<>());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean ingresarUsuario(Usuario nuevoUsuario) {
		    int i = usuario.size();
			usuario.add(nuevoUsuario);
			if (i == usuario.size()) {
				return false;
			}
			return true;
	}

	public TreeSet<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(TreeSet<Usuario> usuario) {
		this.usuario = usuario;
	}

	@Override
	public int compareTo(Usuario o) {
	 
		return 0;
	}
	
	

}
