package BuilderPattern;

public class Test {
	
	public static void main(String [] args) {
		
		Query query1 = new QueryBuilder().select("name").from("student").where("name='Romesh'").orderBy("id").build();
		System.out.println(query1.toString());
		
	}
	

}
