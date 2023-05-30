package com.shreya.food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodDB {
	Connection conn = null;
	
	public FoodDB(){
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/foodhealthdb", "postgres", "shre");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void save(Food f) {
		String query = "insert into food (name, carbohydrates, proteins, fats, calories, dietaryFibre) values (?,?,?,?,?,?)"; 
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, f.getName());
			st.setDouble(2, f.getCarbohydrates());
			st.setDouble(3, f.getProteins());
			st.setDouble(4, f.getFats());
			st.setDouble(5, f.getcalories());
			st.setDouble(6, f.getDietaryFibre());
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public List<Food> getAll() {
		List<Food> foods= new ArrayList<>();
		String query = "select name, carbohydrates, proteins, fats, calories, dietaryFibre from food"; 
		try {
			PreparedStatement st = conn.prepareStatement(query); 
			ResultSet rs = st.executeQuery(); 
			while(rs.next()){
					Food f = new Food();
					f.setName(rs.getString(1)); 
					f.setCarbohydrates(rs.getDouble(2)); 
					f.setProteins(rs.getDouble(3));  
					f.setFats(rs.getDouble(4));
					f.setcalories(rs.getDouble(5));
					f.setDietaryFibre(rs.getDouble(6)); 
					foods.add(f);
		}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return foods;
	}
}
