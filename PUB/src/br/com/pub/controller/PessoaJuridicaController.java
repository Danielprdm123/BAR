package br.com.pub.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.PessoaFisica;
import br.com.pub.model.PessoaJuridica;

@SuppressWarnings("deprecation")
@ManagedBean(name = "pessoaJuridicaBean")
@SessionScoped
public class PessoaJuridicaController implements Serializable {

	private static final long serialVersionUID = 1L;
	PessoaJuridica pessoaJ = new PessoaJuridica();
	GenericDAO<PessoaJuridica> pessoaJDAO = new GenericDAO<PessoaJuridica>();

	public PessoaJuridica getPessoaJ() {
		return pessoaJ;
	}

	public void setPessoaJ(PessoaJuridica pessoaJ) {
		this.pessoaJ = pessoaJ;
	}


	public String addPessoaJudica() {
		pessoaJDAO.novo(pessoaJ);
		FacesContext.getCurrentInstance().addMessage("msg: 0k!", new FacesMessage("Salvo com sucesso"));		
		return "listPessoaJuridica";
	}
public List<PessoaJuridica> listarPessoaJ(){
		
		return pessoaJDAO.listarTodos(PessoaJuridica.class);
	}
	
	public String delProduto(){
		pessoaJDAO.deletar(pessoaJ);
		return "sucesso";
	}

}
