
public class ConstructorDemo2 {

	public static void main(String[] args) {
		Product p = new Product(111,"Smart TV",5,25879);
		p.print();
		System.out.println("============");
		Product p1 = new Product(12,"Smart Phone",12999);
		p1.print();
		
	}

}

class Product{
	private int id;
	private String name;
	private int quantity;
	private double price;
	
	public Product(int id,String name,int quantity,double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		
	}
	
	public Product(int id,String name,double price) {
		this(id, name,1,price);
	}
	
	public void print() {
		System.out.println("Id : " + id);
		System.out.println("Name : "+ name);
		System.out.println("Quantity : " + quantity);
		System.out.println("Price : " + price);
		System.out.println("Total Price : " + price*quantity);
	}
}
