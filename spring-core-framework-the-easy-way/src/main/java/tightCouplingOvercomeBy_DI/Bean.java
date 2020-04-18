package tightCouplingOvercomeBy_DI;

public class Bean {
	
	private Animal animal;
	
	Bean(Animal animal) {
		this.animal = animal;
	}
	
	public void shout()
	{
		animal.makeNoise();
	}

}

/* 
 * Bean class don't have its dependency defined in its class itself. 
 * Rather we have sent the dependency from the main class as an parameter to its constructor.
 * i.e. We have injected its dependency. And this is called as Dependency Injection. 
 */

/* 
 * With This DI the Dog or Cat ad the Bean class are not tightly coupled to each other.
 * But still the main class has the dependency. But in large application it is difficult to manage dependencies in the application class.
 * So this task should be given to 3rd party tool to manage dependencies and that toolis SPRING FRAMEWORK.
 */