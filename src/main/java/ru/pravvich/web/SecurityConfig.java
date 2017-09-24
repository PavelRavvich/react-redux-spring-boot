package ru.pravvich.web;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Author : Pavel Ravvich.
 * Created : 24.09.17.
 * <p>
 * SecurityConfig
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()

                .antMatchers("/**", "/index.js").permitAll()
                .anyRequest().authenticated()

                .and()
                .csrf().disable();
    }
}
