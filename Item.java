public class Item{
	public static final String a = "PIECES";
	private Store prod;
	private int q;
	public Item(Store prod , int q){
		this.prod = prod;
		this.q = q;
	}
	public void setQuantity(int quantity){
		q = quantity;
	}
	public String toString(){
		return String.format(prod.toString() + "\n\t\t" + a + ": " + this.q );
	}
}