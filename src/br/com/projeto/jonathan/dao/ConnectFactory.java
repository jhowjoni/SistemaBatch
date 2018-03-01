package br.com.projeto.jonathan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectFactory {

	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String BANCO = "jdbc:mysql://127.0.0.1:3306/projeto_back?autoReconnect=true&useSSL=false";
	private final String USUARIO = "root";
	private final String SENHA = "desenv";

	public Connection obterConexao() {
        
		Connection connection = null;
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			connection = DriverManager.getConnection(BANCO, USUARIO, SENHA);
			return connection;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return connection;
	}
}
