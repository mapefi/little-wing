package br.com.alura.listavip;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class Configuracao {
	
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);	
	}

// A confifuracao pode existir aqui ou no arquivo application.properties
//	@Bean
//	public DataSource dataSource(){
//		
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3307/listavip");
//		dataSource.setUsername("root");
//		dataSource.setPassword("admin");
//		
//		return dataSource;
//	}

}
