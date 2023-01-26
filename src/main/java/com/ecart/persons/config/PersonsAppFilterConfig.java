package com.ecart.persons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class PersonsAppFilterConfig {

	/*
	 * @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws
	 * Exception { http.cors().and()
	 * .authorizeRequests().requestMatchers("/actuator/**").permitAll()
	 * .and().authorizeRequests().requestMatchers("/swagger-ui/**").permitAll()
	 * .and().authorizeRequests().requestMatchers("/v3/api-docs/**").permitAll();
	 * return http.build(); }
	 */
}
