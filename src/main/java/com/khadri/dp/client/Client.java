package com.khadri.dp.client;

import com.khadri.dp.abstractfactory.impl.NonVegBiryaniFactory;
import com.khadri.dp.factory.FoodFactory;
import com.khadri.dp.parent.Food;

public class Client {
	public static void main(String[] args) {
		Food food = FoodFactory.getFood(new NonVegBiryaniFactory());
		System.out.println(food.prepareFood());
	}
}
