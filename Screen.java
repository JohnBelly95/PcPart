public class Screen extends Regionals {
	String type;
	double size;
	String gates;
	String analysis ;
	private static String x= "LCD";
	private static String y= "LED";
	private static String z= "HDMI";
	private static String w= "DVI";
	private static String q= "Composite";
	public static final String a = "TYPE";
	public static final String b = "SIZE";
	public static final String c = "GATES";
	public static final String d = "ANALYSIS";
	
	public Screen(String name , int year ,String constractor , double price ,String type , double size , String gates , String analysis){
		super(name, year, constractor, price);
		this.type = type;
		this.size = size;
		this.gates = gates;
		this.analysis = analysis;
	}
	
	public  void setType(int t7){
		if(t7 == 1){
			type = x;
		}else type = y;
	
	}
	public void setSize(double s7){
		size = s7;
	}
	public void setGates(int g7){
		if(g7 == 1){
			gates = z;
		}else if( g7 == 2){
			gates = w;
		}else gates =q;
	
	}
	public void setAnalysis(String a7){
		analysis = a7;
	}
	public String getType(){
		return type;
	}
	public double getSize(){
		return size;
	}
	public String getGates(){
		return gates;
	}
	public String getAnalysis(){
		return analysis;
	}
	public String toString(){
		return String.format(super.toString() + "\n" + a + ": " + this.type  + "\n" + b + ": " + this.size  + "\n" + c + ": " + this.gates + "\n" + d + ": " + this.analysis);
	}
	
}