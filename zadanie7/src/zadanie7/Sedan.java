package zadanie7;

public class Sedan extends Car {
	private int length;

	public Sedan(int speed, double price, String color, int length) {
		super(speed, price, color);

		this.length = length;
	}

	@Override
	public void getSalePrice() {
		if (length < 4500) {
			double newPrice = price - (price * 0.1);
			System.out.println(
					"Dlugosc nie przekracza 4500cm. Naliczona znizka 10%. Nowa cena Sedan: " + String.format( "%.2f", newPrice ) + " zl");
		} else {
			System.out.println("Cena Sedan: " + String.format( "%.2f", price ) + " zl");
		}

	}
}
