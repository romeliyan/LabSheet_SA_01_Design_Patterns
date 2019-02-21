package TemplateMethodPattern;

public class Test {
	
	public static void main(String [] args) {
		
		Beverages tea = new Tea();
		tea.prepare();
		
		System.out.println("=============================");
		
		Beverages coffee = new Coffee();
		coffee.prepare();
		
		
		
	}

}
