package zadanie5;

public class DifferentVectorSizeException extends Exception {

	private Wektor w1;
	private Wektor w2;
	private static final long serialVersionUID = 1L;

	public DifferentVectorSizeException(Wektor w1, Wektor w2) {
		this.w1 = w1;
		this.w2 = w2;
		System.err.println("[DifferentVectorSizeException]  Rozne dlugosci wektorow!");
		System.out.println("dlugosc wektora pierwszego: " + this.w1.dlugoscWektor() + " dlugosc wektora drugiego: "
				+ this.w2.dlugoscWektor());
	}

}
