package br.com.pub.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.PessoaFisica;


@SuppressWarnings("deprecation")
@ManagedBean(name ="pessoaFisicaBean")
@SessionScoped
public class PessoaFisicaController implements Serializable{

	private static final long serialVersionUID = 1L;
	PessoaFisica pessoa = new PessoaFisica();
	GenericDAO<PessoaFisica> pessoaFDAO = new GenericDAO<PessoaFisica>();
	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}
	
	
	public String addPessoaFisica(){
		pessoaFDAO.novo(pessoa);
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Salvo com sucesso"));		
		return "listPessoaFisica";
	}
	
public List<PessoaFisica> listarPessoaF(){
		
		return pessoaFDAO.listarTodos(PessoaFisica.class);
	}
	
	public String delProduto(){
		pessoaFDAO.deletar(pessoa);
		return "sucesso";
	}
	
}
