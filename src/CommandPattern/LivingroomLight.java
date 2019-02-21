package CommandPattern;

public class LivingroomLight implements Light{
	@Override
	public void on() {
		System.out.println("Livingroom Light is on");
		
	}

	@Override
	public void off() {
		System.out.println("Livingroom Light is off");
		
	}
	
}
