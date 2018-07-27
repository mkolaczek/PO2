package zadanie8;

public class LocationID implements Comparable {
	int numerBudynku;
	Room[] numerPokoju;
	Floor[] numerPietra;

	@Override
	public void porownanieLiczbyPieter(Location obiekt1, Location obiekt2) {
		if (obiekt1.lokalizacja.numerPietra.length == obiekt2.lokalizacja.numerPietra.length) {
			System.out.println("budynki maja tyle samo pieter");
		}

		else if (obiekt1.lokalizacja.numerPietra.length > obiekt2.lokalizacja.numerPietra.length) {
			System.out.println("budynek " + obiekt1.lokalizacja.numerBudynku + " ma wiecej pieter");
		} else {
			System.out.println("budynek " + obiekt2.lokalizacja.numerBudynku + " ma wiecej pieter");
		}
	}

	@Override
	public void porownanieLiczbyPokoi(Location obiekt1, Location obiekt2) {
		int liczbaPieter = obiekt1.lokalizacja.numerPietra.length;
		int liczbaPieter2 = obiekt2.lokalizacja.numerPietra.length;
		int liczbaPokoi = 0;
		int liczbaPokoi2 = 0;

		for (int i = 0; i < liczbaPieter; i++) {
			liczbaPokoi += obiekt1.lokalizacja.numerPietra[i].lokalizacja.numerPokoju.length;
		}

		for (int i = 0; i < liczbaPieter2; i++) {
			liczbaPokoi2 += obiekt2.lokalizacja.numerPietra[i].lokalizacja.numerPokoju.length;
		}

		if (liczbaPokoi == liczbaPokoi2) {
			System.out.println("Budynki maja po tyle samo pokoi");
		} else if (liczbaPokoi > liczbaPokoi2) {
			System.out.println("budynek " + obiekt1.lokalizacja.numerBudynku + " ma wiecej pokoi niz budynek "
					+ obiekt2.lokalizacja.numerBudynku);
		} else {
			System.out.println("budynek " + obiekt2.lokalizacja.numerBudynku + " ma wiecej pokoi niz budynek "
					+ obiekt1.lokalizacja.numerBudynku);
		}

	}

}
