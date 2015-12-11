
public class FinishState extends State{

	public FinishState(StateManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	public void back() {
		System.out.println("User pressed back before finish. You want to change payment method?");
		manager.setState("PAY");
	}
}
