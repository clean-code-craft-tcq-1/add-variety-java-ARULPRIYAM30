package TypewiseAlert;

import java.lang.reflect.InvocationTargetException;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class TypewiseAlertTest {
    @Test
    public void infersBreachAsPerLimits()
    {
		assertTrue(TypewiseAlert.inferBreach(12, 20, 30) == BreachType.TOO_LOW);
		assertTrue(TypewiseAlert.inferBreach(42, 20, 30) == BreachType.TOO_HIGH);
		assertTrue(TypewiseAlert.inferBreach(27, 20, 30) == BreachType.NORMAL);
    }	
    @Test
    public void infersTemperatureBreach()
    {
		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, 50) == BreachType.TOO_HIGH);
    }
    @Test
    public void infersBreachAlertToController()
    {
		BatteryInfo batteryproperties = new BatteryInfo(CoolingType.HI_ACTIVE_COOLING, "PowerShell battery");
		TypewiseAlert.checkAndAlert(AlertType.TO_CONTROLLER, batteryproperties, 60);
    }
    public void infersBreachAlertToEmail()
    {
		BatteryInfo batteryproperties = new BatteryInfo(CoolingType.PASSIVE_COOLING, "Grid PowerCell");
		TypewiseAlert.checkAndAlert(AlertType.TO_EMAIL, batteryproperties, 50);
    }
}
