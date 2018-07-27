package zadanie5;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wektor {
	private double[] wektor = new double[2];
	private Scanner odczyt = new Scanner(System.in);

	public Wektor(double a, double b) {
		this.wektor[0] = a;
		this.wektor[1] = b;
	}

	// zapisywanie wsporzednych z konsoli do tablicy
	public void zapisWektor(int nrWektora) {
		boolean warunek = true;
		do {
			System.out.println("podaj wspolrzedne " + nrWektora + " wektora, oddzielone spacja:");
			String s = odczyt.nextLine();
			// kompiluje wzorzec
			Pattern p = Pattern.compile("\\d+");
			// tworzy obiekt Matcher ktory bedzie pasowal do wzorca p
			Matcher m = p.matcher(s);

			int i = 0;
			// find() szuka kolejnego dopasowania wzorca
			while (m.find()) {
				// zamiana na int i zapis do tablicy
				wektor[i] = Integer.parseInt(m.group());
				i += 1;
				if (i == 2) {
					warunek = false;
					break;
				}
			}
			if (i < 2) {
				System.out.println("podales za malo wspolrzednych, sprobuj ponownie...");
			}
		} while (warunek == true);
	}

	// odczytywanie wspolrzednych z tablicy
	public void odczytWektor() {
		for (int i = 0; i < 2; i++) {
			System.out.println(wektor[i]);
		}
	}

	// obliczanie dlugosci
	public double dlugoscWektor() {

		double dlugosc = Math.sqrt(Math.pow(this.wektor[0], 2) + Math.pow(this.wektor[1], 2));

		return dlugosc;
	}

	// sumowanie wektorow
	public static void sumaWektor(Wektor w1, Wektor w2)

	{
		// petla - wprowadzanie wspolrzednych dopoki dlugosci nie beda rowne
		while (w1.dlugoscWektor() != w2.dlugoscWektor()) {
			try {
				// rzucanie wyjatku jesli dlugosci sa rozne
				if (w1.dlugoscWektor() != w2.dlugoscWektor()) {
					throw new DifferentVectorSizeException(w1, w2);
				}
			} catch (DifferentVectorSizeException e) {
				System.out.println("podaj wspolrzedne wektorow jeszcze raz...");
			}

			w1.zapisWektor(1);
			w2.zapisWektor(2);
		}

		double suma1 = w1.wektor[0] + w2.wektor[0];
		double suma2 = w1.wektor[1] + w2.wektor[1];
		Wektor suma = new Wektor(suma1, suma2);

		System.out.println("trwa zapisywanie...");
		Wektor.zapisz("suma wektorow", suma);
		System.out.println("zapisywanie ukonczone :)");

		return;
	}

	public static void zapisz(String nazwaPliku, Wektor w) {

		String s = "Suma wektorow 1 i 2: [" + w.wektor[0] + "] [" + w.wektor[1] + "] \n";
		// zamiana stringa na bajty
		byte data[] = s.getBytes();
		// tworzenie sciezki pliku
		Path sciezka = Paths.get(nazwaPliku);
		// CREATE - tworzony nowy jesli nie istnieje
		// APPEND - dopisywanie
		try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(sciezka, CREATE, APPEND))) {

			out.write(data, 0, data.length);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
