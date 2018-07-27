package zadanie8;

public class Floor extends Location {
	private int liczbaPokoiNaPietrze;
	private int nrPietra;

	public Floor(int nrPietra) {
		this.nrPietra = nrPietra;

		liczbaPokoiNaPietrze = generatorLiczbyPokoi();

		// tworzenie tablicy obiektow Room o wielkosci rownej wylosowanej
		// liczbie pokoi
		lokalizacja.numerPokoju = new Room[liczbaPokoiNaPietrze];
		for (int i = 0; i < liczbaPokoiNaPietrze; i++) {
			// tworzenie nowego obiektu Room i zapisywanie do tablicy zbiorPokoi
			lokalizacja.numerPokoju[i] = new Room(i + 1);
		}

	}

	// losowanie liczby pokoi
	private int generatorLiczbyPokoi() {
		int liczba = (int) ((Math.random() + 0.1) * 10);
		return liczba;
	}

	@Override
	public void opis() {
		System.out.println("--------------------------------");
		System.out.println("pietro nr: " + nrPietra + "   liczba pokoi: " + liczbaPokoiNaPietrze);
		System.out.println("--------------------------------");

		for (int i = 0; i < liczbaPokoiNaPietrze; i++) {
			lokalizacja.numerPokoju[i].opis();
		}

		System.out.println("");

	}

}
