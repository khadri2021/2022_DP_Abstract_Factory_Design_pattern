package com.khadri.dp.abstractfactory.impl;

import com.khadri.dp.abstractfactory.FoodAbstractFactory;
import com.khadri.dp.child.NonVegBiryani;
import com.khadri.dp.parent.Food;

public class NonVegBiryaniFactory implements FoodAbstractFactory {

	@Override
	public Food createFoodInstance() {
		return new NonVegBiryani();
	}

}
