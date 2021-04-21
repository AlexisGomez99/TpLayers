package ar.edu.unrn.main;

import java.awt.EventQueue;


import ar.unrn.tp3.bd.JdbcParticipante;
import ar.unrn.tp3.ui.AgregarParticipante;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AgregarParticipante(new JdbcParticipante());
			}
		});
	}
}