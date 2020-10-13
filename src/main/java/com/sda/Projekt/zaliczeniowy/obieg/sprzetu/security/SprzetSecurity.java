package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//konfiguracja
@Configuration
public class SprzetSecurity extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.httpBasic()
                    .and()
                    .authorizeRequests()
                    .antMatchers(HttpMethod.GET, "/sprzet","/pracownicy","/rola").permitAll()
                    .antMatchers(HttpMethod.POST, "/sprzet","/pracownicy").hasRole("USER")
                    .antMatchers(HttpMethod.DELETE, "/sprzet","/pracownicy").hasRole("ADMIN")
                    .and()
                    .formLogin().permitAll()
                    .and()
                    .logout().permitAll()
                    .and()
                    //wylaczenie bledu z postmana
                    .csrf().disable();
        }

        //dodawanie uzytkownikow
        @Bean
        public UserDetailsService userDetailsService() {
            // metoda withDefaultPasswordEncoder - nie ma kodowanego hasla
            UserDetails admin = User.withDefaultPasswordEncoder()
                    .username("admin")
                    .password("admin1")
                    .roles("ADMIN")
                    .build();

            UserDetails user = User.withDefaultPasswordEncoder()
                    .username("user")
                    .password("user1")
                    .roles("USER")
                    .build();

            return new InMemoryUserDetailsManager(admin, user);
        }
    }
