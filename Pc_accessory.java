public abstract class Pc_accessory extends Store{
	private static final double pc_accessory_disc = 0.25;
	double discount;
	public Pc_accessory(String name , int year , String constractor , double price){
		super(name, year, constractor, price);
		setDiscount(price);
	}
	
	public void setDiscount(double p){
		
		discount = p - (p * pc_accessory_disc);
	}
	
	public double getDiscount(){
		return discount;
	}
	public String toString(){
		return String.format(super.toString() + "\nfinal price: " + discount );
	}
	
}