//package br.com.Folha_de_Ponto.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import br.com.Folha_de_Ponto.entities.User;
//import br.com.Folha_de_Ponto.repositories.RepositoryUser;
//
//@Controller
//public class LoginController {
//	
//	@Autowired
//	RepositoryUser repositoryUser;
//	
////	@GetMapping("/login")
////	public String index() {
////		return "/login";
////	}
//
//	@PostMapping("/logar")
//	public String logar(Model model, User userParam) {
//		User user = this.repositoryUser.Login(userParam.getEmail(), userParam.getSenha());
//		if(user != null) {
//			return "redirect:/{email}";
//		}
//		model.addAttribute("erro", "Usuário ou senha inválidos");
//		return "/login";
//		
//	}
//}
