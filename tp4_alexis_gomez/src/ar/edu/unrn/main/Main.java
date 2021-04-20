package ar.edu.unrn.main;

import java.awt.EventQueue;
import java.sql.SQLException;

import ar.unrn.tp3.bd.JdbcParticipante;
import ar.unrn.tp3.ui.AgregarParticipante;

public class Main {
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AgregarParticipante(new JdbcParticipante());
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}
}