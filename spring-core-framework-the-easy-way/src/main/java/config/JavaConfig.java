package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import springDI.Animal;
import springDI.AnimalBean;

@Configuration
@ImportResource("classpath:Config2.xml")
public class JavaConfig {
	
	@Bean
	public AnimalBean animalBean(Animal animal) {
		return new AnimalBean(animal);
	}
	
}
