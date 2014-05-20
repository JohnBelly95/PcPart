import java.util.*;
public class CustomList {
	public int code = 0;
		public ArrayList <Store> order = new ArrayList <Store>();
		public ArrayList <Custom> custom = new ArrayList <Custom>();
		public ArrayList <Integer> c = new ArrayList <Integer>();
            public void addOrder(Store prod ,Custom cust){
				order.add(prod);
				custom.add(cust);
				
				c.add(code);
				this.code++;
            }
			 public void lookUp () {
				for(int i=0; i< order.size(); i++){
					System.out.println(order.get(i).toString() + "\nOrder Details \n" + custom.get(i).toString() + "\n Order code: " + c.get(i) + "\n" );
					System.out.println("*****************************");
				}
            }
			public void find(int a){
				System.out.println(order.get(a).toString() + "\nOrder Details \n" + custom.get(a).toString() + "\n Order code: " + c.get(a) + "\n" );
			}
			public Custom bringCustom(int b){
				return custom.get(b);
			}
			public Store bringProduct(int c){
				return order.get(c);
			}
}