package br.com.pub.model;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Cliente {
	private int cnpj;
	private String ie;
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}

 
}
