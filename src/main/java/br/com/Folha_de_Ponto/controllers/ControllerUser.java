package br.com.Folha_de_Ponto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.Folha_de_Ponto.dto.UserPointDTO;
import br.com.Folha_de_Ponto.entities.User;
import br.com.Folha_de_Ponto.services.ServiceUser;

@RestController
public class ControllerUser {
	
    @Autowired
    ServiceUser serviceUser;
    
    @GetMapping("/users-dto")
    public List<UserPointDTO> getAllUsers(){
    	return serviceUser.getAllUsers();
    }
	
	@GetMapping("/users")
	@ResponseBody
	public List<User> readUser() {
		return serviceUser.readUser();
				
	}
	
	@GetMapping("/{email}")
	@ResponseBody
	public User readPeopleByEmail(@PathVariable(value= "email") String email) {
		return serviceUser.readUserByEmail(email);
	}
	
	@PostMapping("/users")
	@ResponseBody
	public void insertUser(@RequestBody User user) {
		serviceUser.insertUser(user);
	}
	
	@DeleteMapping("/user/{idUser}")
	@ResponseBody
	public void deletePeople(@PathVariable(value= "idUser") Long idUser) {
		serviceUser.deleteUserById(idUser);
	}
	
	@PutMapping("/users")
	@ResponseBody
	public void updatePeople(@RequestBody User user) {
		serviceUser.updateUser(user);
		
	}
}
