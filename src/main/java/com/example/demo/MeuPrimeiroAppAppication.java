package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/contatos")
public class MeuPrimeiroAppAppication {
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroAppAppication.class, args);
	}
	
	@PostMapping
	public String criarContato() {
		return "Contato criado com sucesso!";
	}
	
	@GetMapping
	public String listarContatos() {
		return "Consulta de Contatos realizado com sucesso!";
	}

	@PutMapping("/{id}")
	public String atualizarContato(@PathVariable Long id) {
		return "Contato " + id + "atualizado com sucesso!";
	}
	
	@DeleteMapping("/{id}")
	public String deletarContato(@PathVariable Long id) {
		return "Contato " + id + "excluído com sucesso!";
	}
}

