package CommandPattern;

public class KitchenLight implements Light{

	@Override
	public void on() {
		System.out.println("Kitchen Light is on");
		
	}
 
	@Override
	public void off() {
		System.out.println("Kitchen Light is off");
		
	}
	
}
