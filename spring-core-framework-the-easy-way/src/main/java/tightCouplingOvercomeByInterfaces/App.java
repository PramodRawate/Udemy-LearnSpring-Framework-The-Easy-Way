package tightCouplingOvercomeByInterfaces;

public class App {

	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.makeNoise();

	}

}



/* Only code at line 6 after = needs to be changed according to the type of animal required. 
Rest of the code remains as it is.*/

/*But still the App class is tightly coupled with Cat or Dog class.
We are making new DOg() or new Cat() so App class is tightly coupled with Dog or Cat class.*/