package br.com.Folha_de_Ponto.dto;

import java.util.List;

import br.com.Folha_de_Ponto.entities.Point;
import lombok.Data;

@Data
public class UserPointDTO {

	private Long userId;
	private String email;
	private String phone;
	private List<Point> listPoints;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Point> getListPoints() {
		return listPoints;
	}
	public void setListPoints(List<Point> listPoints) {
		this.listPoints = listPoints;
	}	
	
}
