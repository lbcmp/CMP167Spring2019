public class Testing {
	
	public static void main(String [] args) {
		Person person1 = new Person("Laura", 16, 'F');
		Person person2 = new Person("Tito", 18, 'm');
		Person person3 = new Person("Margret", 21, 'f');
		Person person4 = new Person("Cornelius", 10, 'M');
		
		System.out.print("Expecting Cannot generate DL, got ");
		DMV.generateDL(person1.age, true);
		System.out.print("Expecting Cannot generate DL, got ");
		DMV.generateDL(person2.age, false);
		System.out.print("Expecting DL generated , got ");
		DMV.generateDL(person3.age, true);
		System.out.print("Expecting Cannot generate DL, got ");
		DMV.generateDL(person4.age, true);
		
		assert((DMV.calculateExpirationDate(2014) != 2024)) : "Test has not passed";
		assert((DMV.calculateExpirationDate(2014) != 2023)) : "Test has not passed";
	}

	
}
