package com.attendance_system.userLogin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/user/login","/","/static/**","/index.html", "/home.html" ,"/styles.css", "/jwtValidation.js", "/favicon.ico")
                        .permitAll()
                        .anyRequest()
                        .authenticated()
                ).formLogin(AbstractHttpConfigurer::disable);
        return http.build();
    }

}
