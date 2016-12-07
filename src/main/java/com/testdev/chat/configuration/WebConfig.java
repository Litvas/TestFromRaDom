package com.testdev.chat.configuration;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.testdev.chat.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }

  @Bean
  public WebContentInterceptor webContentInterceptor() {
    WebContentInterceptor interceptor = new WebContentInterceptor();
    interceptor.setCacheSeconds(0);
    return interceptor;
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(webContentInterceptor());
  }
}
