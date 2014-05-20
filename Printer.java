public class Printer extends Regionals{
	String technology;
	String type;
	private static String x= "LASER";
	private static String y= "INKJET";
	private static String z= "COLORED";
	private static String w= "WHITEBLACK";
	
	public Printer(String name , int year ,String constractor , double price ,String technology, String type){
		super(name, year, constractor, price);
		this.technology = technology;
		this.type = type;
	}
	
	public void setTechnology(int te10){
		if(te10 == 1){
			technology = x;
		}else technology = y;
	}
	public void setType(int ty10){
		if(ty10 == 1){
			type = z;
		}else type = w;
	}
	public String getTechnology(){
		return technology;
	}
	public String getType(){
		return type;
	}
	public String toString(){
		return String.format(super.toString() + "\ntechnology: " + this.technology + "\ntype: " + this.type);
	}
	
}