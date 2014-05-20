import java.util.*;
import java.io.*;
public class Test{
	private static String item = "ITEM";
	static FileReader in ;
	static FileWriter out;
	static BufferedReader input;
	static BufferedWriter output;
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		try {
			in = new FileReader("STOCK_LIST.txt");
			out = new FileWriter("STOCK_LIST.txt");
            input = new BufferedReader(in);
			output = new BufferedWriter(out);
			String inputLine = null;
			output.write(" ");
			while((inputLine = input.readLine()) != null)
				System.out.println(inputLine);
		}
		catch(IOException ex) {
			System.err.println("An IOException was caught!");
            ex.printStackTrace();
        }
		FileReader in = new FileReader("STOCK_LIST.txt");
		BufferedReader input = new BufferedReader(in);
		Store Item = new Motherboard("MOTHERBOARD",2006,"Plaisio Productions",320," INTEL",32 ,4);;
		output.write("\n" + item + "\n{" + Item.toString() + "\n}",0,(Item.toString().length() + 8));
		output.close();
		String str = input.readLine();
		System.out.println(str);
		System.out.println(Item);
	}
}