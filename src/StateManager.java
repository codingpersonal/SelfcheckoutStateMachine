import java.util.ArrayList;

public class StateManager {
	
	//Setting the current state to the init
	IState initState = new InitState(this);
	IState current = initState;
	IState loadedState = new LoadedState(this);
	IState bagsState = new BagsState(this);
	IState payState = new PayState(this);
	IState finishState = new FinishState(this);
	
	public void setState(String state) {
		if(state == "INIT") {
			current = initState;
		}
		if(state == "LOADED") {
			current = loadedState;
		}
		if(state == "BAGS") {
			current = bagsState;
		}
		if(state == "PAY") {
			current = payState;
		}
		if(state == "FINISH") {
			current = finishState;
		}
	}
	
	public String getState() {
		return current.getClass().getName().toString();
	}
	
	public void scan(ArrayList<String> item) {
		current.scan(item);
	}
	
	public void enterBagCount(int count) {
		current.enterBagCount(count);
	}
	
	public void makePayment() {
		current.makePayment();
	}
	
	public void back() {
		current.back();
	}
	
	public void next() {
		current.next();
	}
}
