package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visualizar")
public class HelloWorldController {

	@GetMapping("helloWorld")
	public String helloWorld() {
		return"Hello World";
	}
	@GetMapping("bsm")
	public String bsm() {
		return"BSM's da Generation Brazil: <br/>"
				+ "<br/>Persistência;<br/>"
				+ "Mentalidade de Crescimento;<br/>"
				+ "Responsabilidade Pessoal;<br/>"
				+ "Orientação ao Futuro;<br/>"
				+ "Proatividade;<br/>"
				+ "Comunicação;<br/>"
				+ "Trabalho em Equipe;<br/>"
				+ "Orientação ao Detalhe.";
		}
	
	
	@GetMapping("aprendizado")
	public String aprendizado() {
		return"Aprendizado da semana<br/>"
				+ "<br/>Aprendemos conceito praticos e teoricos de SQL<br/>"
				+ "Banco de dados <br/>"
				+ "Spring<br/>"
				+ "Quero aprimorar mas no connhecimentos das ferramentas Spring e Mysql<br/>";
				
	}
	
	
}
