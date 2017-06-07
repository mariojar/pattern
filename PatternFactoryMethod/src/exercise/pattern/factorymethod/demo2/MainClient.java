package exercise.pattern.factorymethod.demo2;

public class MainClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Traductor traductor = TraductorFactory.createTraductor("espaniol");
		System.out.println( traductor.traducirNumero(4) );
	}

	public String traducirNumero(String idioma, int numero) {
		Traductor traductor = null;
		if (idioma.equals("español")) {
			traductor = new TraductorEspanol();
		}

		if (idioma.equals("ingles")) {
			traductor = new TraductorIngles();
		}

		String toReturn = traductor.traducirNumero(numero);
		return toReturn;
	}// traducirNumero

}
