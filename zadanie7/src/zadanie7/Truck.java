package zadanie7;

public class Truck extends Car {

	private int weight;

	public Truck(int speed, double price, String color, int weight) {
		super(speed, price, color);
		this.weight = weight;
	}

	
	@Override
	public void getSalePrice() {
		if (weight > 3000) {
			double newPrice = price - (price * 0.1);
			System.out.println("Waga przekracza 3000kg. Naliczona znizka 10%. Nowa cena Truck: " + String.format( "%.2f", newPrice ) + " zl");
		} else {
			System.out.println("Cena Tuck: " + String.format( "%.2f", price ) + " zl");
		}

	}

}
