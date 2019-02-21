package AbstractPattern;

public class ShapeFactory {
	
	String name = null;
	
	public Shape getShape(String name) {
		if(name == "Square" || name == "square" || name == "SQUARE")
			return new Square();
		else if(name == "Rectangle" || name == "rectangle" || name == "RECTANGLE")
			return new Rectangle();
		else if(name.equalsIgnoreCase("CIRCLE") )
			return new Circle();
    	else
    		return null;
	}

}
