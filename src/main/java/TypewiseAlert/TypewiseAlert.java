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
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		CoolingLimit coolingLimit = new CoolingLimit();
		Class coolingClassSelector = coolingLimit.getClass();
		Method coolingClassMethodSelector;
		coolingClassMethodSelector = coolingClassSelector.getDeclaredMethod(coolingType.toString(), null);
		coolingClassMethodSelector.invoke(coolingLimit);

		lowerLimit = coolingLimit.getLowerLimit();
		upperLimit = coolingLimit.getUpperLimit();

		return inferBreach(temperatureInC, lowerLimit, upperLimit);
	}

	public static void checkAndAlert(AlertType alertTarget, BatteryInfo batteryChar, double temperatureInC)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		BreachType breachType;

		breachType = classifyTemperatureBreach(batteryChar.coolingType, temperatureInC);
		AlertTargetType alertTargetType = new AlertTargetType();
		Class alertTargetClass = alertTargetType.getClass();
		Method alertTargetMethod = alertTargetClass.getDeclaredMethod(alertTarget.toString(), BreachType.class);
		alertTargetMethod.invoke(alertTargetType, breachType);

	}

}
