package br.com.caelum.tarefas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/fj21-jdbc", "root", "admin");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
