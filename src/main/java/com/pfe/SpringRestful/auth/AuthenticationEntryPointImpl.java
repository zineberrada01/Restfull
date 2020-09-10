package com.pfe.SpringRestful.auth;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 
@Component
public class AuthenticationEntryPointImpl extends BasicAuthenticationEntryPoint {
 
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authEx)
            throws IOException {
    	   response.addHeader("WWW-Authenticate", "Basic realm=" +getRealmName());
           response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
           PrintWriter writer = response.getWriter();
           writer.println("HTTP Status 401 - " + authEx.getMessage());
       
    }
 
    @Override
    public void afterPropertiesSet() {
        // RealmName appears in the login window (Firefox).
        setRealmName("DeveloperStack");
        super.afterPropertiesSet();
    }
    
    
 
}