/**Program: NFL Player Class
 * File: NFLPlayer.java
 * Summary: Abstract NFL Player Class, A class for the creation of NFL Players with two Subclasses, OffensivePlayer, and DefensivePlayer
 * Milestone 2 Assignment 
 * Week5 CST100
 * Date: July 24 2016
 * Author: Lee Tompkins 
 **/
public abstract class NFLPlayer {
	// Data Fields
	protected String name;
	protected String position;
	protected  int yearsPro;
	protected  int age;
	protected  int weight;
	protected  int height;
	

	// Methods
	
	public void  setName(String newName) {
		// Set Name 
		name = newName;
	}
	public void setYears(int newYearsPro){
		//Set years Pro
		yearsPro = newYearsPro;
	} 
	public void setPosition(String position) {
		//Set position
		this.position = position;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setHeight(int height){
		// set height 
		this.height = height;
	}
	public void setAge(int age){
		// set age 
		this.age = age;
	}
	public String getName(){
		// Get player name 
		return name;
	}
	public String getPosition(){
		// get position 
		return position;
	}
	public int getWeight(){
		// get weight 
		return weight;
	}
	public int getAge(){
		// Get player age 
		return age;
	}
	public int getHeight(){
		// get height 
		return height;
	}
	// Constructors 
	
	NFLPlayer() {
		
	}
	
	NFLPlayer(String name, String playerType, int yearsPro, int careerTD, int careerTackles, int careerYards, int careerAge) {
		
	}
}

class OffensivePlayer extends NFLPlayer {
	private int careerReceptions;
	private int careerYards;
	private int careerTouchdowns;
	//General No Args Constructor
	public OffensivePlayer(){
		
	}
	// Constructor with specified parameters 
	public OffensivePlayer(String name, String position, int height, int weight, int age, int yearsPro, int careerReceptions, int careerYards, int careerTouchdowns ){
		this.name = name;
		this.position = position;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.yearsPro = yearsPro;
		this.careerReceptions = careerReceptions;
		this.careerYards = careerYards;
		this.careerTouchdowns = careerTouchdowns;
	}
	 public int getCareerReceptions() {
		 // get receptions
		return careerReceptions;
	}
	public void setCareerReceptions(int careerReceptions) {
		// set receptions
		this.careerReceptions = careerReceptions;
	}
	public int getCareerYards() {
		// get yards
		return careerYards;
	}
	public void setCareerYards(int careerYards) {
		// set yards
		this.careerYards = careerYards;
	}
	public int getCareerTouchdowns() {
		// get touchdowns
		return careerTouchdowns;
	}
	public void setCareerTouchdowns(int careerTouchdowns) {
		// set touchdowns
		this.careerTouchdowns = careerTouchdowns;
	}
	public double getAverageTouchdowns(){
	        // Get Average touchdowns per year
	        return (careerTouchdowns / yearsPro);
	 }
	 public double getAverageYards(){
	        // Returns average yards per year 
	        return (careerYards / yearsPro);
	 }
	 public double getAverageReceptions(){
		 //get average receptions per year
		return (careerReceptions / yearsPro);
	 }
}

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
