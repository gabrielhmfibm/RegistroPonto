package br.com.Folha_de_Ponto.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.Folha_de_Ponto.entities.Point;

@Repository
public interface RepositoryPoint extends CrudRepository<Point, Long>{
	
	@Transactional
	@Modifying
	@Query(value = "DELETE from registroponto.point p WHERE p.user_id_User = ?1", nativeQuery = true)
	void deleteById(Long idUser);
}
