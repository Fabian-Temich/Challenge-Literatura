package com.alura.challengeliteratura.Challenge.Literatura;
import com.alura.challengeliteratura.Challenge.Literatura.Principal.Principal;
import com.alura.challengeliteratura.Challenge.Literatura.repository.IAutorRepository;
import com.alura.challengeliteratura.Challenge.Literatura.repository.ILibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class ChallengeLiteraturaApplication implements CommandLineRunner {

	@Autowired
	private ILibroRepository libroRepository;
	@Autowired
	private IAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeLiteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal(libroRepository, autorRepository);
		principal.consumo();

	}
}