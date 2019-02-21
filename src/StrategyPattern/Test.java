package StrategyPattern;

public class Test {

public static void main(String[] args) {
		
		Student underGrad = new UnderGraduateStudents();
		Student postGrad = new PostGraduateStudents();
		
		postGrad.offerPrograms();
		postGrad.conductFestival();
		postGrad.displayStudent();
		
		System.out.println();
		System.out.println();
		System.out.println("Assign New Event");
		System.out.println();
		System.out.println();
		
		postGrad.setConductFestival(new CodeFest());
		postGrad.offerPrograms();
		postGrad.conductFestival();
		postGrad.displayStudent();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		underGrad.offerPrograms();
		underGrad.conductFestival();
		underGrad.displayStudent();
		
		System.out.println();
		System.out.println();
		System.out.println("Assign New Event");
		System.out.println();
		System.out.println();
		
		underGrad.setOfferPrograms(new MScPrograms());
		underGrad.offerPrograms();
		underGrad.conductFestival();
		
	}
}
