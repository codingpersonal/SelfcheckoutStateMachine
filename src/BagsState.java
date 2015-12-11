
public class BagsState extends State{

	public BagsState(StateManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}
	public void enterBagCount(int count) {
		System.out.println("User is buying bags: " + count);
		manager.setState("PAY");
	}
	
	public void back() {
		System.out.println("Going back to scanning screen, anything left?");
		manager.setState("LOADED");
	}
}
