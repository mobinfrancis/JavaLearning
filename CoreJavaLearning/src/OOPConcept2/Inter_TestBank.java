package OOPConcept2;

public class Inter_TestBank {

	public static void main(String[] args) {
		//Inter_USBANK usb = new Inter_USBANK(); -Cannot create object of interface
		Inter_HdfcBank hdfc = new Inter_HdfcBank();
		hdfc.credit();
		hdfc.debit();
		hdfc.eduloan();
		hdfc.transfer();
		hdfc.mutualfund();
		Inter_USBANK usb = new Inter_HdfcBank();//dynamic polymorphism
		usb.credit();
		usb.debit();
		usb.transfer();
		
		
		System.out.println(Inter_USBANK.age);
		
		

}
}
