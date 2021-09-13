package com.hammerfactory;

public class ClubHFactory implements HammerFactory<ClubHammer>{

	@Override
	public ClubHammer createhammer(String type) {
		// TODO Auto-generated method stub
		if ("Construction".equalsIgnoreCase(type)) {
            return new ClubHam();
	}
	
	return null;
	}
}

