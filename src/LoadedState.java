import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoadedState extends State{

	public LoadedState(StateManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	public void back() {
		System.out.println("Dont want to scan, go back?");
		manager.setState("INIT");
	}
	
	public void next() {
		System.out.println("Done scanning of items, going to choose bags screen");
		manager.setState("BAGS");
	}
	
	public void scan(ArrayList<String>items) {
		System.out.println("Scan more items? Go on!");
		manager.setState("LOADED");
	}
}
