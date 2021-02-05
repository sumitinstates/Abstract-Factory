package com.sumit;

public class TeslaFactory extends CarFactory {

	@Override
	CAR getCarType(String carType) 
	{
		if(carType.equalsIgnoreCase("Tesla")) 
		{
			return new Tesla();
		}
		return null;
	}

}
