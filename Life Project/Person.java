public class Person {
	private int age;
	private String name;
	private double wealth;
	private boolean hasVehicle;
	private double hunger;
	private int food;
	private Vehicle[] vehicles;
	
	public Person() {
		this.age = 0;
		this.name = "";
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
		this.vehicles = new Vehicle[100];
	}
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
		this.vehicles = new Vehicle[100];
	}
	
	//getter: Returns value of instance variable
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	//setter: Changes the values of instance variables
	public void setAge(int age) {
		this.age = age;
	}
	
	//The toString method provides a string representation of the 
	public String toString() {
		return "Human: [Name: " + getName() + ", Age: " + getAge() + ", Wealth: " + "$" + this.wealth + "]";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int numberOfVehicles() {
		int total = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] != null) {
				total++;
			}
			else {
				break;
			}
		}
		return total;
	}
	
	public void eat() {
		if (food >= 4.5) {
			hunger -= 1.0;
			food -= 1.5;
			System.out.println("Yum, I ate all of it");
		}
		else {
			System.out.println("Not enough food, please buy food");
		}
	}
	
	public void eat (int food) {
		hunger -= (int)(food / 4.5);
	}
	
	public void grow() {
		age++;
	}
	
	public void work() {
		if (hunger < 5) {
			wealth += 10.5;
			hunger += 0.5;
			System.out.println("Wow, I worked a lot");
		}
		else {
			System.out.println("Too hungry to work.");
		}
	}
	
	public void buyFood() {
		if (wealth > 5) {
			wealth -= 4.5;
			food++;
			System.out.println("Yay, I bought some food!");
		}
		else {
			System.out.println("Not enough money, please work.");
		}
	}

}