package com.ejemplo.Prueba.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public @RestController
@RequestMapping("/holamundo")
 class holaMundo{
	
	@GetMapping
	public static String hola(){
		System.out.println("Hola mundo X2");
		return "hola Mundo";
	}
}

