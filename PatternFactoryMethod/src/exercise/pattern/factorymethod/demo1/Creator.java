package exercise.pattern.factorymethod.demo1;

/// Definimos la clase abstracta constructora
public abstract class Creator{
    // Operaci�n que realiza 
	
    public Product  anOperation() {
 
        return factoryMethod();
    }
 
    // Definimos m�todo abstracto
    public abstract Product factoryMethod();
}
