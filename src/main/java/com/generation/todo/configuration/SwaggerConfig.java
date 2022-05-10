package com.generation.todo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	
	@Bean
	  public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
	              .info(new Info().title("Todo Api")
	              .description("A simple project of task list")
	              .version("v2.0.0")
	              .license(new License().name("generation.org").url("http://springdoc.org")))
	              .externalDocs(new ExternalDocumentation()
	              .description("Github")
	              .url("https://github.com/conteudoGeneration/"));
	  }

}
