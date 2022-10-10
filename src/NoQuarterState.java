
public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	
	public NoQuarterState (GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.print("You inserted a quater");
		gumballMachine.setState(gumballMachine.getHasQuarterState());

	}

	@Override
	public void ejectQuarter() {
		System.out.print("You haven't inserted a quarter");
	
	}

	@Override
	public void turnCrank() {
		System.out.print("You turned, but there's no quarter");
	
	}

	@Override
	public void dispense() {
		System.out.print("You need to pay first");

	}

}
