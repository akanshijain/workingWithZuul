package com.portalGateway.docPortalGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DocPortalGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocPortalGatewayApplication.class, args);
	}

}
