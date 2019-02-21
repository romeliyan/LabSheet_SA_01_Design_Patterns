package TemplateMethodPattern;

public abstract class Beverages {

	//abstract methods
	abstract void addCondiments(); 
	
	abstract void brew();
	
	//methods
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pour into cup");
	}
	
	
	void prepare() {
		boilWater();
		brew();
		addCondiments();
		pourInCup();
	}
	
	
	
}
