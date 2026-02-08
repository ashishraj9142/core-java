package blc;

public class Product {
int id;
String name;
double price;
public void setProductDetails(int id,String name,double price) {
this.id = id;
this.name = name;
this.price = price;
}
public void calculateDiscount() {
	double disCount;
	if(price<1000) {
		disCount = (price*0.05);
	}
	else if (price>=1000 && price<=5000) {
		disCount = (price*0.10);
	}
	else {
		disCount = (price*0.15);
	}
	System.out.println("The discout amount  "+disCount);
	System.out.println("Final price of the product " + (price-disCount));
}

public String customerDetails() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}
}
