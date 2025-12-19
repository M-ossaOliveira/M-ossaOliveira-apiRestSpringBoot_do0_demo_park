package com.mballem.demoparkapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocOpenAPIConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(new Info().title("REST API_ Spring Park").description("API para gestão e estacionamento de veículos").version("V1").license(new License().name("Apache 2.0").url("https://www.apache.org/licenses/LICENSE-2.0")).contact(new Contact().name("Mariana Oliv").email("moliv@spring-park.com")));
    }

}
