package deepCopy;

class Car {
}

class CarFactory {
	private String type;
	public CarFactory(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    public static CarFactory createCar(String type) {
        return new CarFactory(type);
    }
}

class Fc{
	private String title;
	private String author;
	public String getTitle() {
		return title;
	}
	
	public Fc(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Fc [title=" + title + ", author=" + author + "]";
	}
	public static Fc getFcObject() {
		return new Fc("java", "james Gosling");
		
	}
	
}
public class FactoryMethod {
	

	public static void main(String[] args) {
		Fc b1 = Fc.getFcObject();
		System.out.println(b1);
		CarFactory myCar = CarFactory.createCar("SUV");
		System.out.println(myCar.getType());

	}

}
