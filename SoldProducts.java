import java.util.*;
public class SoldProducts {
	public int code = 0;
		public ArrayList <Store> order = new ArrayList <Store>();
		public ArrayList <ForSale> forsale = new ArrayList <ForSale>();
		public ArrayList <Integer> c = new ArrayList <Integer>();
            public void addSale(Store prod ,ForSale fs ){
				order.add(prod);
				forsale.add(fs);
				
				c.add(code);
				this.code++;
            }
			 public void lookUp () {
				for(int i=0; i< order.size(); i++){
					System.out.println(order.get(i).toString() + "\nTransaction Details \n" + forsale.get(i).toString() + "\n Sale code: " + c.get(i) +"\n" );
					System.out.println("*****************************");
				}
            }
}