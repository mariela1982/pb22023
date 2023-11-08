package ar.edu.unlam.cumple;

import java.util.HashSet;

import java.util.Set;

public class PlanificadorDeEventos {
	private Set<Usuario> usuarios ;
	private Set<Evento> evento;
	
	public PlanificadorDeEventos() {
		this.usuarios = new HashSet<>();
		
		
	}

	public void add(Usuario usuario) {
		this.usuarios.add(usuario);
		
		
	}

	public Usuario getUsuario(String mailOrganizador) {
		for(Usuario actual: usuarios){
			if(actual.getMail().equals(mailOrganizador)) {
				return actual;
			}
		}
		return null;
	}

	public void crear(Usuario usuario, String nombreDelEvento) {
		if(nombreDelEvento.contains("cumple")) {
			evento.add( new Cumpleaños(usuario,nombreDelEvento));
			 
		}
		
		
		
		
		
	}

}
