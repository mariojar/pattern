package exercise.pattern.chainResponsability.demo;

public class Gerente implements IAprobador {

	IAprobador next;

	@Override
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}

	@Override
	public IAprobador getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void solicitudPrestamo(int monto) {
		if (monto > 50000 && monto < 100000) {
			System.out.println("Lo manejo yo, el gerente");
		} else {
			next.solicitudPrestamo(monto);
		}

	}

}
