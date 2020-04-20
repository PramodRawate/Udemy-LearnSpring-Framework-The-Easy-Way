package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springDI.Animal;
import springDI.Dog;

@Configuration
public class JavaConfig2 {
	
	@Bean
	public Animal animal() {
    	return new Dog();
    }
	
}
