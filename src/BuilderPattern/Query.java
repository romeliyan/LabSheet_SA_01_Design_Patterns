package BuilderPattern;

public class Query {
	
	private String select;
	private String from;
	private String where;
	private String orderby;
	
	
	//setters
	
	public void setSelect(String select) {
		this.select = select;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public void setWhere(String where) {
		this.where = where;
	}
	
	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}
	
	
	//getters
	
	public String getSelect() {
		return select;
	}

	public String getFrom() {
		return from;
	}
	
	
	public String toString() {
		
		String query = "SELECT" + this.select + "FROM" + from;
		
		if(where != null) {
			query +="WHERE" + where;
		}
		
		if(orderby != null) {
			query =  query+ "ORDER BY" + orderby;
		}
		
		return query;
		
	}
	
	
}
