package tightCouplingOvercomeBy_DI;

public class App {

	public static void main(String[] args) {
		Bean bean = new Bean(new Dog());
		bean.shout();
	}

}
