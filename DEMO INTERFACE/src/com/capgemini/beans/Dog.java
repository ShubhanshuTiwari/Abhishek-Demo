package com.capgemini.beans;
public class Dog extends Canine implements Pet{
 @Override
public void eat() {
	// TODO Auto-generated method stub
	 System.out.println("I eat Bones");
}
 @Override
	public void sleep() {
		// TODO Auto-generated method stub
	 System.out.println("I do not sleep");
	}
 
 public void bark() {
	 System.out.println("BHOW-BHOW");
 }
@Override
public void beFriendly() {
	// TODO Auto-generated method stub
	System.out.println("Always happy");
}
@Override
public void play() {
	// TODO Auto-generated method stub
	System.out.println("Dog can play multiple games");
	
}
}
