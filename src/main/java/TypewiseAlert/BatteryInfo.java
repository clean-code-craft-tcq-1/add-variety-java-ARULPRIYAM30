package TypewiseAlert;

import TypewiseAlert.CoolingType;

public class BatteryInfo {
    public CoolingType coolingType;
    public String brand;
	public BatteryInfo(CoolingType coolingType, String brand) {
		this.coolingType = coolingType;
		this.brand = brand;
	}
}