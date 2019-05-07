package br.com.dominio.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("clienteMB")
@SessionScoped
public class ClienteMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String tipoPessoa = "FISICA";

	// getters e setters do tipo de pessoa
	
	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	

	
	

}
