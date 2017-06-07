package exercise.pattern.factorymethod.demo2;

public class TraductorEspanol extends Traductor {

	public TraductorEspanol(){
	       super();
	    }
	 
	    public String traducirNumero(int numero){
	       switch(numero){
	       	   case 1: return "uno" ; 
	       	   case 2: return "dos";
	       	   default : return "traduzione non disponibile" ;
	       }
		
	    }	

}
