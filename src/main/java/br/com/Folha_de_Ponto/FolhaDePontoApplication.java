package br.com.Folha_de_Ponto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class FolhaDePontoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolhaDePontoApplication.class, args);
		System.out.print(new BCryptPasswordEncoder().encode("123"));
	}

}
