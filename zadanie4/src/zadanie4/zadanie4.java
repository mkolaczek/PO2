package zadanie4;

public class zadanie4 {
	public static void main(String[] args) {

		Invoice a = new Invoice(1, "mleko", 2, 2.5);
		System.out.println("ID: " + a.getID() + ", opis: " + a.getOpisPrzedmiotu() + ", ilosc: "
				+ a.getIloscKupionychSztuk() + ", cena za sztuke " + a.getCenaZaSztuke() + " zl");

		System.out.println("koszt calkowity: " + a.GetInvoiceAmount() + " zl");

		a.setCenaZaSztuke(3);

		System.out.println("nowa cena za sztuke mleka: " + a.getCenaZaSztuke() + " zl");
	}
}
