package com.jspider.cardekho.oprtn;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.cardekho.entity.Car;
//import com.jspider.cardekho.menu.Menu;

public class oprn {
	
		    ArrayList<Car> cars=new ArrayList<>();
	     	Car car=new Car();
	     	Scanner sc=new Scanner(System.in);
	     
	     	//1.ADD CAR 
		    public void addCar() {
			System.out.println("How many cars you want to add?");
			
			int choice=sc.nextInt();
			for(int i=1;i<=choice; i++) {
				
			
			System.out.println("Enter Car details--");
			System.out.println("Enter car id-");
			int id=sc.nextInt();
			System.out.println("Enter car name");
			String name=sc.next();
			System.out.println("Enter car model");
			String model=sc.next();
			System.out.println("Enter car brand");
			String brand=sc.next();
			System.out.println("Enter car price");
			double price=sc.nextDouble();
			System.out.println("Enter car color");
			String color=sc.next();
			System.out.println("Enter car fuel type");
			String fueltype=sc.next();
			
			Car car=new Car();
			car.setId(id);
			car.setName(name);
			car.setModel(model);
			car.setBrand(brand);
			car.setPrice(price);
			car.setColor(color);
			car.setFuelType(fueltype);
			cars.add(car);
			}
			
		   }
	     	
	     	//2.VIEW CARS
            public void viewCar() {
			System.out.println("view");
			 for (Car car : cars) {
				System.out.println(car);
			 }
			 cars.get(0);
		    }
            
            
            //3.SEARCH
            //3.1SEARCH CARS BY ID
            public  void searchById() {
            System.out.println("Enter Car-Id");
            int sid=sc.nextInt();
               	
             for (Car car : cars) {
               if (sid == car.getId()) {
                       System.out.println(car); 
            	   
               }
             }
            } 
            
            //3.2SEARCH CAR BY NAME
            public  void searchByName() {
            System.out.println("Enter Car-Name");
            String sname=sc.next();
                   	
             for (Car car : cars) {
               if (sname.equals(car.getName())) {
                           System.out.println(car); 
               }
             }
            }
            
           //3.3SEARCH CAR BY PRICE
           public  void searchByPrice() {
           System.out.println("Enter Car Min Price");
           System.out.println("Enter Car Max Price");
           Double spriceMin=sc.nextDouble();
           Double spriceMax=sc.nextDouble();
           
           for (Car car : cars) {
        	  if(car.getPrice()>spriceMin && car.getPrice()<spriceMax) {
        	   System.out.println(car);
             }
           }
           }
                   	
            
            

		    
           //4.EDIT CAR
		    public void editCar() {
		    System.out.println("ALL view ");
			  for (Car car : cars) {
			    System.out.println(car);
			  }
			cars.get(0);
			System.out.println("Enter id to edit the car info");
			int eid=sc.nextInt();
			
			//matched?
			for (Car car : cars) {
	           if (eid == car.getId()) {
	                System.out.println(car); 
	           }
			}
	            	   
	          
			//edit
			System.out.println("Enter car Id");
			int ecid=sc.nextInt();
			System.out.println("Enter car Name");
			String ecname=sc.next();
			System.out.println("Enter car Model");
			String ecmodel=sc.next();
			System.out.println("Enter car Brand");
			String ecbrand=sc.next();
			System.out.println("Enter car Price");
			double ecprice=sc.nextDouble();
			System.out.println("Enter car Color");
			String eccolor=sc.next();
			System.out.println("Enter car Fuel type");
			String ecfuel=sc.next();
			
			
			//Car car=new Car();
		
			car.setId(ecid);
			car.setName(ecname);
			car.setModel(ecmodel);
			car.setBrand(ecbrand);
			car.setPrice(ecprice);
			car.setColor(eccolor);
			car.setFuelType(ecfuel);
			//cars.add(car);
	         
			
			for (Car car1 : cars) {
				System.out.println(car);
			}
		   }
		    
		    
		    //5.REMOVE CAR
		    public void removeCar() {
		    	for (Car car : cars) {
					System.out.println(car);
				}
				
				System.out.println("Enter car id to remove the car");
				int choicee=sc.nextInt();
				
				//#new
				for (int i = 0; i < cars.size(); i++) {
			        Car car = cars.get(i);
			        
				  if(choicee==car.getId()){
					cars.remove(i); 
				  }
				}
				
				//re-print updated list
				for (Car car : cars) {
						System.out.println("Car removed !!!");
				}
			
			}
		    
		    
		    
		    
		    
			
			
			
			
		    	
		    
	   
			
		
	
	}

	
	
