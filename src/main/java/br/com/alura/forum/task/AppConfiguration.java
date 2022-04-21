package br.com.alura.forum.task;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.codility.external")
public class AppConfiguration {
	
	@Bean
    public OrdersService ordersService() {
        return null;
    }

}
