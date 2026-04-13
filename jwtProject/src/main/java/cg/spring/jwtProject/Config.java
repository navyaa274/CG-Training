package cg.spring.jwtProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class Config {
    @Autowired
    JWTFilter jwtFilter;

    @Bean
    public SecurityFilterChain secure(HttpSecurity http) {
        return http
                .csrf(x-> x.disable())
                .authorizeHttpRequests(x->x
                        .requestMatchers("/client").hasAnyAuthority("CLIENT")
                        .requestMatchers("/backend").hasAuthority("ADMIN")
                        .requestMatchers("/check").authenticated()
                        .anyRequest().permitAll()

                )
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
                .sessionManagement(x -> x
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration a) throws Exception {
        return a.getAuthenticationManager();
    }
}

