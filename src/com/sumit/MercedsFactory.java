package com.sumit;

public class MercedsFactory extends CarFactory {

	@Override
	CAR getCarType(String carType) {
		if(carType.equalsIgnoreCase("Mercedes")) 
		{
			return new Mercedes();
		}
		return null;
	}
	
	

}
