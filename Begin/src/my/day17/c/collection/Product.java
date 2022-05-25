package my.day17.c.collection;

public class Product {
	
	private String pname;
	private int price;
	private double weight;
	
	public Product() {}
	
	public Product(String pname, int price, double weight) {
		super();
		this.pname = pname;
		this.price = price;
		this.weight = weight;
	}
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void info() {
		System.out.println("== 제품"+pname+"님의 정보 ==\n"
						+ "1. 제품명 : "+pname+"\n"
						+ "2. 가격 : "+price+"\n"
						+ "3. 무게 : "+weight+"\n");	
	}

	
	////////////////////////////////////////////////////
	@Override
	public String toString() {
		
		return    "1. 제품명 : "+pname+"\n"
				+ "2. 가격 :  "+price+"원\n"
				+ "3. 무게 :  "+weight+"kg\n";
	}
}
