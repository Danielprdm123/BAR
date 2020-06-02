package br.com.pub.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("deprecation")
@ManagedBean(name = "LoginBean")
@SessionScoped
public class LoginController {
	private String login;
	private String senha;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String verifica() {
		if(login == "user" && senha == "123") {
		return "sucesso";
	}
	else {
		return "erro";
		}
	}
}
