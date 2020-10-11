package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import javax.sql.DataSource;

public class SprzetSecurity {

    //konfiguracja
    @Configuration
    public class CytatSecurity extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.httpBasic()
                    .and()
                    .authorizeRequests()
                    .antMatchers(HttpMethod.GET, "/sprzet").permitAll()
                    .antMatchers(HttpMethod.POST, "/sprzet").hasRole("USER")
                    .antMatchers(HttpMethod.DELETE, "/sprzet").hasRole("ADMIN")
                    .and()
                    .formLogin().permitAll()
                    .and()
                    .logout().permitAll()
                    .and()
                    //wylaczenie bledu z postmana
                    .csrf().disable();

        }

        //metoda do pobierania danych z bazy danych

        //wczytuje bean do zmiennej
        @Autowired
        private BCryptPasswordEncoder bCryptPasswordEncoder;

        @Autowired
        private DataSource dataSource;


        @Bean
        public BCryptPasswordEncoder passwordEncoder() {
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            return bCryptPasswordEncoder;
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

            UserDetails moderator = User.withDefaultPasswordEncoder()
                    .username("user")
                    .password("user1")
                    .roles("USER")
                    .build();

            return new InMemoryUserDetailsManager(admin, moderator);
        }
    }
}
