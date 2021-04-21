package ar.unrn.tp3.modelo;

public class SinAccesoABDException extends Exception{
	
	public SinAccesoABDException() {
		super("No se pudo conectar con la base de datos");
	}

}
