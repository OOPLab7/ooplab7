package package_common;

public class Laptop extends Product implements Networked,DataStorage{
	
	double totalCapacity;
	double usedCapacity;
	
	Laptop(double price, String name,double totalCapacity,double usedCapacity) {
		super(price, name);
		this.totalCapacity=totalCapacity;
		this.usedCapacity=usedCapacity;	
	}
	
	@Override
	public double getFreeCapacity(){
		return totalCapacity-usedCapacity;
	}
	
	@Override
	public void format(){
		System.out.println("format latop");
	}
	
	@Override
	public boolean isConnected(){
		return true;
	}
	
	@Override
	public double maxSpeed(){
		return 11;
	}
	
	public double getTotalCapacity(){
		return totalCapacity;
	}
	
	public void setTotalCapacity(double totalCapacity){
		this.totalCapacity=totalCapacity;
	}
	
	public double getUsedCapacity(){
		return usedCapacity;
	}
	
	public void setUsedCapacity(double usedCapacity){
		this.usedCapacity=usedCapacity;
	}
	
	public String getName(){
		return "Laptop";
	}
	
}