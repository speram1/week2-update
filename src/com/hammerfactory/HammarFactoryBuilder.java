package com.hammerfactory;

public class HammarFactoryBuilder {

	private static BallpeenHammer bh = new BallpeenHam();
	private static ClawHammer clawh= new ClawHam();
	private static ClubHammer clubh= new ClubHam();

    
	protected static HammerFactory getFactory(String type)
	{
		if(type.equals("ballpeen"))
		{
			return new BallpeenHFactory();
		}
		else if(type.equals("club"))
		{
			return new ClubHFactory();
		}
		else if(type.equals("claw"))
		{
			return new ClawHFactory();
		}
		return null;
	}
	
	public static void manufacture()
	{
		bh.create();
		bh.hit();
		
		clawh.create();
		clawh.hit();
		
		clubh.create();
		clubh.hit();
	}
}
