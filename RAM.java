public class RAM extends Pc_accessory {
	String type;
	int capacity;
	int speed;
	private static String x= "DDR";
	private static String y= "DDR2";
	private static String z= "DDR3";
	public static final String a = "TYPE";
	public static final String b = "SPEED";
	public static final String c = "CAPACITY";
	
	public RAM(String name , int year , String constractor , double price ,String type, int speed, int capacity){
		super(name, year, constractor, price,"RAM");
		this.type = type;
		this.capacity = capacity;
		this.speed = speed;
	}
	public void setType(int t5){
		if(t5 == 1){
			type = x;
		}else if(t5 == 2){
			type = y;
		}else type = z;
	}
	public void setSpeed(int s5){
		speed = s5;
	}
	
	public void setCapacity(int c5){
		capacity = c5;
	}
	public String getType(){
		return type;
	}
	public int getSpeed(){
		return speed;
	}
	public int getCapacity(){
		return capacity;
	}
	public String toString(){
		return String.format(super.toString() + "\n\t\t" + a + ": " + this.type  + "\n\t\t" + b + ": " + this.capacity  + "\n\t\t" + c + ": " + this.speed );
	}
	
}