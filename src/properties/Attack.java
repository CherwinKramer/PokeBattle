package properties;

public class Attack {
	
	private String name;
	private Double hitPoints;
	
	public Attack(String name, Double hitPoints) {
		this.name = name;
		this.hitPoints = hitPoints;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(Double hitPoints) {
		this.hitPoints = hitPoints;
	}
}
