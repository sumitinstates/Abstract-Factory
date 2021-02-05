package com.sumit;

public class APP {
	public static void main(String[] args) {
		CarFactory bmwCarFactoryType = CarFactoryProducer.getCarType("BMW");
		CAR bmwCarType = bmwCarFactoryType.getCarType("BMW");
		bmwCarType.make();
		
		CarFactory mercedesCarFactoryType = CarFactoryProducer.getCarType("Mercedes");
		CAR carType = mercedesCarFactoryType.getCarType("Mercedes");
		carType.make();
		
		CarFactory teslaCarFactoryType = CarFactoryProducer.getCarType("Tesla");
		CAR carType2 = teslaCarFactoryType.getCarType("Tesla");
		carType2.make();
	}

}
