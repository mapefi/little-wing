package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		System.out.println("Conexão aberta!");
		c.close();
	}
	
}
