package exercise.pattern.chainResponsability.demo;

public class LiderTeamEjecutivo implements IAprobador {

	private IAprobador next;

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
		if (monto > 10000 && monto < 50000) {
			System.out.println("lo manejo yo el lider");
		} else {
			next.solicitudPrestamo(monto);
		}
	}

}
