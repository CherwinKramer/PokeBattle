package properties;

public class Weakness {
	
	private EnergyType energyType;
	private Double multiplier;
	
	public Weakness(EnergyType energyType, Double multiplier) {
		this.energyType = energyType;
		this.multiplier = multiplier;
	}
	
	
	
	public EnergyType getEnergyType() {
		return energyType;
	}
	public void setEnergyType(EnergyType energyType) {
		this.energyType = energyType;
	}
	public Double getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(Double multiplier) {
		this.multiplier = multiplier;
	}

}
