package com.capgemini.beans;

public class Cat extends Feline implements Pet {

//	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		System.out.println("I'm friendly");
	}
	
//	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("You can play with me");
	}
	
	
	
	/*public void roam(){
		System.out.println("It roams alone");
	}*/
	
	@Override
	public void eat() {
		System.out.println("I drink milk");
	}
	
	@Override
	public void sleep() {
		System.out.println("I sleep in litter box");
	}
	
	public void meow(){
		System.out.println("It meows");
	}
	
	
	
	

}
