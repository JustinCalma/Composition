public class Composition {
	
	public static void main(String[] args) {
		Fruit apple = new Fruit("red", "Fuji apple");
		Person uncle = new Person("Joe", apple);
		System.out.println(uncle);
	}
}	
	
class Person {
	String name;
	Fruit favoriteFruit;
	
	public Person(String name, Fruit favoriteFruit) {
		this.name = name;
		this.favoriteFruit = favoriteFruit;
	}
	
	public String toString() {
		return this.name + "'s " + "favorite fruit is " + this.favoriteFruit;
	}
}

class Fruit{
	String color;
	String description;
	
	public Fruit(String color, String description) {
		this.color = color;
		this.description = description;
	}
	
	public String toString() {
		return this.color + " color " + this.description;
	}
}


