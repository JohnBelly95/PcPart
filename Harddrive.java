public class Harddrive extends Pc_accessory{
	String type;
	int capacity;
	double size;
	private static String x= "HDD";
	private static String y= "SDD";
	
	public Harddrive(String name , int year , String constractor , double price ,String type , double size ,int capacity){
		super(name, year, constractor, price);
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
		return String.format(super.toString() + "\ntype: " + this.type + "\ncapacity: " + this.capacity  + " \nsize: " + this.size );
	}
	
	
}