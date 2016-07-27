/**Program: DefensivePlayer Class
 * File: DefensivePlayer.java
 * Summary: A class for the creation of Defensive NFL players, this class is a subclass of NFLPlayer 
 * Milestone 6 Assignment 
 * Week5 CST100
 * Author: Lee Tompkins
 * Date: July 24 2016
 **/





class DefensivePlayer extends NFLPlayer {
	private int careerTackles;
	private int careerSacks;
	private int careerInterceptions;
	
	public DefensivePlayer(){
		
	}
	// Constructor with specified parameters 
	public DefensivePlayer(String name, String position, int height, int weight, int age, int yearsPro, int careerTackles, int careerSacks, int careerInterceptions ){
		this.name = name;
		this.position = position;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.yearsPro = yearsPro;
		this.careerTackles = careerTackles;
		this.careerSacks = careerSacks;
		this.careerInterceptions = careerInterceptions;
	}
	public int getCareerTackles() {
		// get tackles
		return careerTackles;
	}
	public void setCareerTackles(int careerTackles) {
		// set tackles
		this.careerTackles = careerTackles;
	}
	public int getCareerSacks() {
		// get sacks
		return careerSacks;
	}
	public void setCareerSacks(int careerSacks) {
		// set sacks
		this.careerSacks = careerSacks;
	}
	public int getCareerInterceptions() {
		// get interceptions
		return careerInterceptions;
	}
	public void setCareerInterceptions(int careerInterceptions) {
		// set interceptions
		this.careerInterceptions = careerInterceptions;
	}
	public double getAverageTackles() {
        // Returns average tackles per year
        return (careerTackles / yearsPro);
    }
	public double getAverageSacks(){
		// get average sacks per year
		return(careerSacks / yearsPro);
	}
	public double getAverageInterceptions(){
		// get average interactions per year
		return(careerInterceptions / yearsPro);
	}
}
