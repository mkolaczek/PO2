package zadanie2;

public class zadanie2 {

	public static void main(String[] args) {

		try {

			int number1 = Integer.parseInt(args[1]);
			int number2 = Integer.parseInt(args[2]) + 1;
			int dlugosc = args[0].length();
			if (number2 > (dlugosc)) {
				System.err.println("drugi parametr jest zbyt duzy w stosunku do slowa!");
			} else {

				String new_word = args[0].substring(number1, number2);
				System.out.println(new_word);
			}

		} catch (StringIndexOutOfBoundsException e1) {
			System.err.println("Pierwszy parametr musi byc stringiem!");
			System.out.println();
		} catch (NumberFormatException e2) {
			System.err.println("drugi i trzeci parametr musza byc int-em!");
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e3) {
			System.err.println("zbyt malo argumentow!");
			System.out.println();
		}

	}

}
