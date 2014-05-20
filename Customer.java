public abstract class Customer {
	String name ;
	String phone;
	
	
	public Customer(String name , String phone ){
		
		this.name = name;
		this.phone = phone;
	}
	public void setName(String n){
		name  = n;
	}
	public void setPhone(String p){
		phone = p;
	}
	public String getName(){
		return name;
	}
	public String getPhone(){
		return phone;
	}
	public String toString(){
		return String.format( "\nCustomer: " + name  + "\nphone of the customer: " + phone);
	}
}