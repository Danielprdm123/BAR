package br.com.pub.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Produto;

@SuppressWarnings("deprecation")
@ManagedBean(name ="ProdutoBean")
@SessionScoped
public class ProdutoController implements Serializable{

	private static final long serialVersionUID = 1L;
	Produto produto = new Produto();
	GenericDAO<Produto> produtoDAO = new GenericDAO<Produto>();
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public String addProduto(){
		produtoDAO.novo(produto);
		FacesContext.getCurrentInstance().addMessage("msg: 0k!",new FacesMessage("Salvo com sucesso"));
		return "listProdutos";
	}
	public List<Produto> listarProdutos(){
		
		return produtoDAO.listarTodos(Produto.class);
	}
	
	public String delProduto(){
		produtoDAO.deletar(produto);
		return "sucesso";
	}
	
}
