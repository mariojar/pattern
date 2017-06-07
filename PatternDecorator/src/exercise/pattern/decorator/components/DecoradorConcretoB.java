package exercise.pattern.decorator.components;

public class DecoradorConcretoB extends Decorador {
	public DecoradorConcretoB(Componente componente) {
		super(componente);
	}

	public void operacion() {
		super.operacion();
		System.out.println("Otra operacion agregada 3");
	}

}