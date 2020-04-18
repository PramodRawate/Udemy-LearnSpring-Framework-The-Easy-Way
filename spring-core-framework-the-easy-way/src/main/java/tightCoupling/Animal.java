package tightCoupling;

public class Animal {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeNoise();
		
		Cat cat = new Cat();
		cat.shout();
	}
}