package br.com.Folha_de_Ponto.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.Folha_de_Ponto.entities.User;
import br.com.Folha_de_Ponto.repositories.RepositoryUser;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService{
	
	@Autowired
	private RepositoryUser repositoryUser;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = repositoryUser.findByEmail(email);
		
		if(user == null) {
			throw new UsernameNotFoundException("Usuário nao encontrado!");
		}
		return user;
	}

}
