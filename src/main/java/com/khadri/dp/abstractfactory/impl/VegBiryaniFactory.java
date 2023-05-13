package com.khadri.dp.abstractfactory.impl;

import com.khadri.dp.abstractfactory.FoodAbstractFactory;
import com.khadri.dp.child.VegBiryani;
import com.khadri.dp.parent.Food;

public class VegBiryaniFactory implements FoodAbstractFactory {

	@Override
	public Food createFoodInstance() {
		return new VegBiryani();
	}

}
