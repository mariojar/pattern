package exercise.pattern.strategy.demo2;

public class ContextForExecution {
	IAlgorithmStrategy behaviour;
	String name;

	public ContextForExecution(String name)
	{
		this.name = name;
	}

	public void setLogicAlgorithm(IAlgorithmStrategy behaviour)
	{
		this.behaviour = behaviour;
	}

	public IAlgorithmStrategy getBehaviour()
	{
		return behaviour;
	}

	public void execute()
	{
		System.out.println(" En el contexto " + name + " ");
		behaviour.myLogicCommand();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}