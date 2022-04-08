package br.com.Folha_de_Ponto.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserResponseDTO {

	private Long idUser;
	private String name;
	private String email;
	private String phone;
	
	public static UserResponseDTO transformaEmDTO(User user) {
	    return new UserResponseDTO(user.getIdUser(), user.getName(), user.getEmail(), user.getPhone());
	}
}
