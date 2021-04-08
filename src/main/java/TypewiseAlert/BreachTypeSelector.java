package TypewiseAlert;

public class BreachTypeSelector {

	public void TOO_LOW(String recepient) {
        System.out.println("To: %s\n", recepient);
        System.out.println("Hi, Battery Temperature is too low\n");
	}
	
	public void TOO_HIGH(String recepient) {
        System.out.println("To: %s\n", recepient);
        System.out.println("Hi, Battery the temperature is too high\n");
	}
	
	public void NORMAL(String recepient) {
        System.out.println("To: %s\n", recepient);
        System.out.println("Hi, Battery the temperature is normal\n");
	}
}
