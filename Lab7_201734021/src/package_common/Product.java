package package_common;

public abstract class Product {
		
double price;
String name;

Product(double price,String name){
	this.price=price;
	this.name=name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
	
public String getName(){
	return name;
}


}
