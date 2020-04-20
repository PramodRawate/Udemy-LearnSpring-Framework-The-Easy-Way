package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springDI.Animal;
import springDI.AnimalBean;

@Configuration
@Import(JavaConfig2.class)
public class JavaConfig {
	
	@Bean
	public AnimalBean animalBean(Animal animal) {
		return new AnimalBean(animal);
	}
	
}
