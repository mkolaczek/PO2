package zadanie3;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie3 {
	public static void main(String[] args) {

		try {
			Scanner odczyt = new Scanner(System.in);
			System.out.println("podaj wspolczynnik przy x2:");
			double a = odczyt.nextDouble();
			System.out.println("podaj wspolczynnik przy x:");
			double b = odczyt.nextDouble();
			System.out.println("podaj wyraz wolny:");
			double c = odczyt.nextDouble();
			System.out.println();

			double delta = (b * b) - (4 * a * c);
			double x1, x2, x;

			if (delta > 0) {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("funkcja posiada 2 miejsca zerowe: x1=" + x1 + " oraz x2=" + x2);
				String wynik = "funkcja posiada 2 miejsca zerowe: x1=" + x1 + " oraz x2=" + x2 + "\n";
				zapisz(args[0], wynik);
			} else if (delta == 0) {
				x = -b / 2 * a;
				System.out.println("funkcja posiada jedno miejsce zerowe x=" + x);
				String wynik = "funkcja posiada jedno miejsce zerowe x=" + x + "\n";
				zapisz(args[0], wynik);
			} else {
				System.out.println("funkcja nie posiada miejsc zerowych");
			}

			odczyt.close();

		} catch (InputMismatchException e) {

			System.err.println("Niepoprawne dane wejsciowe. Pamietaj zeby liczby oddzielac przecinkiem.");
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.err.println("nie podano parametru wejsciowego, brak zapisu do pliku.");
		}
	}

	public static void zapisz(String nazwaPliku, String coZapisac) {

		String s = coZapisac;
		// zamiana stringa na bajty
		byte data[] = s.getBytes();
		// tworzenie sciezki pliku
		Path sciezka = Paths.get(nazwaPliku);
		// CREATE - tworzony nowy jesli nie istnieje
		// APPEND - dopisywanie
		try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(sciezka, CREATE, APPEND))) {
			// co, odkad, dokad
			out.write(data, 0, data.length);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
