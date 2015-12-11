
public class PayState extends State{

	public PayState(StateManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	public void makePayment()
	{
		System.out.println("Pay using the mentioned methods!");
		manager.setState("FINISH");
	}
	
	public void back() {
		System.out.println("Going back to choose Bags screen");
		manager.setState("BAGS");
	}
	
}
