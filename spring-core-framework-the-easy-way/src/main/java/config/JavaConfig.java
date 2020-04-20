package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springDI.AnimalBean;
import springDI.Cat;
import springDI.Dog;

@Configuration
public class JavaConfig {
	
	@Bean
    public Dog dog() {
    	return new Dog();
    }
	
	@Bean
	public AnimalBean animalBean() {
		return new AnimalBean(new Dog());
	}
	
}
