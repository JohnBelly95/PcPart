public class Graphic_card extends Pc_accessory { 
	String chipset;
	int memory;
	private static String x= "nVidia";
	private static String y= "AMD";
	
	public Graphic_card(String name , int year , String constractor , double price ,String chipset, int memory){
		super(name, year, constractor, price);
		this.chipset = chipset;
		this.memory = memory;
	}
	public void setChipset(int c4){
		if(c4 == 1){
			chipset = x;
		}else chipset = y;
		
	}
	public void setMemory(int m4){
		memory = m4;
	}
	public String getChipset(){
		return chipset;
	}
	public int getMemory(){
		return memory;
	}
	public String toString(){
		return String.format(super.toString() + "\nchipset: " + this.chipset  + "\nmemory: " + this.memory );
	}
	
}