public class Custom extends Customer{
	String orderDate;
	String deliverDate;
	String complete;
	private Store prod;
	private String str1,str2;
	private int OrderNum;
	public Custom(String name,String number,Store prod, String orderDate,String deliverDate ,String complete){
		super(name, number);
		this.prod = prod;
		this.orderDate = orderDate;
		this.deliverDate = deliverDate;
		this.complete = complete;
	}
	public void setOrderDate(String o){
		orderDate = o; 
	}
	public void setDeliverDate(String d){
		deliverDate = d;
	}
	public void setOrderNum(
	public void setComplete(String c){
		complete = c;
	}
	public String getOrderDate(){
		return orderDate;
	}
	public String getDeliverDate(){
		return deliverDate;
	}
	public String getComplete(){
		return complete;
	}
	public String toString(){
		return String.format(super.toString() + "\nDate of the order: " + orderDate + "\nWhen it will be delivered: " + deliverDate  +  "\nState of the delivery:" + complete );
	}
}