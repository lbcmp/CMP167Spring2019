public class Calculate {

	public static int sumListMethod(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; ++i) {
			sum += array[i];
		}
		return sum;
	}
	
	public static int avgListMethod(int[] array) {
		int avg = sumListMethod(array) / array.length;
		return avg;
	}
	
	public static int oddElements(int[] array) {
		int numOdd = 0;
		for (int i = 0; i < array.length; ++i) {
			if (array[i] % 2 != 0) {
				++numOdd;
			}
		}
		return numOdd;
	}
	
	public static void main(String[] args) {
		/* int[] array = {3, 4, 5, 8};
		System.out.println("Sum is " + sumListMethod(array));
		System.out.println("Avg is " + avgListMethod(array));
		System.out.println("The number of odd elements is " + oddElements(array));
		*/
		
		int[] array = {121, 4, 1000};
	      int max = array[0];
	      int min = array[0];
	      int median = array[0];
	      
	      for (int i = 0; i < array.length; ++i) {
	         if (array[i] > max) {
	          max = array[i];  
	         }
	         else if (array[i] < min) {
	          min = array[i];  
	         }
	      }
	      for (int i = 0; i < array.length; ++i) {
	         if ((array[i] < max) && (array[i] > min)) {
	            median = array[i];
	         }
	      }
	      System.out.println(median);
	}
}
