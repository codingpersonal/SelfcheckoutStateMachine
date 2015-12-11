import java.util.ArrayList;

public interface IState {
	public void scan(ArrayList<String> item);
	public void enterBagCount(int count);
	public void makePayment();
	public void back();
	public void next();
}
