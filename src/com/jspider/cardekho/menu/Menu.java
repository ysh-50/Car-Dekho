package com.jspider.cardekho.menu;

import java.util.Scanner;

import com.jspider.cardekho.oprtn.oprn;

public class Menu {
	   public static void main(String []args) {
		menu();
	   }
	
	   public static void menu() {
	   System.out.println("====MENU======\n"
		+"1.Add cars \n"
		+"2.View all cars \n" 
		+"3.Search Cars \n"
		+"4.Edit Car \n"
		+"5.Remove car \n"
		+"6.Exit" ); 
		
		oprn oprn=new oprn();
		Scanner sc =new Scanner(System.in);
		while(true) {
		int n=sc.nextInt();
		
		
		
	   
		switch (n) {
		case 1:oprn.addCar();
			break;
			
		case 2:oprn.viewCar();
			break;
			
		case 3:  System.out.println("----SEARCH MENU---- \n"+"1.Search by ID\n"+"2.Search by Name \n"+"3.Search by Price \n"+"4.Go Back");
			     int m=sc.nextInt();
			     switch(m) {
			     case 1:oprn.searchById();
			    	 break;
			     case 2:oprn.searchByName();
			    	 break;
			     case 3:oprn.searchByPrice();
			    	 break;
			     case 4: menu();
			    	 break;
			    default: System.out.println("Please Valid Number!");
			    	break;
			     }
		    break;
			
		case 4: oprn.editCar();
			break;
			
		case 5: oprn.removeCar();
			break;
			
		case 6: System.out.println("Thank You...");
		
			break;
			
		default:
			System.out.println("Invalid Input! Please try again");
			
			break;
		}
	    }
	   }
	   
	    
	}



	
	
	


