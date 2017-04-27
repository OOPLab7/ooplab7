package package_common;

public class Toaster extends Product implements Cooker{
	
	String food;
	String name;
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String prepareFood(){
		return food;
		
	}
	
	public Toaster(String food, String name){
		this.food = food;
		this.name = name;
	}
}
