import java.util.ArrayList;

public class InitState extends State{

	public InitState(StateManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}
	
	public void scan(ArrayList<String>items) {
		System.out.println("Items scanning in init state");
		manager.setState("LOADED");
	}


}
