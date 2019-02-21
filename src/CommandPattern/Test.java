package CommandPattern;

public class Test {
	
	public static void main(String [] args) {
		
		Light kitchenLight = new KitchenLight();
		Light livingroomLight = new LivingroomLight();
		
		Command kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		Command livingroomLightOffCommand = new LightOffCommand(livingroomLight);
		
		Remote kitchenLightOnButton = new Remote(kitchenLightOnCommand);
		Remote livingroomLightOffButton = new Remote(livingroomLightOffCommand);
		
		kitchenLightOnButton.pressButton();
		livingroomLightOffButton.pressButton();
		
		
	}

}
