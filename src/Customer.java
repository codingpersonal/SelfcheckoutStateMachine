import java.util.ArrayList;

public class Customer {

	public static void main(String[] args) {

		ArrayList<String>items = new ArrayList<>();
		items.add("Grocery");
		items.add("Shampoo");
		
		StateManager sm = new StateManager();
		
		System.out.println("\nState: " + sm.getState());
		sm.scan(items);

		System.out.println("\nState: " + sm.getState());
		sm.scan(items);
		
		System.out.println("\nState: " + sm.getState());
		sm.next();
		
		System.out.println("\nState: " + sm.getState());
		sm.enterBagCount(1);
		
		System.out.println("\nState: " + sm.getState());
		sm.back();
		
		System.out.println("\nState: " + sm.getState());
		sm.enterBagCount(1);
		
		System.out.println("\nState: " + sm.getState());
		sm.makePayment();
		
		System.out.println("\nState: " + sm.getState());

	}

}
