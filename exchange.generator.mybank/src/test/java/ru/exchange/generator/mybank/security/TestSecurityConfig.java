package ru.exchange.generator.mybank.security;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.test.context.ActiveProfiles;

@TestConfiguration
@ActiveProfiles("test")
public class TestSecurityConfig {

    @Bean
    @Primary
    public SecurityFilterChain securityWebFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(authz -> authz.anyRequest().permitAll())
                .csrf(AbstractHttpConfigurer::disable)
                .build();
    }
}
