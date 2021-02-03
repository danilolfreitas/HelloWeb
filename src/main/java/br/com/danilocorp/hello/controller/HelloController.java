package br.com.danilocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilocorp.hello.model.Produto;

@RestController
public class HelloController {

	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello World! Meu primeiro projeto!";
		
	}
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto prod = new Produto();
		prod.setId(1200);
		prod.setDescricao("Mesa Gamer");
		prod.setPreco(998.56);
		prod.setQtdEstoque(1);
		return prod;
		
		
	}
	@PostMapping("/novoProduto")
	public String CadastrarProduto(@RequestBody Produto novo) {
		
		System.out.println("Recebi "+novo.getId()+" / "+novo.getDescricao()+" / "
				+ " / " + novo.getPreco()+" / "+ novo.getQtdEstoque());
		
		return "Produto Cadastrado";
		
	}

	
}
