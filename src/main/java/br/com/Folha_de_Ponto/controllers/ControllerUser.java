package br.com.Folha_de_Ponto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.Folha_de_Ponto.entities.User;
import br.com.Folha_de_Ponto.services.ServiceUser;

@Controller
public class ControllerUser {
	
	private final ServiceUser serviceUser;
	
    @Autowired
    public ControllerUser(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }
	
	@GetMapping("/user")
	@ResponseBody
	public List<User> readUser() {
		return serviceUser.readUser();
				
	}
	
	@GetMapping("/{email}")
	@ResponseBody
	public List<User> readPeopleByName(@PathVariable(value= "email") String email) {
		return serviceUser.readUserByEmail(email);
		
	}
	
	@PostMapping("/user")
	@ResponseBody
	public void insertUser(@RequestBody User user) {
		serviceUser.insertUser(user);
	}
	

//	@PostMapping("/user")
//	public ResponseEntity<UserResponseDTO> salvar(@RequestBody UserDTO dto) {
//	    User user = serviceUser.salvar(dto.transformaParaObjeto());
//	    return new ResponseEntity<>(UserResponseDTO.transformaEmDTO(user), HttpStatus.CREATED);
//	}
	
	@DeleteMapping("/user/{idUser}")
	@ResponseBody
	public void deletePeople(@PathVariable(value= "idUser") Long idUser) {
		serviceUser.deleteUserById(idUser);
	}
	
	@PutMapping("/user")
	@ResponseBody
	public void updatePeople(@RequestBody User user) {
		serviceUser.updateUser(user);
		
	}
}
