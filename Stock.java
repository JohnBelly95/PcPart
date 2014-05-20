import java.util.*;
import java.io.*;
public class Stock{
	private static String item = "ITEM";
	static BufferedReader input;
	static BufferedWriter output;
	public ArrayList <Item> stock = new ArrayList <Item>();
	Scanner in = new Scanner(System.in);
	public void addProduct(Item prod) throws FileNotFoundException, IOException {
		stock.add(prod);
		txtwriter();

	}
	public void lookUp () {
		for(int i=0; i< stock.size(); i++){
			System.out.println(stock.get(i).toString() );
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
	
	public void txtwriter() throws FileNotFoundException, IOException {
		try {
			input = new BufferedReader(new FileReader("STOCK_LIST.txt"));
			output = new BufferedWriter(new FileWriter("STOCK_LIST.txt"));
			String inputLine = null;
			while((inputLine = input.readLine()) != null)
				System.out.println(inputLine);
		}
		catch(IOException ex) {
			System.err.println("An IOException was caught!");
            ex.printStackTrace();
        }
		output.write("STOCK_LIST\n{");
		for(int i=0; i< stock.size(); i++){
			output.write("\n\t" + item + "\n\t{" + stock.get(i).toString() + "\n\t}",0,(stock.get(i).toString().length() + 12));
		}
		output.write("\n}");
		output.close();
	}
}