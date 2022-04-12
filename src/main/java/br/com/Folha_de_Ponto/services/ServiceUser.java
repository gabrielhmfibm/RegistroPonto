package br.com.Folha_de_Ponto.services;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Folha_de_Ponto.dto.UserPointDTO;
import br.com.Folha_de_Ponto.entities.User;
import br.com.Folha_de_Ponto.repositories.RepositoryUser;

@Service
public class ServiceUser {
	
	@Autowired
	RepositoryUser repositoryUser;
	
	private UserPointDTO converteEntityEmDto(User user) {
		UserPointDTO userPointDTO = new UserPointDTO();
		userPointDTO.setUserId(user.getIdUser());
		userPointDTO.setEmail(user.getEmail());
		userPointDTO.setPhone(user.getPhone());
		userPointDTO.setListPoints(user.getListPoints());
		return userPointDTO;
	}
	
	public List<UserPointDTO> getAllUsers() {
		return ((Collection<User>) repositoryUser.findAll())
				.stream()
				.map(this::converteEntityEmDto)
				.collect(Collectors.toList());
				
	}
	
	public List<User> readUser(){
		return (List<User>) repositoryUser.findAll();
	}
	
	public List<User> readUserByEmail(String email){
		return repositoryUser.findByEmail(email);
	}
	
	public void insertUser(User user) {
		user = repositoryUser.saveAndFlush(user);
	}
	
    public User salvar(User user) {
        return repositoryUser.save(user);
    }
	
	public void deleteUserById(Long idUser) {
		repositoryUser.deleteById(idUser);
	}
	
	public void updateUser(User user) {
		repositoryUser.save(user);
	}

}
