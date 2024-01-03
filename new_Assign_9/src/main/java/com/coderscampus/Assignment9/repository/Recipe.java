package com.coderscampus.Assignment9.repository;
public class Recipe {

	private Boolean dairyFree;
	private Boolean glutenFree;
	private Boolean vegan;
	private Boolean vegetarian;
	private String title;
	private Double spoonacularScore;
	private Integer servings;
	private Double pricePerServing;
	private Double preparationMinutes;
	private Integer cookingMinutes;
	private Integer readyInMinutes;
	private String instructions;
	
	
	public Boolean getDairyFree() {
		return dairyFree;
	}
	public void setDairyFree(Boolean dairyFree) {
		this.dairyFree = dairyFree;
	}
	public Boolean getGlutenFree() {
		return glutenFree;
	}
	public void setGlutenFree(Boolean glutenFree) {
		this.glutenFree = glutenFree;
	}
	public Boolean getVegan() {
		return vegan;
	}
	public void setVegan(Boolean vegan) {
		this.vegan = vegan;
	}
	public Boolean getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(Boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getSpoonacularScore() {
		return spoonacularScore;
	}
	public void setSpoonacularScore(Double spoonacularScore) {
		this.spoonacularScore = spoonacularScore;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public Double getPricePerServing() {
		return pricePerServing;
	}
	public void setPricePerServing(Double pricePerServing) {
		this.pricePerServing = pricePerServing;
	}
	public Double getPreparationMinutes() {
		return preparationMinutes;
	}
	public void setPreparationMinutes(Double preparationMinutes) {
		this.preparationMinutes = preparationMinutes;
	}
	public Integer getCookingMinutes() {
		return cookingMinutes;
	}
	public void setCookingMinutes(Integer cookingMinutes) {
		this.cookingMinutes = cookingMinutes;
	}
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	@Override
	public String toString() {
		return "Recipe [dairyFree=" + dairyFree + ", glutenFree=" + glutenFree + ", vegan=" + vegan + ", vegetarian="
				+ vegetarian + ", title=" + title + ", spoonacularScore=" + spoonacularScore + ", servings=" + servings
				+ ", pricePerServing=" + pricePerServing + ", preparationMinutes=" + preparationMinutes
				+ ", cookingMinutes=" + cookingMinutes + ", readyInMinutes=" + readyInMinutes + ", instructions="
				+ instructions + "]";
	}
	
	public Recipe(String title, Double spoonacularScore, Integer servings, Double pricePerServing,
			  Double preparationMinutes, Integer cookingMinutes, Integer readyInMinutes, String instructions) {
	super();
	this.title = title;
	this.spoonacularScore = spoonacularScore;
	this.servings = servings;
	this.pricePerServing = pricePerServing;
	this.preparationMinutes = preparationMinutes;
	this.cookingMinutes = cookingMinutes;
	this.readyInMinutes = readyInMinutes;
	this.instructions = instructions;
}
	}
