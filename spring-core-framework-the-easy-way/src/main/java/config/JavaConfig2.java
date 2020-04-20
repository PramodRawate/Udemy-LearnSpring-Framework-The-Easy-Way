package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springDI.Cat;
import springDI.Dog;

@Configuration
public class JavaConfig2 {
	
	@Bean
	public Cat cat() {
    	return new Cat();
    }
	
}
