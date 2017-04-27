package package_common;

public class ProductTest {

	
	public void testNetworked(Networked NT){
		
		
		System.out.println("isConnectedValue : "+NT.isConnected());
		System.out.println("maxSpeedValue : "+NT.maxSpeed());
	
	}
	
	public void testCooker(Cooker CK){
	
		
		System.out.println("preparefoodValue"+CK.prepareFood());
	}


	
	public static void main(String[] args) {
		
		Toaster TS = new Toaster("Bread","MaxPOL");
		SmartTV TV = new SmartTV(23);
		ProductTest pt = new ProductTest();	
		
		
	}
}
