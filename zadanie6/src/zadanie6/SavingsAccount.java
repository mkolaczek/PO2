package zadanie6;

public class SavingsAccount {

	static double annuallInterestRate = 0.05;
	private double savingsBalance;

	public SavingsAccount(double stanKonta) {
		this.savingsBalance = stanKonta;
	}

	public void wplata(double kwota) {
		savingsBalance += kwota;
	}

	public void wyplata(double kwota) {
		savingsBalance -= kwota;
	}

	public void calclulateMonthlyInterest() {
		savingsBalance += ((annuallInterestRate * savingsBalance) / 12);
	}

	public static void modifyInterestRate(double oprocentowanie) {
		annuallInterestRate = (oprocentowanie / 100);
	}

	public void odczyt() {

		System.out.printf("Stan konta: %, .2f zł%n", savingsBalance);
	}

}
