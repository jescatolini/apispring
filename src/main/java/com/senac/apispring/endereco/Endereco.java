package com.senac.apispring.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	
	private  String logradouro;
	private String bairro;
	private String cep;
	private String numero;
	private String complemento;
	private String cidade;
	private String uf;
	

	
	public Endereco(DadosEndereco dados) {
		
		this.setLogradouro(dados.logradouro());
		this.setBairro(dados.bairro());
		this.setCep(dados.cep());
		this.setUf(dados.uf());
		this.setCidade(dados.cidade());
		this.setNumero(dados.numero());
		this.setComplemento(dados.complemento());
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public void atualizarInformacoes(DadosEndereco dados) {
	
		if(dados.logradouro() != null) {
			this.logradouro = dados.logradouro();
		}
		
		if(dados.bairro() != null) {
		  this.bairro = dados.bairro();
		}
	
		if (dados.cep() != null) {
			this.cep = dados.cep();
		}
		
		if( dados.uf() != null) {
			this.uf = dados.uf();
		}
		
		if(dados.cidade() != null) {
			this.cidade = dados.cidade();
		}
		
		if(dados.numero() != null) {
			this.numero = dados.numero();
		}
	}

}
