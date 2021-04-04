package TypewiseAlert;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SendAlert {

	public static void sendToController(BreachType breachType) {
		int header = 0xfeed;
		System.out.println(String.format("%d %s", header, breachType));
	}

	public static void sendToEmail(BreachType breachType) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String recepient = "a.b@c.com";
		BreachTypeSelector breachTypeSelector = new BreachTypeSelector();
		Class breachTypeClassSelector = breachTypeSelector.getClass();
		Method breachTypeClassMethodSelector;
	
			breachTypeClassMethodSelector = breachTypeClassSelector.getDeclaredMethod(breachType.toString(),
					String.class);
			breachTypeClassMethodSelector.invoke(breachTypeSelector, recepient);
		

	}

}
