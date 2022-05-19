package domain;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	private static int count=0;
	public String id;
	public String nameRestaurant;

	public static final int MAXCAPACITY= 24;
	public static final int MAXTABLES = 4;

	
	
	public List<Table> tables= new ArrayList<>();
	
	
	
	public Restaurant(String name) {
		

		this.nameRestaurant= name;
		this.id= ""+count++;
	}
	
	public int addPeople(int number) throws Exception {

		while (number>Table.MAXPEOPLEPERTABLE) {
			createTable(Table.MAXPEOPLEPERTABLE);
			number -= Table.MAXPEOPLEPERTABLE;
			System.out.println(number+"e");
		}
		return MAXCAPACITY- tables.size()*Table.MAXPEOPLEPERTABLE;
	
	}
	public String  createTable(int number) throws Exception {
		if(tables.size()>=MAXTABLES) 			
			throw new Exception("Mesas llenas");
		
		else {
			Table table= new Table(number);
			tables.add(table);
			
			return table.getId();
		}
	}
	public void removeTable(int number) {
		tables.remove(number-1);

	}
	public String getName() {
		
		return this.nameRestaurant;
	}

	public String updateList() {
		String aux = "";
		
		for (int i =0; i<tables.size();i++) {
			aux+= "Taula "+ tables.get(i).getId()+ " : "+tables.get(i).getPeople()+" persones \n";
		}
		return aux;
	}
	public String getId() {
		return this.id;
	}
}
