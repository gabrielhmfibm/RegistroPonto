package br.com.Folha_de_Ponto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Folha_de_Ponto.entities.User;
import br.com.Folha_de_Ponto.repositories.RepositoryUser;

@Service
public class ServiceUser {
	
	@Autowired
	RepositoryUser repositoryUser;
	
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
