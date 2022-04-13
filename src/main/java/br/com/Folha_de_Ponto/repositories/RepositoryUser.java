package br.com.Folha_de_Ponto.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.Folha_de_Ponto.entities.User;

@Repository
public interface RepositoryUser extends CrudRepository<User, Long>{
	
	User findByEmail(String email);
	
	User saveAndFlush(User user);
	
	@Query(value="select * from user where email = :email and password = :password", nativeQuery = true)
	public User Login(String email, String password);
	
}
