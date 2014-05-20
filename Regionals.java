public abstract class Regionals extends Store{
	private static final double regional_disc = 0.1;
	public static final String a = "DISCOUNT";
	double discount;
	public Regionals(String name , int year , String constractor , double price,String model){
		super(name, year, constractor, price, model);
		setDiscount(price);
	}
	
	public void setDiscount(double p){
		
		discount = p -( p * regional_disc);
	}
	
	public double getDiscount(){
		return discount;
	}
	public String toString(){
		return String.format(super.toString() + "\n\t\t" + a + ": " + discount );
	}
	
}