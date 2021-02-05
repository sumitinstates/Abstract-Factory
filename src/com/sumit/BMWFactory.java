package com.sumit;

public class BMWFactory extends CarFactory
{

	@Override
	CAR getCarType(String carType) {
		if(carType.equalsIgnoreCase("BMW")) 
		{
			return new BMW();
		}
		return null;
	}

}
