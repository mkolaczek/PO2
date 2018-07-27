package zadanie6;

public class zadanie6 {
	public static void main(String[] args) {

		SavingsAccount a = new SavingsAccount(2000);
		a.odczyt();
		a.wplata(1000);
		a.odczyt();
		a.wyplata(2000);
		a.odczyt();
		a.calclulateMonthlyInterest();
		a.odczyt();
		SavingsAccount.modifyInterestRate(50);
		a.calclulateMonthlyInterest();
		a.odczyt();

	}

}
