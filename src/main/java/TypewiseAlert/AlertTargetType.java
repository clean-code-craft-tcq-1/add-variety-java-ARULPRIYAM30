package TypewiseAlert;

import java.lang.reflect.InvocationTargetException;

import TypewiseAlert.BreachType;

public class AlertTargetType {

	public void TO_CONTROLLER(BreachType breachType) {
		SendAlert.sendToController(breachType);
	}
	
	public void TO_EMAIL(BreachType breachType){
		try {
		SendAlert.sendToEmail(breachType);
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
}
