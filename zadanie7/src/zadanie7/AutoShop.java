package zadanie7;

public class AutoShop {
	public static void main(String[] args) {

		Truck t = new Truck(100, 10000, "bialy", 4000);
		t.getSalePrice();
		Hatchback h = new Hatchback(150, 5000, "czerwony", 2010, 500);
		h.getSalePrice();
		Sedan s = new Sedan(200, 7000, "czarny", 4000);
		s.getSalePrice();
	}

}
