package StrategyPattern;

public class UnderGraduateStudents extends Student {

	public UnderGraduateStudents() {
		this.setOfferPrograms(new BScPrograms());
		this.setConductFestival(new CodeFest());
	}
	
	@Override
	void displayStudent() {
		System.out.println("Display Under Graduate Students");
		
	}
}
