package zadanie8;

public class Building extends Location {

	private int liczbaPieter;

	public Building(int nrBudynku) {

		lokalizacja.numerBudynku = nrBudynku;
		// losowanie liczby pieter
		liczbaPieter = generatorLiczbyPieter();
		// tworzenie tablicy obiektow Floor o wielkosci rownej liczbie pieter
		lokalizacja.numerPietra = new Floor[liczbaPieter];

		for (int i = 0; i < liczbaPieter; i++) {
			// tworzenie nowego obiektu Floor i zapisywanie do tablicy
			// zbiorPieter
			lokalizacja.numerPietra[i] = new Floor(i);
		}
	}

	// losowanie liczby pieter
	private int generatorLiczbyPieter() {
		int liczba = (int) ((Math.random() + 0.1) * 10);
		return liczba;
	}

	@Override
	public void opis() {
		System.out.println("********************************");
		System.out.println("budynek nr: " + lokalizacja.numerBudynku + " liczba pieter: " + liczbaPieter);
		System.out.println("********************************");
		System.out.println();
		for (int i = 0; i < liczbaPieter; i++) {
			lokalizacja.numerPietra[i].opis();
		}

	}

}
