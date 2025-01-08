package com.ag.main;

import com.ag.comp.Car;
import com.ag.factory.Factorypattern;
// main class hai bhai
public class FactorypatternTest {

	public static void main(String[] args)
	{
		Car car1 = Factorypattern.orderCar("standard");
		car1.car();
		System.out.println("================================");
		
		Car car2 = Factorypattern.orderCar("offroad");
		car2.car();
		System.out.println("================================");
		
		Car car3 = Factorypattern.orderCar("luxory");
		car3.car();
		System.out.println("================================");
		
		Car car4 = Factorypattern.orderCar("electric");
		car4.car();
		
		
		

	}

}
