package shop.javashop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())  // Tắt bảo vệ CSRF
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/templates/admin/**").permitAll()
                                .anyRequest().authenticated()
                );

        return http.build();
    }
}