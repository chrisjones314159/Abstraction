package com.BAE.abstraction;

public class Runner {

	public static void main(String[] args) {
		
		HouseCat cat1 = new HouseCat();
		Parrot parrot1 = new Parrot();
		
		cat1.type();
		cat1.noise();
		cat1.breathes();
		cat1.hasDigestiveSystem();
		
		System.out.println("====================================================");
		
		parrot1.type();
		parrot1.noise();
		parrot1.breathes();
		parrot1.hasDigestiveSystem();
	}
	
}
