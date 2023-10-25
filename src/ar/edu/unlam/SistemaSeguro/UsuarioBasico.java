package ar.edu.unlam.SistemaSeguro;

public class UsuarioBasico extends Usuario implements Bloqueable,Eliminable{

	public UsuarioBasico(String nombre) {
		super(nombre);
		
	}

	@Override
	public void ingresarContraseña(String contraseña) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean crearContraseña(String contraseña2) {
		
		return false;
	}

}
