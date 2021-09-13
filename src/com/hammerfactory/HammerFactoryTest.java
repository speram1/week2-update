package com.hammerfactory;

public class HammerFactoryTest {
	public static void main(String[] args) {   
		
		HammerFactory factory;
		
		factory = HammarFactoryBuilder.getFactory("ballpeen");
		factory.createhammer("ballpeen");
		
		factory = HammarFactoryBuilder.getFactory("club");
		factory.createhammer("club");
		
		factory = HammarFactoryBuilder.getFactory("claw");
		factory.createhammer("claw");
		
		HammarFactoryBuilder.manufacture();
	 }    

}
