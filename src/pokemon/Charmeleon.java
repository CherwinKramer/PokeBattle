package pokemon;

import main.Pokemon;
import properties.Attack;
import properties.EnergyType;
import properties.Resistance;
import properties.Weakness;

public class Charmeleon extends Pokemon {

	private static EnergyType energyType = new EnergyType(EnergyType.FIRE);
	private static Weakness weakness = new Weakness(new EnergyType(EnergyType.WATER), 2D);
	private static Resistance resistance = new Resistance(new EnergyType(EnergyType.LIGHTNING), 10D);
	private static Double health = 60D;
	private static Double hitPoints = health;
	private static Attack[] attacks = new Attack[] { new Attack("Head Butt", 10D), new Attack("Flare", 30D)  };

	public Charmeleon(String name) {
		super(name, energyType, weakness, resistance, hitPoints, health, attacks);
	}
}
