package br.com.forumhub.config;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Fórum Hub API")
                        .description("API REST para gerenciamento de tópicos de fórum")
                        .version("1.0")
                        .contact(new Contact()
                                .name("seu-nome")
                                .email("seuemail@email.com")
                        )
                );
    }
}
