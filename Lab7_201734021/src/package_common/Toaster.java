package package_common;

public class Toaster extends Product implements Cooker{
	
	String food;
	String name;
	
	@Override
	public String getName() {
		return name;
	}
	

	public void Toaster(){
		return name;
	}
	
	@Override
	public String prepareFood(){
		return food;
		
	}
	
	toaster(String food){
		this.food = food;
	}
}
