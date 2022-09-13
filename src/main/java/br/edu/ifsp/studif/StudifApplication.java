package br.edu.ifsp.studif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.studif.repository.DicasRepository;

@SpringBootApplication
@RestController
public class StudifApplication {

	public static void main(String[] args) {
		DicasRepository.init();
		SpringApplication.run(StudifApplication.class, args);
	}

}
