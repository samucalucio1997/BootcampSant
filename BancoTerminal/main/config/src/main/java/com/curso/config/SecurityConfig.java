package com.curso.config;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
           http
           .httpBasic()
           .and()
           .authorizeRequests()
           .anyRequest().authenticated();
           return http.build();
    }
     

}