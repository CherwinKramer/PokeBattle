package pokemon;

import main.Pokemon;
import properties.Attack;
import properties.EnergyType;
import properties.Resistance;
import properties.Weakness;

public class Pikachu extends Pokemon {

	private static EnergyType energyType = new EnergyType(EnergyType.LIGHTNING);
	private static Weakness weakness = new Weakness(new EnergyType(EnergyType.FIRE), 1.5D);
	private static Resistance resistance = new Resistance(new EnergyType(EnergyType.FIGHTING), 20D);
	private static Double health = 60D;
	private static Double hitPoints = health;
	private static Attack[] attacks = new Attack[] { new Attack("Electric Ring", 50D), new Attack("Pika Punch", 20D)  };

	public Pikachu(String name) {
		super(name, energyType, weakness, resistance, hitPoints, health, attacks);
	}
}
