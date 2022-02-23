package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
	
	@GetMapping("/")
	public String saludo() {
		return "Fugaaa";
	}
	
	@GetMapping("/saludo")
	public String saludar(@RequestParam(value="nombre", 
	defaultValue = "Extraño") String nombre) {
		return "Bonjour " + nombre;
	}
}
