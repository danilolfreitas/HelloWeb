package br.com.danilocorp.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilocorp.hello.model.Usuario;

@RestController
public class UserController {
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario dadosLogin) {
		
		if(dadosLogin.getEmail().equals("danilo@danilocorp.com.br") || dadosLogin.getRacf().equals("olinad")) {
			
			if (dadosLogin.getSenha().equals("1234")) {
				
				Usuario resposta = new Usuario();
				
				resposta.setId(5678);
				resposta.setNome("Danilo Fritas");
				resposta.setEmail("danilo@danilocorp.com.br");
				resposta.setRacf("olinad");
				resposta.setDepartamento("Casa da mae Joana");
				resposta.setFuncional("blabla");
				return ResponseEntity.ok(resposta);
				
			}
			// senha não confere. retorno código 401 (unAuthorized)
			return ResponseEntity.status(401).build();
			
		}
		//usuário não existe. retorno código http 404
		return ResponseEntity.status(404).build();
		
	}
	

}
