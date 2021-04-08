package TypewiseAlert;


	public enum BreachType {
	NORMAL("NORMAL"),
    TOO_LOW("TOO LOW"),
    TOO_HIGH("TOO HIGH");
    
    private String displayName;
	
	private BreachType(String displayName) {
        this.displayName = displayName;
    }

	public String getDisplayName() {
		return displayName;
	}
	}

