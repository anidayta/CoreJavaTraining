package OOPSConceptPart2;

public interface USBank {

	int min_balance = 100;
	
	public void credit(); //in interface we don't give method body, only declaration
	
	public void debit();
	
	public void moneyTransfer();
	
	//in interface we can decalre the variables
	//Variables are by default by static in nature
	//vars value will not be changed
	//** NO STATIC METHOD allowed in INTERCFACE
	//NO MAIN METHOD
	//we cannot create the onject of interface, means interface is abstract in nature
	
}
