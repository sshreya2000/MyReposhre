package com.shreya.food.FoodSpring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class FoodSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(FoodSpringApplication.class, args);
		
		FoodService service=context.getBean(FoodService.class);
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
