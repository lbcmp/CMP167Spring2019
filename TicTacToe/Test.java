import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String[] arr = new String[9];
		String userInput = "";
		
		
		
		boolean wantToPlay = true;
		while (wantToPlay == true) {
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = "   ";
		}
			
		System.out.println(arr[0] + " | " + arr[1] + " | " + arr[2] + "\n---------------");
		System.out.println(arr[3] + " | " + arr[4] + " | " + arr[5] + "\n---------------");
		System.out.println(arr[6] + " | " + arr[7] + " | " + arr[8]);
		
		System.out.println("Player 1 is X. Player 2 is O.");
		
		boolean won = false;
		for (int i = 0; (i < arr. length) && (won == false); ++i) {
			if (i % 2 == 0) {
				System.out.println("Player 1: Enter where you want to go.");
				
				userInput = scnr.next();
				
				if (userInput.equalsIgnoreCase("TL")) {
					arr[0] = " X ";
				}
				else if (userInput.equalsIgnoreCase("TM")) {
					arr[1] = " X ";
				}
				else if (userInput.equalsIgnoreCase("TR")) {
					arr[2] = " X ";
				}
				else if (userInput.equalsIgnoreCase("ML")) {
					arr[3] = " X ";
				}
				else if (userInput.equalsIgnoreCase("MM")) {
					arr[4] = " X ";
				}
				else if (userInput.equalsIgnoreCase("MR")) {
					arr[5] = " X ";
				}
				else if (userInput.equalsIgnoreCase("BL")) {
					arr[6] = " X ";
				}
				else if (userInput.equalsIgnoreCase("BM")) {
					arr[7] = " X ";
				}
				else if (userInput.equalsIgnoreCase("BR")) {
					arr[8] = " X ";
				}
			}
			else {
				System.out.println("Player 2: Enter where you want to go.");
				
	userInput = scnr.next();
				
				if (userInput.equalsIgnoreCase("TL")) {
					arr[0] = " O ";
				}
				else if (userInput.equalsIgnoreCase("TM")) {
					arr[1] = " O ";
				}
				else if (userInput.equalsIgnoreCase("TR")) {
					arr[2] = " O ";
				}
				else if (userInput.equalsIgnoreCase("ML")) {
					arr[3] = " O ";
				}
				else if (userInput.equalsIgnoreCase("MM")) {
					arr[4] = " O ";
				}
				else if (userInput.equalsIgnoreCase("MR")) {
					arr[5] = " O ";
				}
				else if (userInput.equalsIgnoreCase("BL")) {
					arr[6] = " O ";
				}
				else if (userInput.equalsIgnoreCase("BM")) {
					arr[7] = " O ";
				}
				else if (userInput.equalsIgnoreCase("BR")) {
					arr[8] = " O ";
				}
			}
			
				System.out.println(arr[0] + " | " + arr[1] + " | " + arr[2] + "\n---------------");
				System.out.println(arr[3] + " | " + arr[4] + " | " + arr[5] + "\n---------------");
				System.out.println(arr[6] + " | " + arr[7] + " | " + arr[8]);
			
			//ROWS
			if (arr[0].equals(" X ") && arr[1].equals(" X ") && arr[2].equals(" X ")) {
				System.out.println("Player 1 WON! Good job.");
				won = true;
			}
			else if (arr[0].equals(" O ") && arr[1].equals(" O ") && arr[2].equals(" O ")) {
				System.out.println("Player 2 WON! Good job.");
				won = true;
			}
			else if (arr[3].equals(" X ") && arr[4].equals(" X ") && arr[5].equals(" X ")) {
				System.out.println("Player 1 WON! Good job.");
				won = true;
			}
			else if (arr[3].equals(" O ") && arr[4].equals(" O ") && arr[5].equals(" O ")) {
				System.out.println("Player 2 WON! Good job.");
				won = true;
			}
			else if (arr[6].equals(" X ") && arr[7].equals(" X ") && arr[8].equals(" X ")) {
				System.out.println("Player 1 WON! Good job.");
				won = true;
			}
			else if (arr[6].equals(" O ") && arr[7].equals(" O ") && arr[8].equals(" O ")) {
				System.out.println("Player 2 WON! Good job.");
				won = true;
			}
			
			//COLUMNS
			if (arr[0].equals(" X ") && arr[3].equals(" X ") && arr[6].equals(" X ")) {
				System.out.println("Player 1 WON! Good job.");
				won = true;
			}
			else if (arr[0].equals(" O ") && arr[3].equals(" O ") && arr[6].equals(" O ")) {
				System.out.println("Player 2 WON! Good job.");
				won = true;
			}
			else if (arr[1].equals(" X ") && arr[4].equals(" X ") && arr[7].equals(" X ")) {
				System.out.println("Player 1 WON! Good job.");
				won = true;
			}
			else if (arr[1].equals(" O ") && arr[4].equals(" O ") && arr[7].equals(" O ")) {
				System.out.println("Player 2 WON! Good job.");
				won = true;
			}
			else if (arr[2].equals(" X ") && arr[5].equals(" X ") && arr[8].equals(" X ")) {
				System.out.println("Player 1 WON! Good job.");
				won = true;
			}
			else if (arr[2].equals(" O ") && arr[5].equals(" O ") && arr[8].equals(" O ")) {
				System.out.println("Player 2 WON! Good job.");
				won = true;
			}
			
			//DIAGONALS
			if (arr[0].equals(" X ") && arr[4].equals(" X ") && arr[8].equals(" X ")) {
				System.out.println("Player 1 WON! Good job.");
				won = true;
			}
			else if (arr[0].equals(" O ") && arr[4].equals(" O ") && arr[8].equals(" O ")) {
				System.out.println("Player 2 WON! Good job.");
				won = true;
			}
			else if (arr[2].equals(" X ") && arr[4].equals(" X ") && arr[6].equals(" X ")) {
				System.out.println("Player 1 WON! Good job.");
				won = true;
			}
			else if (arr[2].equals(" O ") && arr[4].equals(" O ") && arr[6].equals(" O ")) {
				System.out.println("Player 2 WON! Good job.");
				won = true;
			}
			
			if (won == true) {
				System.out.println("\nDo you want to keep playing? \"YES\" or \"NO\"");
				userInput = scnr.next();
				if (userInput.equalsIgnoreCase("no")) {
					wantToPlay = false;
				}
			}
		}
		
		}
		System.out.println("Thanks for playing");
	}
}
