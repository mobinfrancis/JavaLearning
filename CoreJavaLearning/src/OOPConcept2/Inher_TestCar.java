package OOPConcept2;

public class Inher_TestCar {

	public static void main(String[] args) {
		
		//COmpile time polymorphism - static polymorphism
		Inher_BMW bmw = new Inher_BMW();
		bmw.start();
	    bmw.stop();
		bmw.refuel();
		bmw.engine();//from vehicle
		
		Inher_Car  c= new Inher_Car();
		c.start();
		c.stop();
		c.engine(); //from vehicle
		
		Inher_Car c1 = new Inher_BMW();
		c1.refuel();
		c1.start();//common method in bmw class
		//c1.bmwstop() - not possible 
		
		

	}

}
