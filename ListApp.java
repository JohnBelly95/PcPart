
public class ListApp{
	
	public void work(){
		Store p1=new Motherboard("MOTHERBOARD",2001,"Plaisio Productions",320," INTEL",32 ,4);
		Store p2= new RAM("RAM",2003,"plaisio productions",175,"DDR2",4,1600);
		Store p3= new Harddrive("HARDDRIVE",1994,"plaisio productions",99,"HDD",2.5,1000);
		Store p4= new CPU("CPU",1998,"plaisio productions",135,2.7,4);
		Store p5= new Graphic_card("GRAPHICCARD",2003,"plaisio productions",450,"nVidia",6);
		Store p6 = new Screen("SCREEN",2007,"plaisio productions",70,"LED",17,"1024 * 844","HDMI");
		Store p7 = new Keyboard("KEYBOARD",2006,"plaisio productions",20,"WIRELESS");
		Store p8 = new Mouse("MOUSE",2006,"plaisio productions",18,"LASER","WIRELESS");
		Store p9= new Printer("PRINTER",2010,"plaisio productions",225,"LASER","COLORED");
		Stock stk1 =new Stock();
		stk1.addProduct(p1);
		stk1.setQuantity(3);
		stk1.addProduct(p2);
		stk1.setQuantity(7);
		stk1.addProduct(p3);
		stk1.setQuantity(5);
		stk1.addProduct(p4);
		stk1.setQuantity(1);
		stk1.addProduct(p5);
		stk1.setQuantity(10);
		stk1.addProduct(p6);
		stk1.setQuantity(8);
		stk1.addProduct(p7);
		stk1.setQuantity(2);
		stk1.addProduct(p8);
		stk1.setQuantity(4);
		stk1.addProduct(p9);
		stk1.setQuantity(6);
		
		
		Store p10=new Motherboard("MOTHERBOARD",2002,"Plaisio Productions",400," INTEL",64 ,6);
		Store p11= new RAM("RAM",2004,"plaisio productions",200,"DDR3",4,2000);
		Store p12= new Harddrive("HARDDRIVE",1995,"plaisio productions",150,"HDD",3.5,1000);
		Custom c1=new Custom("Mpampis matsaflokos" ,"6959394919","10/10/1995","15/10/1995","not complete");
		Custom c2=new Custom("Kwstas Ampelokwstakis" ,"6952324212","10/03/2002","15/03/2002","not complete");
		Custom c3=new Custom("Giannis Mpetos" ,"6954344914","2/03/2004","12/03/2004","not complete");
		CustomList cl =new CustomList();
		cl.addOrder(p10,c1);
		cl.addOrder(p11,c2);
		cl.addOrder(p12,c3);
		
		Store p13 = new Keyboard("KEYBOARD",2007,"plaisio productions",30,"WIRELESS");
		Store p14 = new Mouse("MOUSE",2007,"plaisio productions",20,"LASER","WIRELESS");
		Store p15= new Printer("PRINTER",2011,"plaisio productions",250,"LASER","COLORED");
		ForSale c4=new ForSale("Antonis Tsimpoukos" ,"6919191919","15/10/2008");
		ForSale c5=new ForSale("Aris Ari" ,"6922224212","15/10/2007");
		ForSale c6=new ForSale("Anasa sou h anasa mou asteri mou" ,"6934343934","15/10/2006");
		SoldProducts sp =new SoldProducts();
		sp.addSale(p13 , c4);
		sp.addSale(p14 , c5);
		sp.addSale(p15 , c6);
		
	}
}
	