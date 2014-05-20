public class Mouse extends Regionals{
	String technology;
	String connection;
	private static String x= "LASER";
	private static String y= "OPTICAL";
	private static String z= "CABLE";
	private static String w= "WIRELESS";
	
	public Mouse(String name , int year ,String constractor , double price ,String technology, String connection){
		super(name, year, constractor, price);
		this.technology = technology;
		this.connection = connection;
	}
	
	public void setTechnology(int t9){
		if(t9 == 1){
			technology = x;
		}else technology = y;
	}
	public void setConnection(int c9){
		if(c9 == 1){
			connection = z;
		}else connection = w;
	}
	public String getTechnology(){
		return technology;
	}
	public String getConnection(){
		return connection;
	}
	public String toString(){
		return String.format(super.toString() + "\ntechnology: " + this.technology + "\nconnection: " + this.connection );
	}
	
}