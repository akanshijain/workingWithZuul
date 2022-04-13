package com.portalGateway.docPortalGateway;

import org.springframework.context.annotation.Configuration;

import com.netflix.zuul.ZuulFilter;

@Configuration
public class RouteFilter extends ZuulFilter {
 
  @Override
  public String filterType() {
    return "route";
  }
 
  @Override
  public int filterOrder() {
    return 1;
  }
 
  @Override
  public boolean shouldFilter() {
    return true;
  }
 
  @Override
  public Object run() {
   System.out.println("Inside Route Filter");
    return null;
  }
}
