package ar.edu.unlam.Seguro;

public class Auto {
	private String marca ;
	private String modelo;
	private Integer anio;
	private Double sumaAsegurada;

	public Auto(String marca, String modelo, Integer anio, Double sumaAsegurada) {
		this.anio = anio;
		this.marca = marca;
		this.modelo = modelo;
		this.sumaAsegurada = sumaAsegurada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	

}
