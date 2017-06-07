package exercise.pattern.factorymethod.demo1;

public class ConcreteCreator extends Creator {
	
	 public Product factoryMethod() {
	        return new ConcreteProduct();
	    }

}
