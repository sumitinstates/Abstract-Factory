package com.sumit;

public class CarFactoryProducer{

	 static CarFactory getCarType(String carType) {
		if(carType.equalsIgnoreCase("BMW")) 
		{
			return new BMWFactory();
		}else if(carType.equalsIgnoreCase("Mercedes")) 
		{
			return new MercedsFactory();
		}else if (carType.equalsIgnoreCase("tesla")) 
		{
			return new TeslaFactory();
		}
		return null;
	}

}
