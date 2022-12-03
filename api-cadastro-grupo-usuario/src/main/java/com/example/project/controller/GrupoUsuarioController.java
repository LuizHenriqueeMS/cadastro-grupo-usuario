package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.GrupoUsuario;
import com.example.project.repository.GrupoUsuarioRepository;

@RestController
@RequestMapping("/api")
public class GrupoUsuarioController {
	
	@Autowired
	private GrupoUsuarioRepository grupoUsuarioRepository;
	
	@GetMapping("/login")
	public List<GrupoUsuario> consultarGrupoUsuario(){
		return grupoUsuarioRepository.findAll();
	}
	
}