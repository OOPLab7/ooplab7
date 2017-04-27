package package_common;

public class SmartTV extends Product implements DataStorage,Networked {

	@Override
	public double getFreeCapacity(){
		double capacity=12;
		
		return capacity;
	}
	
	@Override
	public void format(){
		
		System.out.println("format");
	}
	
	@Override
	public boolean isConnected(){
		
		return true;
	}
	
	@Override
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
