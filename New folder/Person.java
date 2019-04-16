public class Person {
	public int age;
	public String name;
	public double wealth;
	public boolean hasVehicle;
	public double hunger;
	public int food;
	public Vehicle[] vehicles;
	
	public Person() {
		this.age = 0;
		this.name = "";
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
		this.vehicles = new Vehicle[100];
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
