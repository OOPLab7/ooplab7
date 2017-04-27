package package_common;

public class Laptop extends Product implements Networked,DataStorage{
	
	double totalCapacity;
	double usedCapacity;
	
	public double getFreeCapacity(){
		return totalCapacity-usedCapacity;
	}
	
	public void format(){
		System.out.println("format");
	}
	
	public boolean isConnected(){
		return true;
	}
	
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