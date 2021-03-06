package TypewiseAlert;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TypewiseAlert {
	public static int lowerLimit;
	public static int upperLimit;

	public static BreachType inferBreach(double value, double lowerLimit, double upperLimit) {
		if (value < lowerLimit) {
			return BreachType.TOO_LOW;
		}
		if (value > upperLimit) {
			return BreachType.TOO_HIGH;
		}
		return BreachType.NORMAL;
	}

	public static BreachType classifyTemperatureBreach(CoolingType coolingType, double temperatureInC)
			 {
		CoolingLimit coolingLimit = new CoolingLimit();
		Class coolingClassSelector = coolingLimit.getClass();
		Method coolingClassMethodSelector;
		try {
		coolingClassMethodSelector = coolingClassSelector.getDeclaredMethod(coolingType.toString(), null);
		coolingClassMethodSelector.invoke(coolingLimit);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		lowerLimit = coolingLimit.getLowerLimit();
		upperLimit = coolingLimit.getUpperLimit();

		return inferBreach(temperatureInC, lowerLimit, upperLimit);
	}

	public static void checkAndAlert(AlertType alertTarget, BatteryInfo batteryinfo, double temperatureInC)
			{
		BreachType breachType;

		breachType = classifyTemperatureBreach(batteryinfo.coolingType, temperatureInC);
		AlertTargetType alertTargetType = new AlertTargetType();
		Class alertTargetClass = alertTargetType.getClass();
		try {
		Method alertTargetMethod = alertTargetClass.getDeclaredMethod(alertTarget.toString(), BreachType.class);
		alertTargetMethod.invoke(alertTargetType, breachType);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
