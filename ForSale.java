public class ForSale extends Customer{
	String soldDate;
	
	
	public ForSale(String name,String number, String soldDate){
		super(name, number);
		this.soldDate = soldDate;
		
	}
	public void setSoldDate(String o){
		soldDate = o; 
	}
	
	public String getSoldDate(){
		return soldDate;
	}
	
	public String toString(){
		return String.format(super.toString() + "\nDate of sale: " + soldDate );
	}
}