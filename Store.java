public abstract class Store {
	String name;
	int year;
	String constractor;
	double price;
	
	public Store(String name , int year , String constractor , double price){
		this.name = name;
		this.year = year;
		this.constractor = constractor;
		this.price = price;
	}
	
	public  void setName(String n1){
		name = n1;
	}
	public void setYear(int y1){
		year = y1;
	}
	public void setConstractor(String c1){
		constractor = c1;
	}
	public void setPrice(double p1){
		price = p1;
	}
	public String getName(){
		return name;
	}
	public int getYear(){
		return year;
	}
	public String getConstractor(){
		return constractor;
	}
	public double getPrice(){
		return price;
	}
	public String toString(){
		return String.format("name of the product: " + this.name  + " \ncreation year: " + this.year  + "\nthe constractor: " + this.constractor  + "\nprice: " + this.price );
	}
	
}