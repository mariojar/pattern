package exercise.pattern.command.demo;

/* The test class or client */
public class PressSwitch {

   public static void main(String[] args){
      String action="ON";
	   
//	   args[0]="ON";
//	   
//      if (args.length != 1) {
//         System.err.println("Argument \"ON\" or \"OFF\" is required.");
//         System.exit(-1);
//      }

      Light lamp = new Light();
      Command switchUp = new FlipUpCommand(lamp);
      Command switchDown = new FlipDownCommand(lamp);

      // See criticism of this model above:
      // The switch itself should not be aware of lamp details (switchUp, switchDown)
      // either directly or indirectly
      Switch mySwitch = new Switch(switchUp, switchDown);

      switch (action) {
         case "ON":
            mySwitch.flipUp();
            break;
         case "OFF":
            mySwitch.flipDown();
            break;
         default:
            System.err.println("Argument \"ON\" or \"OFF\" is required.");
            System.exit(-1);
      }
   }
}