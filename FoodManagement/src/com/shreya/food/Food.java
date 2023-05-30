package com.shreya.food;

public class Food {
	private String name;
	private double carbohydrates;
	private double proteins;
	private double fats;
	private double calories;
	private double dietaryFibre;
	
	public Food() {}
	
	public Food(String name, double carbohydrates, double proteins, double fats, double calories, double dietaryFibre) {
		super();
		this.name = name;
		this.carbohydrates = carbohydrates;
		this.proteins = proteins;
		this.fats = fats;
		this.calories = calories;
		this.dietaryFibre = dietaryFibre;
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
		return dietaryFibre;
	}

	public void setDietaryFibre(double dietaryFibre) {
		this.dietaryFibre = dietaryFibre;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", carbohydrates=" + carbohydrates + ", proteins=" + proteins + ", fats=" + fats
				+ ", calories=" + calories + ", dietaryFibre=" + dietaryFibre + "]";
	}
	
	
	
}
