package domain;

public class Restaurant {

	private static int count=0;
	public String id;
	public String nameRestaurant;
	public int actualCapacity;
	public static final int MAXCAPACITY= 24;
	
	public Restaurant(String name) {
		
		this.actualCapacity=0;
		this.nameRestaurant= name;
		this.id= ""+count++;
	}
	
	public int addPeople(int number) {
		actualCapacity+=number;
		return MAXCAPACITY- actualCapacity;
	
	}

	public String getName() {
		
		return this.nameRestaurant;
	}
	public int getActualCapacity() {
		return this.actualCapacity;
				
	}
	public String getId() {
		return this.id;
	}
}