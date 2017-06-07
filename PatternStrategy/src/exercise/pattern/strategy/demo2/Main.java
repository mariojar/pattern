package exercise.pattern.strategy.demo2;

public class Main {

	public static void main(String[] args) {

		ContextForExecution r1 = new ContextForExecution("Context 1");
		ContextForExecution r2 = new ContextForExecution("Contex 2");
		ContextForExecution r3 = new ContextForExecution("Context 3");

		r1.setLogicAlgorithm(new AlgorithmStrategyOne());
		r2.setLogicAlgorithm(new AlgorithmStrategyTwo());
		r3.setLogicAlgorithm(new AlgorithmStrategyThree());

		r1.execute();
		r2.execute();
		r3.execute();

		r1.setLogicAlgorithm(new AlgorithmStrategyTwo());
		r2.setLogicAlgorithm(new AlgorithmStrategyOne());

		r1.execute();
		r2.execute();
		r3.execute();
	}
}