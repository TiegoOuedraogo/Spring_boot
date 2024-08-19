package com.example.SprintPractice1.config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//http://localhost:8081/swagger-ui.html
//http://localhost:8081/swagger-ui.html/api/accounts

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Account API")
                        .version("1.0")
                        .description("API for managing accounts"));
    }
}
