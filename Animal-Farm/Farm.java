
	/* 
	- animals : Animal [ ] 
	- farmName : String
	- numAnimals : int         //calculated controlled variable no setter

	+ Farm()                //default 10 animals 
	+ Farm(String)            //default 10 animals 
	+ Farm(int)            //size of array
	+ Farm(String, int)    

	+ addAnimal(Animal) : void    //use the next available slot to add the Animal, resize the array if necessary
	+ getFarmName() : String
	+ setFarmName(String) : void
	+ getAnimal(int) : Animal             //return null if index is invalid
	+ getNumAnimals() : int        //notice no setter… this is a controlled variable
	+ getFirstAnimal() : Animal       
	+ getLastAnimal() : Animal    
	+ getAnimals() : Animal[ ]
	+ printAllDetails() : void    // prints Farm attributes followed by Animal attributes as formatted below : 
	                                // "FarmName: %20s | Number of Animals: %4d | Farm Size: %4d\n" 
	                                // "Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n"
	+ removeAnimal(int) : Animal     
	+ removeAllAnimals() : void
	+ getTotalWeightOfAllAnimals() : double
	+ getAverageWeightOfAllAnimals() : double
	+ getNumberOfAnimalsAboveWeight(double) : int
	+ getNumberOfAnimalsBelowWeight(double) : int
	+ increaseWeightOfAllAnimals() : void
	+ increaseWeightOfAllAnimals(double) : void
	 */

	public class Farm {
		
		private Animal[] animals;
		private String farmName;
		private int numAnimals; //calculated controlled variable no setter

		public Farm() {
			animals = new Animal[10];
			farmName = "";
			numAnimals = 0;
		}
		
		public Farm(int maxAnimals) {
			if (maxAnimals < 0) {
				maxAnimals = 0;
			}
			animals = new Animal[maxAnimals];
			farmName = ""; //remove
			numAnimals = 0; //remove
		}
		
		public Farm(String farmName) {
			this.farmName = farmName;
			animals = new Animal[10]; //remove
			numAnimals = 0; //remove
		}
		
		public Farm(String farmName, int maxAnimals) {
			if (maxAnimals < 0) {
				maxAnimals = 0;
			}
			this.farmName = farmName;
			animals = new Animal[maxAnimals];
			numAnimals = 0;
		}
		
		public void addAnimal(Animal a) {
			boolean beenAdded = false;
			for (int i = 0; (i < animals.length) && (beenAdded == false); ++i) {
				if (animals[i] == null) {
					animals[i] = a;
					beenAdded = true;
				}
			}
			//This method adds an animal at the next available slot
		} //use the next available slot to add the Animal, resize the array if necessary
		
		public String getFarmName() {
			return farmName;
			//This method returns the value of the String farmName
		}
		
		
		public void setFarmName(String farmName) {
			this.farmName = farmName;
			//Assigns the value of the parameter to the member variable farmName
		}
		
		
		public Animal getAnimal(int index) {
			if ((index < 0) || (index >= animals.length)) {
				return null;
			}
			else {
				return animals[index];
			}
			//This method gets the Animal at the specified index
		} //return null if index is invalid
		
		
		public int getNumAnimals() {
			return numAnimals;
		}
		
		
		public Animal getFirstAnimal() {
			return animals[0];
			//This method will get the first Animal in the array
		}
		
		public Animal getLastAnimal() {
			Animal valueToReturn = animals[0];
			boolean gotValue = false;
			for (int i = 0; (i < animals.length) && (gotValue == false); ++i) {
				if (animals[i] == null) {
					valueToReturn = animals[i - 1];
					gotValue = true;
				}
			}
			
			if (gotValue == false) {
				return animals[animals.length - 1];
			}
			else {
				return valueToReturn;
			}
			//This method will get the last Animal in the array
		}
		
		public Animal[] getAnimals() {
			return animals;
		}
		
		public void printAllDetails() {
			for (int i = 0; i < animals.length; ++i) {
				animals[i].printDetails();
			}
			//This method prints the values of the Farm and each Animal in it by calling the printDetails method from the
			//Animal class on each Animal instance.
		}
	     
		
		public Animal removeAnimal(int index) {
			Animal removedObject = animals[0];
			if ((index < 0) && (index >= animals.length)) {
				return null;
			}
			else {
				for (int i = index; i < animals.length; ++i) {
					if (i == index) {
						removedObject = animals[i];
					}
					
					if (i == animals.length - 1) {
						animals[i] = null;
					}
					else {
						animals[i] = animals[i + 1];
					}
				}
				return removedObject;
			}
			//This method will remove the element at the specified index by shifting all elements at greater indexes down 
			 //If an invalid index is passed as a parameter nothing will be removed
		}
		
		
		public void removeAllAnimals() {
			animals = null;
			numAnimals = 0;
			//This method will clear the entire array and reset numAnimals to 0
		}
		
		
		public double getTotalWeightOfAllAnimals() {
			double sum = 0.0;
			for (int i = 0; i < animals.length; ++i) {
				sum += animals[i].getWeight();
			}
			return sum;
			//This method will compute the sum of the weight of all elements in the array
		}
		
		public double getAverageWeightOfAllAnimals() {
			double sum = 0.0;
			int numElements = 0;
			for (int i = 0; i < animals.length; ++i) {
				sum += animals[i].getWeight();
				++numElements;
			}
			return sum / numElements;
			//This method will compute the average weight of all elements in the array
		}
		
		public int getNumberOfAnimalsAboveWeight(double weight) {
			int numElements = 0;
			for (int i = 0; i < animals.length; ++i) {
				if (animals[i].getWeight() > weight) {
					++numElements;
				}
			}
			return numElements;
			//This method will scan and count the number of elements in the array with a weight above that of the parameter
		}
		
		public int getNumberOfAnimalsBelowWeight(double weight) {
			int numElements = 0;
			for (int i = 0; i < animals.length; ++i) {
				if (animals[i].getWeight() < weight) {
					++numElements;
				}
			}
			return numElements;
			//This method will scan and count the number of Animal objects in the animals array with a weight below that 
			//of the parameter
		}
		
		public void increaseWeightOfAllAnimals() {
			for (int i = 0; i < animals.length; ++i) {
				animals[i].gainWeight();
			}
			//This method will increase the weight of all Animal objects in the animals array by invoking the gainWeight() 
			//method from the Animal class
		}
		
		public void increaseWeightOfAllAnimals(double weightGain) {
			for (int i = 0; i < animals.length; ++i) {
				animals[i].gainWeight(weightGain);
			}
			//This method will increase the weight of all Animal objects in the animals array by invoking the 
			//gainWeight(double) method from the Animal class
		}
		 
	}

