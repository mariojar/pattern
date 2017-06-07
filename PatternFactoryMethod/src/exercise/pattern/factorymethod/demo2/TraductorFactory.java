package exercise.pattern.factorymethod.demo2;

public class TraductorFactory {

	 public TraductorFactory(){
		 
     }
 
	public static Traductor createTraductor(String idioma){
		Traductor traductor = null;
		if (idioma=="espaniol"){
			traductor = new TraductorEspanol();
		}
 
		if (idioma=="english"){
			traductor = new TraductorIngles();
		} 
 
		
		return traductor;
	}
}
