package com.lassi.desafiocalcme.api.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pessoa")
public class Pessoa {

	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";

	@Id
	private Long codigo;

	@NotNull
	private String nome;

	@NotNull
	private String email;

	@NotNull
	private String telefone;

	public Pessoa() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long id) {
		this.codigo = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
