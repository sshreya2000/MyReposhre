package com.shreya.food;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		FoodService service= new FoodService();
//		service.addFood(new Food("idli",0.052,1.6,0.4,58.0,12.0));
//		service.addFood(new Food("sprouts",9.0,3.4,0.3,43.0,3.8));
//		service.addFood(new Food("upma",21.0,3.5,4.0,155.0,2.0));
//		service.addFood(new Food("chapati",18.0,3.1,3.7,40.0,3.9));
//		service.addFood(new Food("dosa",29.0,3.9,3.7,97.0,0.9));
//		service.addFood(new Food("roti",18.0,3.1,3.7,40.0,3.9));
//		service.addFood(new Food("sabji",7.0,12.0,6.0,130.0,2.0));
//		service.addFood(new Food("chutney",1.7,0.9,1.4,17.0,0.5));
//		service.addFood(new Food("rice",44.5,4.25,0.4,205.0,0.6));
//		service.addFood(new Food("sambar",25.5,11.1,1.2,152.0,13.5));
		
		List<Food> foods= service.getAllFoods();
		for(Food f:foods) {
			System.out.println(f);
		}
		
		System.out.println("************************************************");
		System.out.println("A particular product");
		Food f=service.getFood("idli");
		System.out.println(f);
		
		System.out.println("************************************************");
		System.out.println("calorie list for a range");
		List<Food> fc=service.getcalorie(3.0,76.0);
		for(Food cal:fc) {
			System.out.println(cal);
		}
	}

}
