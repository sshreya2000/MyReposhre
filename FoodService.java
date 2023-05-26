package com.shreya.food;

import java.util.ArrayList;
import java.util.List;

public class FoodService {
	List<Food> foods= new ArrayList<>();
	public void addFood(Food f) {
	foods.add(f);
	}
	public List<Food> getAllFoods(){
		return foods;
	}
	
	public Food getFood(String name) {
		for (Food f:foods) {
			if(f.getName().equals(name))return f;
		}
		return null;
	}
	
	public List<Food> getcalorie(double d, double e) {
		List<Food> calfood= new ArrayList<>();
		for (Food q:foods) {
			if(q.getcalories()>=d && q.getcalories()<=e)calfood.add(q);
		}
		return calfood;
		
	}

}
