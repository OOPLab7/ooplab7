package package_common;

public class Laptop {
	
	double totalCapacity;
	double usedCapacity;
	
	public double getFreeCapacity(){
		return totalCapacity-usedCapacity;
	}
	
	public void format(){
		System.out.println("format");
	}

}
