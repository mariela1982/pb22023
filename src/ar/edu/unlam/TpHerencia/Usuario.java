package ar.edu.unlam.TpHerencia;

public class Usuario {
	private String nombre = " ";
	private Integer edad ;
	private Double peso ;
	private Double altura;
	
	public Usuario(String nombre, Integer edad, Double peso, Double altura) {
		this.altura = altura;
		this.edad = edad;
		this.nombre = nombre;
		this.peso = peso;
		
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

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	

}
