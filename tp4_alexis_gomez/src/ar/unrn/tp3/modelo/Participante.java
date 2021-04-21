package ar.unrn.tp3.modelo;


public class Participante {
	private String nombre;
	private String telefono;
	private String region;
	
	
	
	public Participante(String nombre, String telefono, String region) throws RuntimeException {
		super();
		 if (nombre.equals("")) 
			throw new RuntimeException("Debe cargar un nombre");
		 
		 if (telefono.equals("")) 
			 throw new RuntimeException("Debe cargar un telefono");
		 
		 if (!validarTelefono(telefono)) 
			 throw new RuntimeException("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN");  	 
		 
		 if (!region.equals("China") && !region.equals("US") && !region.equals("Europa")) 
			 throw new RuntimeException("Region desconocida. Las conocidas son: China, US, Europa");
		 

		this.nombre = nombre;
		this.telefono = telefono;
		this.region = region;
	}

	public String nombre() {
		return nombre;
	}

	public String telefono() {
		return telefono;
	}

	public String region() {
		return region;
	}
	
	private boolean validarTelefono(String telefono) {
		String regex = "\\d{4}-\\d{6}";
		return telefono.matches(regex);
	}

}
