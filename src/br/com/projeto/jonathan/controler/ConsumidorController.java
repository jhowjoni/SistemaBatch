package br.com.projeto.jonathan.controler;

import java.sql.SQLException;

import br.com.projeto.jonathan.dao.ConsumidorDAO;

public class ConsumidorController {

	static ConsumidorDAO consumidorDAO = new ConsumidorDAO();
	
	public static void main(String[] argv) {

		try {
			consumidorDAO.inserir();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	


}
