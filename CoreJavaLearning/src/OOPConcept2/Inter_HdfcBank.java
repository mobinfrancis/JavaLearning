package OOPConcept2;

public class Inter_HdfcBank implements Inter_USBANK,Inter_BRAZILBANK {//multiple inheritance

	
	public void credit() {
		System.out.println("HDFC::Credit");
		
	}

	
	public void debit() {
		System.out.println("HDFC::Debit");
		
	}


	public void transfer() {
		System.out.println("HDFC::Transfer");
		
	}
public void eduloan() { //methods of hdfc
	System.out.println("HDFC::Education Loan ");
}



public void mutualfund() {
	System.out.println("BAZIL::MUTUAl BANK");
	
}
}
