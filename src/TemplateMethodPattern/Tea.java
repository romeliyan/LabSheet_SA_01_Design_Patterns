package TemplateMethodPattern;

public class Tea extends Beverages {

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");
		
	}

	@Override
	void brew() {
		System.out.println("Steeping the tea");
		
	}

}
