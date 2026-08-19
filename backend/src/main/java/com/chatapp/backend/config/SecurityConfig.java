package com.chatapp.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    // Placeholder until real auth is implemented: opens the STOMP handshake
    // endpoint so the WebSocket scaffold is reachable during development.
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/ws/**").permitAll()
                .anyRequest().authenticated());
        return http.build();
    }
}
