package com.tharaka.bankIntegrator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket productApi(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tharaka.bankIntegrator"))
                .paths((regex("/rest.*")))
                .build()
                .apiInfo(metaInfo());
    }
    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfo(
                "Swagger with Sprint Boot - REST API",
                "Swagger with Sprint Boot - REST API by Tharaka",
                "1.0",
                "Terms of Service",
                new Contact("Tharaka Perera",
                        "https://www.linkedin.com/in/tharaka-gayan",
                        "gayan92tharaka@gmail.com"),
                "Apache License Version: 2.0",
                "https://www.apache.org/licnesen.html"
        );
        return  apiInfo;
    }
}
