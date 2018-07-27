package zadanie1;

import java.util.Scanner;
import java.util.Random;

public class zadanie1 {

	static void gra() {
		int licznik = 0;
		Random losowanie = new Random();
		int liczba_wylosowana = losowanie.nextInt(100);
//		System.out.println(liczba_wylosowana);
		Scanner odczyt = new Scanner(System.in);

		for (;;) {

			System.out.println("podaj liczbe: ");

			int liczba = odczyt.nextInt();
			odczyt.nextLine(); // wczytuje znak nowej lini, ktorego nie czysci
								// nextInt()

			licznik = licznik + 1;
			if (liczba == liczba_wylosowana) {
				System.out
						.println("brawo! udalo Ci sie odgadnac za " + licznik + " razem. Chcesz zagrac ponownie? t/n");
				String tak_nie = odczyt.nextLine();

				if (tak_nie.equals("t")) {
					gra();
				}
				break;
			}
			if (liczba < liczba_wylosowana) {
				System.out.println("podana liczba jest mniejsza od wylosowanej, proba nr: " + licznik);
			} else {
				System.out.println("podana liczba jest wieksza od wylosowanej, proba nr: " + licznik);
			}
		}
		odczyt.close();
	}

	public static void main(String[] args) {

		gra();
		System.out.println("dzieki za gre!");

	}
}
