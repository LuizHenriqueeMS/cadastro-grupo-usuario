package com.example.project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.project.model.Usuario;
import com.example.project.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/")
public class UsuarioController {
			
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping("/login")
	public String login(@RequestBody Usuario loginUsuario){
		if(usuarioRepository.loginbyUsuarioSenha(loginUsuario.getUsuario(), loginUsuario.getSenha()) == "false") {
			return "usuario nao encontrado";
		} else {
			return "logado";
		}
	}
	
	@PostMapping("/usuario")
	public ResponseEntity<Usuario> incluirUsuario(@RequestBody Usuario usuario){
		return ResponseEntity.ok((usuarioRepository.save(usuario)));
	}
	
	@GetMapping("/usuario/{id}")
	public Optional<Usuario> consultarUsuariosId(@PathVariable int id) {
		
		return usuarioRepository.findById(id);
	}

	
}
