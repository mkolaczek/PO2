package zadanie8;

public class Room extends Location {

	private int nrPokoju;

	public Room(int nrPokoju) {
		this.nrPokoju = nrPokoju;
	}

	@Override
	public void opis() {
		System.out.println("numer pokoju: " + nrPokoju);
	}

}
