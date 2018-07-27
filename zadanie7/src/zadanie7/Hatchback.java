package zadanie7;

public class Hatchback extends Car {

	private int year;
	private double manufacturerDiscount;

	public Hatchback(int speed, double price, String color, int year, double manufacturerDiscount) {
		super(speed, price, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	@Override
	public void getSalePrice() {
		double newPrice = price - manufacturerDiscount;
		System.out.println("Cena Hatchback po znizce producenta: " + String.format( "%.2f", newPrice ) + " zl");
	}
}
