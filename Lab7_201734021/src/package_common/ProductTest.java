package package_common;

public class ProductTest {

	public void testProduct(Product p){
		
		p.setPrice(12.0);
		System.out.println(p.getPrice());
		System.out.println(p.getName());
	}
	
	public void testDataStorage(DataStorage dt){
		dt.getFreeCapacity();
		dt.format();
	}
	
	public void testNetworked(Networked NT){
		
		
		System.out.println("isConnectedValue : "+NT.isConnected());
		System.out.println("maxSpeedValue : "+NT.maxSpeed());
	
	}
	
	public void testCooker(Cooker CK){
	
		
		System.out.println("preparefoodValue"+CK.prepareFood());
	}


	
	public static void main(String[] args) {
		
		Toaster TS = new Toaster(12.0,"eggs");
		SmartTV TV = new SmartTV(12,"samsung",23);
		ProductTest pt = new ProductTest();			
		Laptop laptop = new Laptop(500.0,"Asus",500,300);
		pt.testProduct(laptop);
		pt.testDataStorage(laptop);
		pt.testCooker(TS);
		pt.testNetworked(TV);
		

		
	}
}
