package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_balance);
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.moneyTransfer();
		hs.educationLoan();
		hs.carLoan();
		
		//dynamic polymophism = child class object can be referred by parent interface variables
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.moneyTransfer();
		//education loan and car loan define sepeartly by hsbc bank, hence cannot access by hdfc bank
		//only overriden method is called
		
		BrazilBank m = new HSBCBank();
		m.mutualFunds();	
		
		
		
	}

}
