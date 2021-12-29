package mock_test;

//G.chakravarthi
//Mobile no : 9030839781
//Batch Code: GCCM19
public class Parttern {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i == 2) && (j == 1) || (i == 3) && (j == 2) || (i == 4) && (j == 1) || (i == 4) && (j == 3)) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}

			}

			System.out.println();
		}
	}
}
