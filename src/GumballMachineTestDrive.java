

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();//NO_QUARTER You inserted a quarter 	state = HAS_QUARTER;
		gumballMachine.insertQuarter();// HAS_QUARTER You can't insert another quarter
		gumballMachine.turnCrank();//SOLD ���¡ dispense ��� cont - 1 ����� 2 = Has_QuarterA gumball comes rolling out the slot ���count ��ѡ����� 1
		gumballMachine.insertQuarter(); //HAS_QUARTER You inserted a quarter
		gumballMachine.turnCrank();//  You turned... ����¹��SOLD ���¡ dispense��� cont -1 = has_Quarter A gumball comes rolling out the slot count �����0 Oops, out of gumballs!=SOLD_OUT
		gumballMachine.insertQuarter(); //sole outYou can't insert a quarter, the machine is sold out
		gumballMachine.turnCrank();//sole out You turned, but there are no gumballs

		System.out.println(gumballMachine);
	}
}
