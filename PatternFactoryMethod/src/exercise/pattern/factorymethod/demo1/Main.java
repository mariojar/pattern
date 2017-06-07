package exercise.pattern.factorymethod.demo1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Creator aCreator;
	    aCreator = new ConcreteCreator();
	    Product producto = aCreator.factoryMethod();
	    producto.operacion();

	}

}
