//package com.daw.decotea.config;
//
//
//import com.daw.decotea.service.UsuarioService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//@EnableWebSecurity
//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class MySecurityConfig extends WebSecurityConfigurerAdapter {
//    //WebSecurityConfigurerAdapter
//    private JwtAuthenticationEntryPoint unauthorizedHandler;
//
//    private UsuarioService userDetailsServiceImp;
//    private JwtAuthenticationFilter jwtAuthenticationFilter;
//
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//
//    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf()
//                .disable()
//                .cors()
//                .disable()
//                .authorizeRequests()
//                .antMatchers("/generate-token","/usuarios/").permitAll()
//                .antMatchers(HttpMethod.OPTIONS).permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .exceptionHandling()
//                .and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//        http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//    }
//}
