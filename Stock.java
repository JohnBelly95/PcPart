import java.util.*;
import java.io.*;
public class Stock{
	private static String item = "ITEM";
	BufferedReader input = new BufferedReader(new FileReader("STOCK_LIST.txt"));
	BufferedWriter output = new BufferedWriter(new FileWriter("STOCK_LIST.txt"));
	public ArrayList <Store> stock = new ArrayList <Store>();
	public ArrayList <Integer> q=new ArrayList <Integer>();
	Scanner in = new Scanner(System.in);
	public void addProduct(Store prod){
		//stock.add(prod);
		output.write("\n" + item + "\n{" + prod.toString() + "\n}",0,(prod.toString().length() + 8));
		output.close();
		String str = input.readLine()
		System.out.println(str);
	}
	public void lookUp () {
		for(int i=0; i< stock.size(); i++){
			System.out.println(stock.get(i).toString() + "\nQuantity: " + q.get(i));
			System.out.println("*****************************");
		}
	}
	public boolean find (Store prod) {
		for(int i=0; i< stock.size(); i++){
			if(stock.get(i).equals(prod)){
				return true;
			}
		}
		return false;
	}
	public void setQuantity(int quantity){
		q.add(quantity);
	}
}