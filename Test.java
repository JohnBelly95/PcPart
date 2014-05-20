import java.util.*;
import java.io.*;
public class Test{
	
	
	public static void main(String args[])throws FileNotFoundException, IOException{
		
		Store p1 = new Motherboard("11gf145546g",2006,"samsung",320," INTEL",32 ,4);;
		Store p2 = new RAM("134f145fr",2003,"baracuda",175,"DDR2",4,1600);
		Item i1 = new Item(p1,3);
		Item i2 = new Item(p2,7);
		Stock stk = new Stock();
		stk.addProduct(i1);
		stk.addProduct(i2);
		
		
	}
}