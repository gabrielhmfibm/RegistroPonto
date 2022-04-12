package br.com.Folha_de_Ponto.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name="id_User")
	private Long idUser;
	
	@Column(name="password")
	private String password;
	
	@Column(name="name")
	private String name;
	
	@Column(name="cod_seguranca")
	private String cod_seguranca;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Point> listPoints;

	public List<Point> getListPoints() {
		return listPoints;
	}

	public void setListPoints(List<Point> listPoints) {
		this.listPoints = listPoints;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCod_seguranca() {
		return cod_seguranca;
	}

	public void setCod_seguranca(String cod_seguranca) {
		this.cod_seguranca = cod_seguranca;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
