package com.codingdojo.java.zoo2;

public class Bat extends Mammal {

	
	public void fly() {
		energyLevel -= 50; 
		System.out.println("sound a bat taking off");
		displayEnergy();
	}
	
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("so- well");
		displayEnergy();
	}
	
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("town on fire");
		displayEnergy();
	}
}
