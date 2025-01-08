package com.ag.factory;

import com.ag.comp.Car;
import com.ag.comp.ElectricCar;
import com.ag.comp.LuxoryCar;
import com.ag.comp.OffroadCar;
import com.ag.comp.StandardCar;

public class Factorypattern 
{
	public static Car orderCar(String type)
	{
		Car car = null;
		
		if(type.equalsIgnoreCase("standard"))
			car = new StandardCar();
		else if(type.equalsIgnoreCase("offroad"))
			car = new OffroadCar();
		else if(type.equalsIgnoreCase("luxory"))
			car = new LuxoryCar();
		else if(type.equalsIgnoreCase("electric"))
			car = new ElectricCar();
		else
			throw new IllegalArgumentException("Invalid car type...");
		
		return car;
	}

}
