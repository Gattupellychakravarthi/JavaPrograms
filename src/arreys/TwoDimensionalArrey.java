package arreys;

public class TwoDimensionalArrey {

	public static void main(String[] args) {
		int[][] Myarrey = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] Myarrey1 = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };

//		System.out.println(Myarrey[0][0]=10);
//		System.out.println(Myarrey[0][1]=10);
//		System.out.println(Myarrey[0][2]=10);
//		System.out.println(Myarrey[1][0]=10);
		
		Myarrey[0][0]=10;
		Myarrey[0][1]=10;
		Myarrey[0][2]=10;
		Myarrey[1][0]=10;
		Myarrey[1][1]=10;
		Myarrey[1][2]=10;
		Myarrey[2][0]=10;
		Myarrey[2][1]=10;
		Myarrey[2][2]=10;
		Myarrey1[0][0]=10;
		Myarrey1[0][1]=10;
		Myarrey1[0][2]=10;
		Myarrey1[1][0]=10;
		Myarrey1[1][1]=10;
		Myarrey1[1][2]=10;
		Myarrey1[2][0]=10;
		Myarrey1[2][1]=10;
		Myarrey1[2][2]=10;
		
		for (int i = 0; i <= Myarrey.length; i++) {
			for (int j = 0; j < Myarrey[i].length; j++) {
				System.out.print(Myarrey[i][j]+" ");
			}
			System.out.println();

		}
		for (int i = 0; i <= Myarrey1.length; i++) {
			for (int j = 0; j < Myarrey1[i].length; j++) {
				System.out.print(Myarrey1[i][j]+" ");
			}
			System.out.println();

		}

	}

}
