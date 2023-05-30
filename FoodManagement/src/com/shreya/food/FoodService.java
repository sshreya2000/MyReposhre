package com.shreya.food;

import java.util.ArrayList;
import java.util.List;

public class FoodService {
	List<Food> foods= new ArrayList<>();
	FoodDB db=new FoodDB();
	public void addFood(Food f) {
	db.save(f);
	}
	public List<Food> getAllFoods(){
		return db.getAll();
	}
	
	public Food getFood(String name) {
		for (Food f:db.getAll()) {
			if(f.getName().equals(name))return f;
		}
		return null;
	}
	
	public List<Food> getcalorie(double d, double e) {
		List<Food> calfood= new ArrayList<>();
		for (Food q:db.getAll()) {
			if(q.getcalories()>=d && q.getcalories()<=e)calfood.add(q);
		}
		return calfood;
		
	}

}
