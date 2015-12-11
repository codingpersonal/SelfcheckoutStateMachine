import java.util.ArrayList;

public class State implements IState{

	StateManager manager;
	
	public State(StateManager manager) {
		this.manager = manager;
	}
	@Override
	public void scan(ArrayList<String> item) {
		System.out.println("You cannot scan more items now. Press Go Back.");
	}

	@Override
	public void enterBagCount(int count){
		System.out.println("You cannot enter bags in this state!");
	}

	@Override
	public void makePayment() {
		System.out.println("You cannot proceed to payment.");
	}
	@Override
	public void back() {
	}
	@Override
	public void next() {
		System.out.println("No option of going next from here");		
	}

}
