package package_common;

public class Toaster extends Product implements Cooker{
	
	public Toaster(double price, String name){
		super(price, name);

	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String prepareFood(){
		return "food";
		
	}
	

}
