package com.shreya.food.FoodSpring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Food {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private double carbohydrates;
	private double proteins;
	private double fats;
	private double calories;
	private double dietaryfibre;
	
	public Food() {}
	
	public Food(String name, double carbohydrates, double proteins, double fats, double calories, double dietaryfibre) {
		super();
		this.name = name;
		this.carbohydrates = carbohydrates;
		this.proteins = proteins;
		this.fats = fats;
		this.calories = calories;
		this.dietaryfibre = dietaryfibre;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public double getProteins() {
		return proteins;
	}

	public void setProteins(double proteins) {
		this.proteins = proteins;
	}

	public double getFats() {
		return fats;
	}

	public void setFats(double fats) {
		this.fats = fats;
	}

	public double getcalories() {
		return calories;
	}

	public void setcalories(double calories) {
		this.calories = calories;
	}

	public double getDietaryFibre() {
		return dietaryfibre;
	}

	public void setDietaryFibre(double dietaryfibre) {
		this.dietaryfibre = dietaryfibre;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", carbohydrates=" + carbohydrates + ", proteins=" + proteins + ", fats=" + fats
				+ ", calories=" + calories + ", dietaryFibre=" + dietaryfibre + "]";
	}
	
	
	
}
