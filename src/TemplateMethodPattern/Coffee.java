package TemplateMethodPattern;

public class Coffee extends Beverages{

	@Override
	void addCondiments() {
		System.out.println("Adding suger and milk");
		
	}

	@Override
	void brew() {
		System.out.println("Stripping coffee through filter");
		
	}

}
