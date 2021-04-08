package TypewiseAlert;

public enum AlertType {
	TO_CONTROLLER {
		public String toString() {
			return "TO_CONTROLLER";
		}
	},
	TO_EMAIL {
		public String toString() {
			return "TO_EMAIL";
		}
	}
};
