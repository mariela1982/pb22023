package ar.edu.unlam.Seguro;

public class PolizaDeAuto extends SegurosGenerales {
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private Auto autoAsegurado;

	public PolizaDeAuto(Integer numeroDepoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDepoliza);
		this.asegurado =asegurado;
		this.prima = prima;
		this.sumaAsegurada = sumaAsegurada;
		this.asegurado =null;
	
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	public Double getPrima() {
		return prima;
	}

	public void setPrima(Double prima) {
		this.prima = prima;
	}

	public Auto getAutoAsegurado() {
		return autoAsegurado;
	}

	public void setAutoAsegurado(Auto autoAsegurado) {
		this.autoAsegurado = autoAsegurado;
	}

	@Override
	protected void agregarBienAsegurado(Auto auto) {
			
	}

}
