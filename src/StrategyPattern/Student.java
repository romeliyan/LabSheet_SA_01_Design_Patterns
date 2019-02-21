package StrategyPattern;

public abstract class Student {

	private IPrograms iPrograms;
	private IFestival iFestival;
	
	public void offerPrograms() {
		iPrograms.offerPrograms();
	}
	
	public void conductFestival() {
		iFestival.performEvent();
	}
	
	public void setOfferPrograms(IPrograms newProgram) {
		this.iPrograms = newProgram;
	}
	
	public void setConductFestival(IFestival newFestival) {
		this.iFestival = newFestival;
	}
	
	abstract void displayStudent();
}
