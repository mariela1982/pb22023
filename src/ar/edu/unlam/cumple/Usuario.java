package ar.edu.unlam.cumple;

import java.util.Objects;

public class Usuario {
	private String mail;
	private String nombre;
	private Integer edad;
	

	public Usuario(String mail, String nombre, Integer edad) {
		this.edad = edad;
		this.mail= mail;
		this.nombre = nombre;
		
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	@Override
	public int hashCode() {
		return Objects.hash(mail);
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
		return Objects.equals(mail, other.mail);
	}
	
	

}
