package com.example.project.model;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.*;


@Entity
@Table(name = "sis_usuario")
public class Usuario {
		
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long usuarioid;
	
	@Column(name = "usuario", nullable = false)
	private String usuario;
	@Column(name = "nome", nullable = false)
	private String nome;
	@Column(name = "senha", nullable = false) 
	private String senha;
	
	@Column(name = "datacriacao", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date datacriacao = new Date(System.currentTimeMillis());
	
	@Column(name = "dataalteracao", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date dataalteracao = new Date(System.currentTimeMillis()); 
		
	
	public Long getUsuarioid() {
		return usuarioid;
	}

	public void setUsuarioid(Long usuarioid) {
		this.usuarioid = usuarioid;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDatacriacao() {
		return datacriacao;
	}

	public void setDatacriacao(Date datacriacao) {
		dataalteracao = new Date(System.currentTimeMillis()); 
		this.datacriacao = datacriacao;
		
	}

	public Date getDataalteracao() {
		return dataalteracao;
	}

	public void setDataalteracao(Date dataalteracao) {
		dataalteracao = new Date(System.currentTimeMillis()); 
		this.dataalteracao = dataalteracao;
		
		
	}

		
}