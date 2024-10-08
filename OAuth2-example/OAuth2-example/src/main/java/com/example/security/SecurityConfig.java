package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@Order(1)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(HttpSecurity http)throws Exception
	{
		http.requestMatchers()
		.antMatchers("/login","/oauth/authorize")//for this two uri's authentication is not required
		.and()
		.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.permitAll();
		
	}
	@Override
	public void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth
		.inMemoryAuthentication()
		.withUser("Anjireddy").password(passwordEncoder().encode("123456")).roles("USER");
	}
@Bean
public BCryptPasswordEncoder passwordEncoder()
{
	return new BCryptPasswordEncoder();
}
@Bean
@Override
protected AuthenticationManager authenticationManager()throws Exception
{
	return super.authenticationManager();
}
}
