package TypewiseAlert;

import java.lang.reflect.InvocationTargetException;

import TypewiseAlert.BreachType;

public class AlertTargetType {

	public void TO_CONTROLLER(BreachType breachType) {
		SendAlert.sendToController(breachType);
	}
	
	public void TO_EMAIL(BreachType breachType) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		SendAlert.sendToEmail(breachType);
	}
	
}
