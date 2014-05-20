public abstract class Regionals extends Store{
	private static final double regional_disc = 0.1;
	double discount;
	public Regionals(String name , int year , String constractor , double price){
		super(name, year, constractor, price);
		setDiscount(price);
	}
	
	public void setDiscount(double p){
		
		discount = p -( p * regional_disc);
	}
	
	public double getDiscount(){
		return discount;
	}
	public String toString(){
		return String.format(super.toString() + "\nfinal price: " + discount );
	}
	
}