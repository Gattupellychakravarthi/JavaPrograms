package collections;

import java.util.ArrayList;
import java.util.List;

public class program1 {

	public static void main(String[] args) {
	 List a1 = new ArrayList();
	 a1.add("chakri");
	 a1.add("Swathi");
	 a1.add("Abhishek");
	 a1.addAll(1, a1);
	 
	 System.out.println(a1);
	 
	 
	}

}
