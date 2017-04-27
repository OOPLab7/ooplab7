package package_common;

public class SmartTV extends Product implements DataStorage,Networked {
	
	private int Channel;
	
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
	
	@Override
	public String getName(){
		
		String name="get name";
		return name;
	}

	public int getChannel() {
		return Channel;
	}

	public void setChannel(int channel) {
		Channel = channel;
	}
	
	public SmartTV(int channel){
		
		this.Channel=channel;
	}
	

	
}
