package arreys;

public class OneDimentionalArrey {
	public static void main(String[] args) {
		// Create Array Object with 5Blocks of arrey size
		int[] Myarrey = new int[5];
		// each block can contains with default values
		// each block have there own address
		// Arrey lenght is start from 0
		// lenght -1
		/*
		 * System.out.println(Myarrey[0]); System.out.println(Myarrey[1]);
		 * System.out.println(Myarrey[2]); System.out.println(Myarrey[3]);
		 * System.out.println(Myarrey[4]); System.out.println(Myarrey.length);
		 * 
		 * //Initializing values to variable Myarrey[0]= 200; Myarrey[1]= 200;
		 * Myarrey[2]= 200; Myarrey[3]= 200; Myarrey[4]= 200;
		 * 
		 * System.out.println(Myarrey[0]); System.out.println(Myarrey[1]);
		 * System.out.println(Myarrey[2]); System.out.println(Myarrey[3]);
		 * System.out.println(Myarrey[4]); System.out.println(Myarrey.length);
		 */

		Myarrey[0] = 500;
		Myarrey[1] = 200;
		Myarrey[2] = 400;
		Myarrey[3] = 600;
		Myarrey[4] = 700;

		/*
		 * System.out.println(Myarrey[0]); System.out.println(Myarrey[1]);
		 * System.out.println(Myarrey[2]); System.out.println(Myarrey[3]);
		 * System.out.println(Myarrey[4]); System.out.println(Myarrey.length);
		 */

		for (int i = 0; i <= Myarrey.length; i++) {

			System.out.println(Myarrey[i]);

		}

	}

}
