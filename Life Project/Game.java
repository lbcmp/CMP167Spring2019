public class Game {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person("Sara", 16);
		person2.setAge(5);
		person1.setName("Lila");
		person1.setAge(14);
		person1.eat();
		person1.work();
		System.out.println("Age of person1: " + person1.getAge());
		System.out.println("Age of person2: " + person2.getAge());
		System.out.println("Age of person3: " + person3.getAge());
		System.out.println(person1);
		
//		System.out.println("age " + person2.age);
//		System.out.println("age " + person1.age);
//		
//		System.out.println("Hunger: " + person1.hunger);
//		System.out.println("Food: " + person1.food);
//		
//		System.out.println("Eating command:");
//		person1.eat();
//		System.out.println("Eating command:");
//		person1.eat();
//		System.out.println("Eating command:");
//		person1.eat();
//		
//		System.out.println("Hunger: " + person1.hunger);
//		System.out.println("Food: " + person1.food);
//		
//		System.out.println("Buying food comand:");
//		person1.buyFood();
//		System.out.println("Working command:");
//		person1.work();
//		System.out.println("Buying food comand:");
//		person1.buyFood();
//		System.out.println("Working command:");
//		person1.work();
//		System.out.println("Working command:");
//		person1.work();
//		System.out.println("Eating command:");
//		person1.eat();
//		System.out.println("Working command:");
//		person1.work();

	}
}