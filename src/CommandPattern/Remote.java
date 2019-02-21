package CommandPattern;

public class Remote {
	
	Command command;
	
	public Remote(Command command) {
		this.command = command;
	}
	
	
	public void pressButton() {
		command.execute();
	}
	

}
