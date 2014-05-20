public class Keyboard extends Regionals{
	String connection;
	private static String x= "CABLE";
	private static String y= "WIRELESS";
	
	public Keyboard(String name , int year ,String constractor , double price ,String connection){
		super(name ,year ,constractor ,price);
		this.connection = connection;
	}
	
	public void setConnection(int c8){
		if(c8 == 1){
			connection = x;
		}else connection = y;
	}
	public String getConnection(){
		return connection;
	}
	public String toString(){
		return String.format(super.toString() + "\nconnection: " + this.connection );
	}
	
}
