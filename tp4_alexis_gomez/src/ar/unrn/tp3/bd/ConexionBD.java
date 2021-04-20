package ar.unrn.tp3.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:derby://localhost:1527/participantes";
    private static final String USUARIO = "app";
    private static final String CLAVE="app";
    
    private ConexionBD() {
    	
    }
	public static Connection conexion() throws ClassNotFoundException, SQLException {
		Connection conexion = null;
        Class.forName(CONTROLADOR);
        conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
        System.out.println("Obtuvo acceso a su Base de Datos.");
        return conexion; 
	}
    
}
