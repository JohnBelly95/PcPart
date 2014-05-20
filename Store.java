public abstract class Store {
	String name;
	int year;
	String constractor;
	double price;
	String model;
	public static final String a = "NAME";
	public static final String b = "YEAR";
	public static final String c = "MANUFACTURER";
	public static final String d = "PRICE";
	public static final String e = "MODEL";
	public Store(String name , int year , String constractor , double price,String model){
		this.model = model;
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
		return String.format("\n\t\t" + e + ": " + this.model +"\n\t\t" + a + ": " + this.name  + "\n\t\t" + b + ": " + this.year  + "\n\t\t" + c + ": " + this.constractor  + "\n\t\t" + d + ": " + this.price );
	}
	
}