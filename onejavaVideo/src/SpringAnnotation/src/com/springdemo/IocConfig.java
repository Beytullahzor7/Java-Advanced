package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springdemo")
@PropertySource("classpath:values.properties")
public class IocConfig {
	@Bean
	public ICustomerDal database() { //referans tutucu interfacedir
		return new MsSqlCustomerDal();
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database()); //t�m ba��ml�l�klar� art�k tek bir noktadan y�netiyorum
	}
}
