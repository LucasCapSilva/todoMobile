package com.generation.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController("/")
public class TodoApplication {
	
	@GetMapping
	public ModelAndView swaggerUi() {		
		return new ModelAndView("redirect:/swagger-ui.html/");		
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
