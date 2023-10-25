package ar.edu.unlam.TpHerencia;

public class Sensor {
	private Double distaciaRecorrida;
	private Double tiempoTranscurrido;
	private Integer pasos;
	public Double getDistaciaRecorrida() {
		return distaciaRecorrida;
	}
	public void setDistaciaRecorrida(Double distaciaRecorrida) {
		this.distaciaRecorrida = distaciaRecorrida;
	}
	public Double getTiempoTranscurrido() {
		return tiempoTranscurrido;
	}
	public void setTiempoTranscurrido(Double tiempoTranscurrido) {
		this.tiempoTranscurrido = tiempoTranscurrido;
	}
	public Integer getPasos() {
		return pasos;
	}
	public void setPasos(Integer pasos) {
		this.pasos = pasos;
	}
	
// La determinación del estado del reloj se realizará a partir de la recepción de pulsos recibidos desde los sensores que contiene el mismo. Es decir: 
//
//		Cada un segundo se recibirá un pulso para incrementar el tiempo. 
//
//		Cada un metro se recibirá un pulso del GPS avisando el incremento. 
//
//		Cada paso que realice la persona se enviará un pulso informándolo. 
//
//		El resto de los parámetros recibirán el valor actualizado cada vez que se establezca la conexión con el sensor (velocidad, cadencia y frecuencia cardíaca). 
	
	
}
