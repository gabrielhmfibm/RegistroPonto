package br.com.Folha_de_Ponto.entities;

import lombok.Getter;

@Getter
public class UserDTO {

	private String name;
	private String email;
	private String phone;
	
	public User transformaParaObjeto() {
		return new User(name, email, phone);
	}
}
