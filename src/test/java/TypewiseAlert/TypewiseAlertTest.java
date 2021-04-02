package TypewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TypewiseAlertTest 
{
   @Test
    public void checkBateeryLimits()
    {
      assertTrue(TypewiseAlert.inferBreach(12, 20, 30) ==BreachType.TOO_LOW);
      assertTrue(TypewiseAlert.inferBreach(42, 20, 30) ==BreachType.TOO_HIGH);
      assertTrue(TypewiseAlert.inferBreach(27, 20, 30) ==BreachType.NORMAL);
    }
	
	@Test
    public void checkCoolingTypeAndAlert()
    {
        BatteryCharacter batteryCharacter = new BatteryCharacter(CoolingType.PASSIVE_COOLING,"Power Shell Battery");
		TypewiseAlert.checkAndAlert(AlertTarget.TO_Email,batteryCharacter , 36);
    }
	@Test
    public void categorizeTemperatureBreachBasedCooling()
    {
        assertTrue((TypewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING,45) == BreachType.TOO_HIGH));
    }
}
