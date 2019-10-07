package src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	


	public static void main(String[] args) throws IOException {
		
		run();
		
//Lista Platos
		
//Lista con 10 ingredientes	
		Ingredient ingredient1 = new Ingredient("Lechuga",1,1);
		Ingredient ingredient2 = new Ingredient("Tomate",2,2);
		Ingredient ingredient3 = new Ingredient("Jamon",3,3);
		Ingredient ingredient4 = new Ingredient("Pollo",4,4);
		Ingredient ingredient5 = new Ingredient("Carne",5,5);
		Ingredient ingredient6 = new Ingredient("Pavo",6,6);
		Ingredient ingredient7 = new Ingredient("Fresa",7,7);
		Ingredient ingredient8 = new Ingredient("Mango",8,8);
		Ingredient ingredient9 = new Ingredient("Lulo",9,9);
		Ingredient ingredient10 = new Ingredient("Leche",10,10);
		
		
		
		ArrayList Inventory = new ArrayList();
		Inventory.add(ingredient1);
		Inventory.add(ingredient2);
		Inventory.add(ingredient3);
		Inventory.add(ingredient4);
		Inventory.add(ingredient5);
		Inventory.add(ingredient6);
		Inventory.add(ingredient7);
		Inventory.add(ingredient8);
		Inventory.add(ingredient9);
		Inventory.add(1,ingredient10);
		Inventory.add(ingredient10);
		
		
		/*for (Iterator it = Inventory.iterator();it.hasNext();) {
			Ingredient x =(Ingredient)it.next();
			System.out.println(x.getname() + ":"+x.getprice()+":"+x.getamount());
	}*/
		
		
//MENU		
	char exit = '7'; char option = (char)System.in.read();
	
	
	while(option != exit) {
		switch (option) {
		case '1':
		System.out.println("1 Print my current money amount");
		break;
		case '2':
			for (Iterator it = Inventory.iterator();it.hasNext();) {
				Ingredient x =(Ingredient)it.next();
				System.out.println(x.getname() + ":"+x.getprice()+":"+x.getamount());
			}
			//System.out.println("2 Print my current ingredient inventory");
			break;
		case '3':
			//System.out.println("3 Buy some amount of any ingredient");
			System.out.println("What ingredient do you want to buy?");
			subMenuIng();	
			
			//Scanner scan = new Scanner(System.in);
			//String seleccion = scan.nextLine();
			
			//char amountIng = (char)System.in.read();
			
			
			//switch(amountIng) {
			//if(amountIng=='a') {
				//System.out.println("2 Tomate");
				//System.out.println("3 Jamón");
				//System.out.println("4 Pollo");
				//System.out.println("5 Fresa");
				//System.out.println("6 Mango");
			//}
			//amountIng = (char) System.in.read();
			break;
		case '4':
			System.out.println("4 Print my dishes inventory");
			break;
		case '5':
			System.out.println("5 Make a dish (reducing the ingredients inventory");
			break;
		case '6':
			System.out.println("6 Sell a dish");
			break;
	}
		option = (char) System.in.read();
		
		
	}	
		
		
	}
			public static void run() {
			System.out.println("MENÚ");
			System.out.println("1 Print my current money amount");
			System.out.println("2 Print my current ingredient inventory");
			System.out.println("3 Buy some amount of any ingredient");
			System.out.println("4 Print my dishes inventory");
			System.out.println("5 Make a dish (reducing the ingredients inventory");
			System.out.println("6 Sell a dish");
			System.out.println("7 Exit");
		
		
		}
			public static void subMenuIng() {
				
				System.out.println("a Lechuga");
				System.out.println("b Tomate");
				System.out.println("c Jamón");
				System.out.println("d Pollo");
				System.out.println("e Fresa");
				System.out.println("f Mango");
				
				

				
			}
			
			
			
		public static void initialize() {
				double mymoney=100000;
				initializeInventory();
				createDishes();
			}
			
			public static void initializeInventory() {
				
			}
			
			public static void createDishes() {
				
			}
				
			

}
		
	
	

