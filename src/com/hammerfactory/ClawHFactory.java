package com.hammerfactory;

public class ClawHFactory implements HammerFactory<ClawHammer>{

	@Override
	public ClawHammer createhammer(String type) {
		// TODO Auto-generated method stub
		if ("Claw".equalsIgnoreCase(type)) {
            return new ClawHam();
	}
	
	return null;
	}
}
