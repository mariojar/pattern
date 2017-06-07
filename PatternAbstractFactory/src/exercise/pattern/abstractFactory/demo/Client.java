package exercise.pattern.abstractFactory.demo;

import exercise.pattern.abstractFactory.demo.products.AbstractFactory;
import exercise.pattern.abstractFactory.demo.products.AbstractProductA;
import exercise.pattern.abstractFactory.demo.products.FactoryMaker;

public class Client{
	public static void main(String args[]){
		AbstractFactory pf=FactoryMaker.getFactory("a");
		AbstractProductA product=pf.createProductA();
		//more function calls on product
	}
}
