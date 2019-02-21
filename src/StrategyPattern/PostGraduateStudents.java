package StrategyPattern;

public class PostGraduateStudents extends Student {

	public PostGraduateStudents() {
		this.setOfferPrograms(new DoctoralPrograms());
		this.setConductFestival(new RoboFest());
	}
	
	@Override
	void displayStudent() {
		System.out.println("Display Post Graduate Students");
		
	}
}
