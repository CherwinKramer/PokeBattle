package properties;

public class Resistance {
	
	private EnergyType energyType;
	private Double value;
	
	public Resistance(EnergyType energyType, Double value) {
		this.energyType = energyType;
		this.value = value;
	}
	
	
	
	public EnergyType getEnergyType() {
		return energyType;
	}
	public void setEnergyType(EnergyType energyType) {
		this.energyType = energyType;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}

}
