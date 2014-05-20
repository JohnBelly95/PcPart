public class CPU extends Pc_accessory{
	double speed;
	int core_num;
	public static final String a = "SPEED";
	public static final String b = "CORES";
	public CPU(String name , int year , String constractor , double price, double speed, int core_num){
		super(name, year , constractor, price);
		this.speed = speed;
		this.core_num = core_num;
	}

	public void setSpeed(double s3){
		speed = s3;
	}
	public void setCore_num(int c3){
		core_num = c3;
	}
	public double getSpeed(){
		return speed;
	}
	public int getCore_num(){
		return core_num;
	}
	public String toString(){
		return String.format(super.toString() + "\n" + a + ": " + this.speed  + "\n" + b + ": " + this.core_num );
	}
	
}