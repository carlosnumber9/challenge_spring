package com.novaquality.challenge.persistence.model;



public class Card {

	/** Nombre de la carta */
	private String name;

	/** Breve descripción de la carta */
	private String description;

	/** Rareza */
	private Rareness rareness;

	/** Categoría */
	private Category category;

	/** Coste de maná */
	private int cost;

	/** Poder de ataque */
	private int power;

	/** Puntuación de la carta */
	private int score;

	public Card() {
	}

	public Card(String name, String description, Rareness rareness, Category category, int cost, int power) {
		this.name = name;
		this.description = description;
		this.rareness = rareness;
		this.category = category;
		this.cost = cost;
		this.power = power;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the rareness
	 */
	public Rareness getRareness() {
		return rareness;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @return the power
	 */
	public int getPower() {
		return power;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
}
