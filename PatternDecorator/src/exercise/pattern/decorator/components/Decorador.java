package exercise.pattern.decorator.components;

public abstract class Decorador extends Componente {
	private Componente _componente;

	public Decorador(Componente componente) {
		_componente = componente;
	}

	public void operacion() {
		_componente.operacion();
	}
}