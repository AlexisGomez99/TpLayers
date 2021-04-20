package ar.unrn.tp3.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.unrn.tp3.modelo.Participante;
import ar.unrn.tp3.modelo.RepositorioDeParticipante;

public class JdbcParticipante implements RepositorioDeParticipante{

	@Override
	public void agregarPersona(Participante participante) throws SQLException {
		Connection myConexion;
		
		try {
			myConexion = ConexionBD.conexion();
			PreparedStatement st = myConexion.prepareStatement("insert into participantes(nombre, telefono, region) values(?,?,?)");
			 st.setString(1, participante.nombre());
			 st.setString(2, participante.telefono());
			 st.setString(3, participante.region());
			 st.executeUpdate();
			 st.close();
			 myConexion.close();
		} catch (ClassNotFoundException | SQLException e) {
			new RuntimeException("No se pudo conectar con la base de datos",e);
		}
		
	 }

	
	

}
