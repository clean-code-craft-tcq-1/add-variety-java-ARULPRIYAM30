package TypewiseAlert;

public class CoolingLimit {

	int lowerLimit = 0, upperLimit = 0;

	public void PASSIVE_COOLING() {
		this.lowerLimit = 0;
		this.upperLimit = 35;
	}

	public void HI_ACTIVE_COOLING() {
		this.lowerLimit = 0;
		this.upperLimit = 45;
	}

	public void MED_ACTIVE_COOLING() {
		this.lowerLimit = 0;
		this.upperLimit = 40;
	}

	public int getLowerLimit() {
		return lowerLimit;
	}

	public int getUpperLimit() {
		return upperLimit;
	}
}
