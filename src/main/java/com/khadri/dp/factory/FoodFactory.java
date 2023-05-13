package com.khadri.dp.factory;

import com.khadri.dp.abstractfactory.FoodAbstractFactory;
import com.khadri.dp.parent.Food;

public class FoodFactory {
	public static Food getFood(FoodAbstractFactory foodAbstractFactory) {
		return foodAbstractFactory.createFoodInstance();
	}
}
