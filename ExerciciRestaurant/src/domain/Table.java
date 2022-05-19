package domain;

public class Table {

	private static int count=1;
	public String id;
	public int numPeople;
	public static final int MAXPEOPLEPERTABLE= 6;
	
	
	public Table(int numPeople) throws Exception {
		this.id= ""+count++;
		if (numPeople>MAXPEOPLEPERTABLE) {
			throw new Exception("Massa gran");
		}
		this.numPeople=numPeople;
		
	}
	
	public String getId() {
		return this.id;
	}
	public int getPeople() {
		return this.numPeople;
	}
}
