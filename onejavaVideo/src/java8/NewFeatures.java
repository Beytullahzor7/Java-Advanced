package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewFeatures {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();		
		users.add(new User(1,"Aleyna"));
		users.add(new User(2,"Ahmet"));
		users.add(new User(3,"Zehra"));
		users.add(new User(4,"Murat"));
		users.add(new User(5,"Y�ld�z"));
		users.add(new User(6,"Levent"));
		users.add(new User(7,"Elvan"));
		
		//users.stream().forEach(user -> user.talk());	
		users.stream().forEach(User::talk); //ikisi de ayn� �eyi ifade eder
		
		List<User> filteredList = users.stream().filter(user -> user.id>5)
				.collect(Collectors.toList()); //id si 5 ten b�y�k olanlar� filter edip yeni list i�ine atamak
		System.out.println("Filtered");
		filteredList.stream().forEach(User::talk);
		
		List<User> mappedList =  users.stream()
			.map(user -> new User(user.id+100,user.name)) //elimizdeki userdan yeni bir user olu�turup id sini 100 art�rd�k
			.collect(Collectors.toList());
		
		mappedList.stream().forEach(user -> System.out.println(user.toString()));
		
	 
	}

}

class User{
	
	int id;
	String name;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	public void talk() {		
		System.out.println("Hi, I am " + this.name);
	}
}
