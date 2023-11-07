package ar.edu.unlam.parciales;

public class DispositivoMovil extends Dispositivo {
	
	private Long imei;
	private Boolean biometria;

	public DispositivoMovil(String nombreDelDispositivo, String sistemaOperativo, String direccionIP,
			String localidadDeDireccion, Long imei) {
		super(nombreDelDispositivo, sistemaOperativo, direccionIP, localidadDeDireccion);
		this.setImei(imei);
		this.setBiometria(false);
	}

	public Long getImei() {
		return imei;
	}

	public void setImei(Long imei) {
		this.imei = imei;
	}

	public Boolean getBiometria() {
		return biometria;
	}

	public void setBiometria(Boolean biometria) {
		this.biometria = biometria;
	}

}
