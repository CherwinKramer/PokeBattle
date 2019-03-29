package properties;

public class EnergyType {
	public final static String FIRE = "Fire";
	public final static String FIGHTING = "Fighting";
	public final static String LIGHTNING = "Lightning";
	public final static String WATER = "Water";

	private String energyType;
	
	public EnergyType(String energyType) {
		this.energyType = energyType;
	}
	
	public String getEnergyType() {
		return energyType;
	}
	public void setEnergyType(String energyType) {
		this.energyType = energyType;
	}
}
