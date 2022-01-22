package com.sportyshoes;

public enum Category {
	SPORTS,FORMAL,KIDS; 
	public static Category getCategory(String categoryString) {
    	return Category.valueOf(categoryString);
}
}