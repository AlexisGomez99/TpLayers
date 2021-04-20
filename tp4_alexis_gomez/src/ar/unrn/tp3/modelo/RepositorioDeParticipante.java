package ar.unrn.tp3.modelo;

import java.sql.SQLException;

public interface RepositorioDeParticipante {
	
	void agregarPersona(Participante participante) throws SQLException;
	
}
