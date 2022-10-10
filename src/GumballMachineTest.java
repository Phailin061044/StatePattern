import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GumballMachineTest {

	@Test
	void testGumballMachine() {
		GumballMachine machine1 = new GumballMachine(5);
		machine1.insertQuarter(); //HasQuarter
		machine1.turnCrank(); //SoldState NoQuarter
		machine1.insertQuarter(); //HasQuarter
		machine1.turnCrank(); //SoldState NoQuarter
		machine1.insertQuarter(); //HasQuarter
		machine1.turnCrank(); //SoldState NoQuarter
		machine1.insertQuarter(); //HasQuarter
		machine1.turnCrank(); //SoldState NoQuarter
		machine1.insertQuarter(); //HasQuarter
		machine1.turnCrank(); //SoldState NoQuarter
		
		machine1.insertQuarter(); //SoldOut
		machine1.turnCrank(); //SoldState NoQuarter
	}

}
