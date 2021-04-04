package TypewiseAlert;

public enum CoolingType {
	PASSIVE_COOLING {
		public String toString() {
			return "PASSIVE_COOLING";
		}
	},

	HI_ACTIVE_COOLING {
		public String toString() {
			return "HI_ACTIVE_COOLING";
		}
	},
	MED_ACTIVE_COOLING {
		public String toString() {
			return "MED_ACTIVE_COOLING";
		}
	}
};
