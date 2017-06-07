package exercise.pattern.abstractFactory.demo.products;

class ConcreteFactory1 extends AbstractFactory{
	public AbstractProductA createProductA(){
		return new ProductA1("ProductA1");
	}
	AbstractProductB createProductB(){
		return new ProductB1("ProductB1");
	}
}
