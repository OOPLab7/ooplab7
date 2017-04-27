package package_common;

public class SmartTV extends Product {

	public boolean isConnected(){
		
		return true;
	}
	
	public double maxSpeed(){
		
		double max= 10;
		return max;
	}
	
	public String getName(){
		
		String name="get name";
		return name;
	}
	
	public int getChannel(){
		
		int channel=23;
		return channel;
	}
	
	public void setChannel(){
		
		System.out.println("Channel");
	}
	
}
