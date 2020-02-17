package jc01_2020.lesson08.examples.scope.car.audi;

import jc01_2020.lesson08.examples.scope.car.Car;

public class AudiWithExtends extends Car {
	int protectedField = Car.protectedField;
	//    int packagePrivateField = Car.packagePrivateField;
	String publicField = Car.publicField;
}
