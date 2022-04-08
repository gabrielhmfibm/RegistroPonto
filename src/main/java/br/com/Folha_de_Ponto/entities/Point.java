package br.com.Folha_de_Ponto.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="point")
public class Point {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name="idPoint")
	private Long idPoint;
	
//	private LocalDateTime date_time_entrada;
//	
//	private LocalDateTime date_time_saida;
	
	@Column(name="date_time_registro")
	@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	private LocalDateTime date_time_registro;
	
	@ManyToOne
	@JoinColumn(name="user_iduser", referencedColumnName= "id_User")
	@JsonBackReference
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDateTime getDate_time_registro() {
		return date_time_registro;
	}

	public void setDate_time_registro(LocalDateTime date_time_registro) {
		this.date_time_registro = date_time_registro;
	}

	public Long getIdPoint() {
		return idPoint;
	}

	public void setIdPoint(Long idPoint) {
		this.idPoint = idPoint;
	}
	
}
