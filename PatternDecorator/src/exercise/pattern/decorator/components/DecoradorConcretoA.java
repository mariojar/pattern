package exercise.pattern.decorator.components;

public class DecoradorConcretoA extends Decorador{
    private String _propiedadAnadida;

    public DecoradorConcretoA(Componente componente){
    super(componente);
}

    public void operacion(){
            super.operacion();
            _propiedadAnadida = "Nueva propiedad";
            System.out.println("ejecuta la operacion agregada 2");
    }
}