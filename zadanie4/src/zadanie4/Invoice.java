package zadanie4;

public class Invoice {

	private int id;
	private String opisPrzedmiotu;
	private int iloscKupionychSztuk;
	private double cenaZaSztuke;

	public Invoice(int id, String opis, int ilosc, double cena) {
		this.id = id;
		this.opisPrzedmiotu = opis;
		this.iloscKupionychSztuk = ilosc;
		this.cenaZaSztuke = cena;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setOpisPrzedmiotu(String opis) {
		this.opisPrzedmiotu = opis;
	}

	public void setIloscKupionychSztuk(int ilosc) {
		this.iloscKupionychSztuk = ilosc;
	}

	public void setCenaZaSztuke(double cena) {
		this.cenaZaSztuke = cena;
	}

	public int getID() {
		return this.id;
	}

	public String getOpisPrzedmiotu() {
		return this.opisPrzedmiotu;
	}

	public int getIloscKupionychSztuk() {
		return this.iloscKupionychSztuk;
	}

	public double getCenaZaSztuke() {
		return this.cenaZaSztuke;
	}

	public double GetInvoiceAmount() {
		return (this.cenaZaSztuke * this.iloscKupionychSztuk);
	}

}
