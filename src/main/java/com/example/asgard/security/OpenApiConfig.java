package com.example.asgard.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
@OpenAPIDefinition(
	    security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(name = "bearerAuth")
	)

@io.swagger.v3.oas.annotations.security.SecurityScheme(
	    name = "bearerAuth",
	    type = SecuritySchemeType.HTTP,
	    scheme = "bearer",
	    bearerFormat = "JWT"
)


public class OpenApiConfig {
	
	
}
