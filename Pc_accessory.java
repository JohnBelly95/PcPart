public abstract class Pc_accessory extends Store{
	private static final double pc_accessory_disc = 0.25;
	public static final String a = "DISCOUNT";
	double discount;
	public Pc_accessory(String name , int year , String constractor , double price,String model){
		super(name, year, constractor, price, model);
		setDiscount(price);
	}
	
	public void setDiscount(double p){
		
		discount = p - (p * pc_accessory_disc);
	}
	
	public double getDiscount(){
		return discount;
	}
	public String toString(){
		return String.format(super.toString() + "\n\t\t" + a + ": " + discount );
	}
	
}