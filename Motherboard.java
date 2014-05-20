public class Motherboard extends Pc_accessory {
	String type;
	int memory;
	int gates_num;
	private static String x= "INTEL";
	private static String y= "AMD";
	public static final String a = "TYPE";
	public static final String b = "MEMORY";
	public static final String c = "GATES";
	public Motherboard(String name , int year , String constractor , double price, String type, int memory, int gates_num){
		super(name, year, constractor, price,"MOTHERBOARD" );
		this.type = type;
		this.memory = memory;
		this.gates_num = gates_num;
	}
	public void setType(int t2){
		if(t2 == 1){
			type = x;
		}else type = y;
	}
	public void setMemory(int m2){
		memory = m2;
	}
	public void setGates_num(int g2){
		gates_num = g2;
	}
	public String getType(){
		return type;
	}
	public int getMemory(){
		return memory;
	}
	public int getGates(){
		return gates_num;
	}
	public String toString(){
		return String.format(super.toString() + "\n\t\t" + a + ": " + this.type  + "\n\t\t" + b + ": " + this.memory  + "\n\t\t" + c + ": " + this.gates_num );
	}
	
	
}