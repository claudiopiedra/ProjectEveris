package com.project.everis.ssl;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;

@Configuration
public class ConfigHTTPS {

	 @Bean
	 public ServletWebServerFactory servletContainer() {
	        TomcatServletWebServerFactory tomcatservlet = new TomcatServletWebServerFactory() {
	            @Override
	            protected void postProcessContext(Context context) {
	                SecurityConstraint securityConstraint = new SecurityConstraint();
	                securityConstraint.setUserConstraint("CONFIDENTIAL");
	                SecurityCollection collection = new SecurityCollection();
	                collection.addPattern("/*");
	                securityConstraint.addCollection(collection);
	                context.addConstraint(securityConstraint);
	            }
	        };   
	        return tomcatservlet;
	    }  
}