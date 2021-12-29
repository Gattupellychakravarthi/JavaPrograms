package mock_test;

public class String_Method {
	String BN;
	int pages;
	double cost;

	public String_Method(String bN, int pages, double cost) {
		BN = bN;
		this.pages = pages;
		this.cost = cost;
	}

	public void ExploreThingsinWrittenType() {
		System.out.println("Ramu Interested to Read the book: " + this.BN);
		System.out.println("Book consist no of pages: " + this.pages);
		System.out.println("Book cost: " + this.cost);
	}

	public String toString() {
		return "String_Method [BN=" + BN + ", pages=" + pages + ", cost=" + cost + "]";
	}

	public boolean equals(Object obj) {
		return this.cost == ((String_Method) obj).cost;

	}

}
