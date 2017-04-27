package package_common;

public class Toaster extends Cooker{
	
	String food;
	String name;
	
	public String getName() {
		return name;
	}
	

	public void toaster(){
	
	}
	@Override
	public String prepareFood(){
		return food;
		
	}
}
