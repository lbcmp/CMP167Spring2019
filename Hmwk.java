public class Hmwk {
		    
		    public static String getStringTitleCased(String s) {
		       /*  Write a public static method named getStringTitleCased that takes in 1 argument of type String and capitalizes 
		       the first letter of each word in the String, then returns the title cased string. Example: Input: "the dog ate my homework!"
		       Returns: "The Dog Ate My Homework!" */
		       
		    	if (s.length() == 0) {
		            return s;
		         }
		         else {
		        char[] array = new char[s.length()];
		  		
		  		for (int i = 0; i < s.length(); ++i) {
		  			array[i] = s.charAt(i);
		  		}
		  		
		  		array[0] = Character.toUpperCase(array[0]);
		  		for (int i = 1; i < s.length(); ++i) {
		  			if (array[i - 1] == ' ') {
		  				array[i] = Character.toUpperCase(array[i]);
		  			}
		  		}
		  		
		  		String capital = "";
		  		for (int i = 0; i < s.length(); ++i) {
		  			capital += array[i];
		  		}
		  		
		  		return capital;
		         }
		    }
	
	public static void main(String[] args) {
		System.out.println(getStringTitleCased("my dog ate my  homework"));
		
		
		
		

	}
	
}
