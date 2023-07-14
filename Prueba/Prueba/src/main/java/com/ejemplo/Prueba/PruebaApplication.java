package com.ejemplo.Prueba;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.conector.conector;

@SpringBootApplication
public class PruebaApplication {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(conector.class.getName());
		SpringApplication.run(PruebaApplication.class, args);
		logger.info("Hola Mundo");
	}
}