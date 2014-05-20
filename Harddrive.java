public class Harddrive extends Pc_accessory{
	String type;
	int capacity;
	double size;
	private static String x= "HDD";
	private static String y= "SDD";
	public static final String a = "TYPE";
	public static final String b = "SIZE";
	public static final String c = "CAPACITY";
	public Harddrive(String name , int year , String constractor , double price ,String type , double size ,int capacity){
		super(name, year, constractor, price,"HARDDRIVE");
		this.type = type;
		this.capacity = capacity;
		this.size = size;
	}
	public void setType(int t6){
		if(t6 == 1){
			type = x;
		}else type = y;
	}
	public void setSize(double s6){
		size = s6;
	}
	
	public void setCapacity(int c6){
		capacity = c6;
	}
	public String getType(){
		return type;
	}
	public double getSize(){
		return size;
	}
	public int getCapacity(){
		return capacity;
	}
	public String toString(){
		return String.format(super.toString() + "\n\t\t" + a + ": " + this.type + "\n\t\t" + b + ": " + this.capacity  + "\n\t\t" + c + ": " + this.size );
	}
	
	
}