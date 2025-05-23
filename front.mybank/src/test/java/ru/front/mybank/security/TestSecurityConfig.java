package ru.front.mybank.security;

import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration
public class TestSecurityConfig {
    // @Bean
    // public SecurityFilterChain securityWebFilterChain(HttpSecurity http) throws Exception {
    //     return http
    //             .authorizeHttpRequests(authz -> authz.anyRequest().permitAll())
    //             .csrf(AbstractHttpConfigurer::disable)
    //             .build();
    // }
}
