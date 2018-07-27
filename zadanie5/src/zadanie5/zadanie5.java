package zadanie5;

public class zadanie5 {

	public static void main(String[] args) {

		Wektor wek1 = new Wektor(0, 0);
		Wektor wek2 = new Wektor(0, 0);

		wek1.zapisWektor(1);
		wek2.zapisWektor(2);

		Wektor.sumaWektor(wek1, wek2);

	}

}
