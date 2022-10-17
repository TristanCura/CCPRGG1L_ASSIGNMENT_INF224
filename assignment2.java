
public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayWhileLoop();
		sayDoWhileLoop();
		sayForLoop();
		sayNameArray();
		
	}

	private static void sayWhileLoop() { //Use a while loop to print your FIRSTNAME three times.
		int x = 3;
		int y = 0;
		String fName = "Tristan Kelly";
		
		while(x > y) {
		System.out.println(y+" "+fName);
		y++;
		}
		
	}

	private static void sayDoWhileLoop() { //Use a do-while loop to print your MIDDLENAME four times.
		int x = 4;
		int y = 0;
		String mName = "Prieto";
		
		do {
			System.out.println(y+" "+mName);
			y++;
		}while (x > y);
		
	}

	private static void sayForLoop() { //Use a for loop to print your SURNAME five times.
		int x = 5;
		String sName = "Cura";
		for (int y = 0; x > y; y++) {
			System.out.println(y+" "+sName);
		}
		
	}

	private static void sayNameArray() {
		//Create a char array that consists all of the characters of your FIRSTNAME and use a for 
		//loop to print each character of your FIRSTNAME. (example: ELIZER)
		char[] fName = {'T','R','I','S','T','A','N'};
		int x = 6;
		for (int y = 0; x >= y; y++) {
			System.out.print(fName[y]);
		}
		
		System.out.println();
		
		//Use a for loop to print the char array of your FIRSTNAME in REVERSE order (example: REZILE)
		int a = 0;
		for (int b = 6; b >= a; b--) {
			System.out.print(fName[b]);
		}
	}

}
