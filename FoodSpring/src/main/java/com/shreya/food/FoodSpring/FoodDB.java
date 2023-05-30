package com.shreya.food.FoodSpring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FoodDB extends JpaRepository<Food, Integer> {
	
	
}
