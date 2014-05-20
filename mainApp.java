/*MARIOS DELIVORIAS P3130050 2o EKSAMINO
MARIOS VAVOLAS P3130018 2o EKSAMINO
GIWRGOS ANASTASIADIS P3130006 2o EKSAMINO*/

import java.util.*;
public class mainApp{

	static String answer;
	static int answer2;
	static double answer3;
	static boolean f = true;
	static boolean done = true;
	static CustomList cl = new CustomList();
	static SoldProducts sp = new SoldProducts();
	static Scanner in = new Scanner(System.in);
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		ListApp la =new ListApp();
		la.work();
		
		Store a1=new Motherboard("MOTHERBOARD",2006,"Plaisio Productions",320," INTEL",32 ,4);
		Store a2= new RAM("RAM",2007,"plaisio productions",175,"DDR2",4,1600);
		Store a3 = new Keyboard("KEYBOARD",2006,"plaisio productions",20,"WIRELESS");
		Store a4 = new Mouse("MOUSE",2006,"plaisio productions",18,"LASER","WIRELESS");
		Stock stk =new Stock();
		stk.addProduct(a1);
		stk.setQuantity(3);
		stk.addProduct(a2);
		stk.setQuantity(7);
		stk.addProduct(a3);
		stk.setQuantity(5);
		stk.addProduct(a4);
		stk.setQuantity(1);
		
      	
   	 	while(f){
			
			System.out.println("\n If you want to see all available products please press 1");
			System.out.println("\n If you want to see all orders or make one please press 2");
			System.out.println("\n If you want to see all sales please press 3");
			System.out.println("\n If you want to exit the programm please press 0");
			
			answer = scan.nextLine();
			while(done)	{
					if (answer.equals("1")){
						stk.lookUp();
						System.out.println("\n\n Please choose PC accessorys by pressing 1 \n or regionals by pressing 2");
						
						answer = scan.nextLine();
						if(answer.equals("1")){
							System.out.println("\n For MOTHERBOARD press 1");
							System.out.println("\n For CPU press 2");
							System.out.println("\n For HARDDRIVE press 3");
							System.out.println("\n For RAM press 4");
							System.out.println("\n For GRAPHIC CARD press 5");
							
							answer = scan.nextLine();
							if (answer.equals ("1")){
								Motherboard mb = new Motherboard("MOTHERBOARD",0,"plaisio productions",0," 0",0 ,0);
								createMotherboard(mb);
								if(stk.find(mb)){
									if(buy(mb)){
										break;
									}
								}else{
									if(order(mb)){
										break;
									}
								}	
							}
							else if (answer.equals ("2")){
								CPU cpu= new CPU("CPU",0,"plaisio productions",0,0,0);
								createCPU(cpu);
								if(stk.find(cpu)){
									if(buy(cpu)){
										break;
									}
								}else{
									if(order(cpu)){
										break;
									}
								}	
							}

							else if (answer.equals ("3")){
								Harddrive hd= new Harddrive("HARDDRIVE",0,"plaisio productions",0,"0",0,0);
								createHarddrive(hd);
								if(stk.find(hd)){
									if(buy(hd)){
										break;
									}
								}else{
									if(order(hd)){
										break;
									}
								}	
							}
							else if (answer.equals ("4")){
								RAM ram= new RAM("RAM",0,"plaisio productions",0,"0",0,0);
								createRAM(ram);
								if(stk.find(ram)){
									if(buy(ram)){
										break;
									}
								}else{
									if(order(ram)){
										break;
									}
								}	
							}
							else if (answer.equals ("5")){
								Graphic_card gc= new Graphic_card("GRAPHICCARD",0,"plaisio productions",0,"0",0);
								createGraphiccard(gc);
								if(stk.find(gc)){
									if(buy(gc)){
										break;
									}
								}else{
									if(order(gc)){
										break;
									}
								}	
							}
						}else if(answer.equals("2")){
							System.out.println("\n For KEYBOARD press 1");
							System.out.println("\n For MOUSE press 2");
							System.out.println("\n For PRINTER press 3");
							System.out.println("\n For SCREEN press 4");
							
							answer = scan.nextLine();
							if (answer.equals ("1")){
								Keyboard k= new Keyboard("KEYBOARD",0,"plaisio productions",0,"0");
								createKeyboard(k);
								if(stk.find(k)){
									if(buy(k)){
										break;
									}
								}else{
									if(order(k)){
										break;
									}
								}
								break;
							}
							else if (answer.equals ("2")){
								Mouse m = new Mouse("MOUSE",0,"plaisio productions",0,"0","0");
								createMouse(m);
								if(stk.find(m)){
									if(buy(m)){
										break;
									}
								}else{
									if(order(m)){
										break;
									}
								}
								break;		
							}

							else if (answer.equals ("3")){
								Printer p= new Printer("PRINTER",0,"plaisio productions",0,"0","0");
								createPrinter(p);
								if(stk.find(p)){
									if(buy(p)){
									
									}
								}else{
									if(order(p)){
										break;
									}
								}
								break;
							}
							else if (answer.equals ("4")){
								Screen s = new Screen("SCREEN",0,"plaisio productions",0,"0",0,"0","0");
								createScreen(s);
								if(stk.find(s)){
									if(buy(s)){
										break;
									}
								}else{
									if(order(s)){
										break;
									}
								}
								break;
							}
						}
					}
					else if (answer.equals("2")){
						int a = 0;
						cl.lookUp();
						System.out.println("Choose an order by the code number on the right");
						a = in.nextInt();
						cl.find(a);
						System.out.println("Is the order complete? Y/N");
						
						answer = scan.nextLine();
						if(answer.equals("Y")){
							ForSale fs = new ForSale(cl.bringCustom(a).getName(),cl.bringCustom(a).getPhone(),cl.bringCustom(a).getDeliverDate());
							sp.addSale(cl.bringProduct(a),fs);
							break;
						}else break;
						
					}
					else if (answer.equals("3")){
						sp.lookUp();
					}
					else if (answer.equals("0")){
						f = false;
						break;
					}
			}
		}
			
	}		
			
	public static void createMotherboard(Motherboard prod){
		System.out.println("\nThe name is MOTHERBOARD");
		System.out.println("\n give creation year");
		answer2 = in.nextInt();
		prod.setYear(answer2);
		System.out.println("\nThe constructor is standard");
		System.out.println("\n give price");
		answer3 = in.nextDouble();
		prod.setPrice(answer3);
		System.out.println("\n give type 1 for INTEL or 2 for  AMD");
		answer2 = in.nextInt();
		prod.setType(answer2);
		System.out.println("\n give memory size 32 , 64 ,128");
		answer2 = in.nextInt();
		prod.setMemory(answer2);
		System.out.println("\n give gates number 4 , 5 ,6 ");
		answer2 = in.nextInt();
		prod.setGates_num(answer2);
		System.out.println("\n" + prod.toString());
	}
	public static void createGraphiccard(Graphic_card prod){
		System.out.println("\nThe name is GRAPHICCARD");
		System.out.println("\n give creation year");
		answer2 = in.nextInt();
		prod.setYear(answer2);
		System.out.println("\nThe constructor is standard");
		System.out.println("\n give price");
		answer3 = in.nextDouble();
		prod.setPrice(answer3);
		System.out.println("\n give chipset 1 for nVidia or 2 for AMD");
		answer2 = in.nextInt();
		prod.setChipset(answer2);
		System.out.println("\n give memory size 2 , 4 , 6 ");
		answer2 = in.nextInt();
		prod.setMemory(answer2);
		System.out.println("\n" + prod.toString());
	}
	public static void createCPU(CPU prod){
		System.out.println("\nThe name is CPU");
		System.out.println("\n give creation year");
		answer2 = in.nextInt();
		prod.setYear(answer2);
		System.out.println("\nThe constructor is standard");
		System.out.println("\n give price");
		answer3 = in.nextDouble();
		prod.setPrice(answer3);
		System.out.println("\n give speed 2.7, 2.9, 3.3, 3.5, 4 GHz");
		answer3 = in.nextDouble();
		prod.setSpeed(answer3);
		System.out.println("\n give number of cores 1, 2, 4, 6, 8");
		answer2 = in.nextInt();
		prod.setCore_num(answer2);
		System.out.println("\n" + prod.toString());
	}
	public static void createHarddrive(Harddrive prod){
		System.out.println("\nThe name is HARDDRIVE");
		System.out.println("\n give creation year");
		answer2 = in.nextInt();
		prod.setYear(answer2);
		System.out.println("\nThe constructor is standard");
		System.out.println("\n give price");
		answer3 = in.nextDouble();
		prod.setPrice(answer3);
		System.out.println("\n give type 1 for HDD or 2 for SDD");
		answer2 = in.nextInt();
		prod.setType(answer2);
		System.out.println("\n give capacity 256, 320, 500, 750, 1000 GB");
		answer2 = in.nextInt();
		prod.setCapacity(answer2);
		System.out.println("\n give size 1.8, 2.5, 3.5 inches ");
		answer3 = in.nextDouble();
		prod.setSize(answer3);
		System.out.println("\n" + prod.toString());
	}
	public static  void createRAM(RAM prod){
		System.out.println("\nThe name is RAM");
		System.out.println("\n give creation year");
		answer2 = in.nextInt();
		prod.setYear(answer2);
		System.out.println("\nThe constructor is standard");
		System.out.println("\n give price");
		answer3 = in.nextDouble();
		prod.setPrice(answer3);
		System.out.println("\n give type 1 for DDR ,2 for DDR2, 3 for DDR3");
		answer2 = in.nextInt();
		prod.setType(answer2);
		System.out.println("\n give capacity 1, 2, 4, 8 GB");
		answer2 = in.nextInt();
		prod.setCapacity(answer2);
		System.out.println("\n give speed 800, 1600, 2000 MHz");
		answer2 = in.nextInt();
		prod.setSpeed(answer2);
		System.out.println("\n" + prod.toString());
	}
	public static void createKeyboard(Keyboard prod){
		System.out.println("\nThe name is KEYBOARD");
		System.out.println("\n give creation year");
		answer2 = in.nextInt();
		prod.setYear(answer2);
		System.out.println("\nThe constructor is standard");
		System.out.println("\n give price");
		answer3 = in.nextDouble();
		prod.setPrice(answer3);
		System.out.println("\n give connection type 1 for CABLE or 2 for WIRELESS");
		answer2 = in.nextInt();
		prod.setConnection(answer2);
		System.out.println("\n" + prod.toString());
	}
	public static void createMouse(Mouse prod){
		System.out.println("\nThe name is MOUSE");
		System.out.println("\n give creation year");
		answer2 = in.nextInt();
		prod.setYear(answer2);
		System.out.println("\nThe constructor is standard");
		System.out.println("\n give price");
		answer3 = in.nextDouble();
		prod.setPrice(answer3);
		System.out.println("\n give technology 1 for LASER or 1 for OPTICAL");
		answer2 = in.nextInt();
		prod.setTechnology(answer2);
		System.out.println("\n give connection type 1 for CABLE or 2 for WIRELESS");
		answer2 = in.nextInt();
		prod.setConnection(answer2);
		System.out.println("\n" + prod.toString());
	}
	public static void createPrinter(Printer prod){
		System.out.println("\nThe name is PRINTER");
		System.out.println("\n give creation year");
		answer2 = in.nextInt();
		prod.setYear(answer2);
		System.out.println("\nThe constructor is standard");
		System.out.println("\n give price");
		answer3 = in.nextDouble();
		prod.setPrice(answer3);
		System.out.println("\n give technology 1 for LASER or 2 for INKJET");
		answer2 = in.nextInt();
		prod.setTechnology(answer2);
		System.out.println("\n give type 1 for COLORED OR 2 for WHITEBLACK");
		answer2 = in.nextInt();
		prod.setType(answer2);
		System.out.println("\n" + prod.toString());
	}
	public static void createScreen(Screen prod){
		System.out.println("\nThe name is SCREEN");
		System.out.println("\n give creation year");
		answer2 = in.nextInt();
		prod.setYear(answer2);
		System.out.println("\nThe constructor is standard");
		System.out.println("\n give price");
		answer3 = in.nextDouble();
		prod.setPrice(answer3);
		System.out.println("\n give type LCD by pressing 1 or LED by pressing 2");
		answer2 = in.nextInt();
		prod.setType(answer2);
		System.out.println("\n give size in inches ");
		answer3 = in.nextDouble();
		prod.setSize(answer3);
		System.out.println("\n give gates 1. HDMI ,2. DVI,3. Composite ");
		answer2 = in.nextInt();
		prod.setGates(answer2);
		System.out.println("\n give analisys ");
		
		answer = scan.nextLine();
		prod.setAnalysis(answer);
		System.out.println("\n" + prod.toString());
	}
	
	
	
	public static boolean buy(Store bought){
		System.out.println("\n This item can be perchased from the stock . Would you like to buy it ? ");
		System.out.println("\nTo buy it please press 1 or if you want to return to the menu please press 2");
		answer2 = in.nextInt();
		if(answer2 == 1){
			ForSale fs = new ForSale("0","0","0");
			System.out.println("\n Give your name ");
			
			answer = scan.nextLine();
			fs.setName(answer);
			System.out.println("\n Give your number ");
			
			answer = scan.nextLine();
			fs.setPhone(answer);
			System.out.println("\n Give the date in form dd/mm/yyyy ");
			
			answer = scan.nextLine();
			fs.setSoldDate(answer);
			sp.addSale(bought , fs);
			System.out.println(sp.toString());
			return true;
		}else{
			return false;
		}
		
	}
	
	public static boolean order(Store o){
		System.out.println("\n This item does not exist in stock .Would you like to order it ?");
		System.out.println("\nTo buy it please press 1 or if you want to return to the menu please press 2");		
		
		answer2 = in.nextInt();
		if(answer2 == 1){
			Custom cm = new Custom("0","0","0","0","not complete");
			System.out.println("\n Give your name ");
			
			answer = scan.nextLine();
			cm.setName(answer);
			System.out.println("\n Give your number ");
			
			answer = scan.nextLine();
			cm.setPhone(answer);
			System.out.println("\n Give today's date in form dd/mm/yyyy ");
			
			answer = scan.nextLine();
			cm.setOrderDate(answer);
			System.out.println("\n Give the date it will be delivered in form dd/mm/yyyy");
			
			answer = scan.nextLine();
			cm.setDeliverDate(answer);
			cl.addOrder(o,cm);
			System.out.println(cm.toString());
			return true;
		}else{
			return false;
		}
	}
}