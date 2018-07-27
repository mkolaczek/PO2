package zadanie8;

public class test {
	public static void main(String[] args) {

		Location bud1 = new Building(1);
		Location bud2 = new Building(2);
		bud1.opis();
		bud2.opis();

		LocationID location = new LocationID();
		Comparable comparable = location;
		comparable.porownanieLiczbyPieter(bud1, bud2);
		comparable.porownanieLiczbyPokoi(bud1, bud2);

	}

}
