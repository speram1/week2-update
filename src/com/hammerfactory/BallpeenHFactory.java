package com.hammerfactory;

public class BallpeenHFactory implements HammerFactory<BallpeenHammer>{

	@Override
	public BallpeenHammer createhammer(String type) {
		// TODO Auto-generated method stub
		if ("Ballpeen".equalsIgnoreCase(type)) {
            return new BallpeenHam();
	}
	
	return null;
	}
}
