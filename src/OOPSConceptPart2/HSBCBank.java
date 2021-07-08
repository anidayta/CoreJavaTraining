package OOPSConceptPart2;

public class HSBCBank implements USBank, BrazilBank{

	//implements (is-a relationship) keyword to define USbank in HSBC bank to overide
	
	
//if a class is implementing any interface, them its mandatory to define the all the methods of interface	

//" This complete script is achieving the multiple inheritance	
	
	//overriding from the USBank
	public void credit() {
		System.out.println("hsbc---credit");
	}
	
		public void debit() {
			System.out.println("hsbc---debit");
			
		}
			public void moneyTransfer() {
				System.out.println("hsbc---moneyTransfer");		
				
			}		
				
			//separate method of HSBC Bank
			public void educationLoan() {
				System.out.println("education loan");
				
			}	
			
			
				public void carLoan() {
					System.out.println("car loan");
			
				}	
					//brazilBank method form brazil bank
					
					public void mutualFunds(){
						System.out.println("HSBC mutual fund");
						
					}
					
					
	}
		
		

	
	
	




