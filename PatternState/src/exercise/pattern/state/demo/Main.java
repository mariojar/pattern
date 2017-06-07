package exercise.pattern.state.demo;

public class Main {
	
	public static void main( String arg[] )
    {
            try
            {
                    State state = new ConcreteStateA();
                    
                    
                    Context context = new Context();
                    context.setState( state ); 
                    context.request();
                    
                    context.setState( new ConcreteStateB()); 
                    context.request();
            }
            catch( Exception e ) 
            {
                    e.printStackTrace();
            }
    }

}
