package com.drisle.middle; /**
 * Created by prashanth.a on 22/03/15.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableAutoConfiguration
@ComponentScan
public class Application extends WebMvcConfigurerAdapter{

    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(new SecurityInterceptor()).addPathPatterns("/**");
    }

    public static void main(String[] args) throws Exception {
        String webPort = System.getenv("PORT");
        if (webPort == null || webPort.isEmpty()) {
            webPort = "8087";
        }
        System.setProperty("server.port", webPort);
        SpringApplication.run(Application.class, args);
    }

}
