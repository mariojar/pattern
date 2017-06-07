package exercise.pattern.chainResponsability.demo;

public class Director implements IAprobador {
	
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
if(monto > 100000){
	System.out.println("Lo Manejo Yo, el director");
	
}
	}

}
