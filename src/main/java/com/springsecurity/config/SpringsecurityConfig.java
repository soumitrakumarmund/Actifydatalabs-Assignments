package com.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SpringsecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("pass1").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("developer").password("pass2").roles("DEVELOPER");
		auth.inMemoryAuthentication().withUser("business").password("pass3").roles("BUSINESS_EXECUTIVE");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/User/admin/**").hasAnyRole("ADMIN").anyRequest().fullyAuthenticated().and().httpBasic();
		http.authorizeRequests().antMatchers("/User/dev/**").hasAnyRole("DEVELOPER").anyRequest().fullyAuthenticated().and().httpBasic();
		http.authorizeRequests().antMatchers("/User/business/**").hasAnyRole("BUSINESS_EXECUTIVE").anyRequest().fullyAuthenticated().and().httpBasic();
	}

	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
}
