package com.BAE.abstraction;

public abstract class Animal {


	
	public abstract void noise();
	public abstract void type();
	
	public static void breathes() {
		System.out.println("breathes oxygen.");
	}
	
	public static void hasDigestiveSystem() {
		System.out.println("This animal has a digestive system.");
	}
}
