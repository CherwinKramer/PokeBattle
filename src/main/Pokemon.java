package main;

import properties.Attack;
import properties.EnergyType;
import properties.Resistance;
import properties.Weakness;

public abstract class Pokemon {
	
	private String name;
	private EnergyType energyType;
	private Double hitpoints;
	private Double health;
	private Weakness weakness;
	private Resistance resistance;
	private Attack[] attacks;
	
	public Pokemon(String name, EnergyType energyType, Weakness weakness, Resistance resistance, Double hitPoints, Double health, Attack[] attacks) {
		this.name = name;
		this.energyType = energyType;
		this.weakness = weakness;
		this.resistance = resistance;
		this.hitpoints = hitPoints;
		this.health = health;
		this.attacks = attacks;
	}
	
	public void attackPokemon(Pokemon pokemon, Attack attack) {
		Double multiplier = 1D;
		Double resist = 0D;
		if(pokemon.getWeakness().getEnergyType() == this.energyType) {
			multiplier = weakness.getMultiplier();
		}
		if(pokemon.getResistance().getEnergyType() == this.energyType) {
			resist = pokemon.getResistance().getValue();
		}
		
		pokemon.reductDamage(multiplier, resist, attack);
	}
	
	public void reductDamage(Double multiplier, Double resist, Attack attack) {
		Double damage = attack.getHitPoints();
		Double health = this.getHealth();
		
		damage = damage * multiplier;
		damage = damage - resist;
		
		health = health - damage;
		this.setHealth(health);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EnergyType getEnergyType() {
		return energyType;
	}

	public void setEnergyType(EnergyType energyType) {
		this.energyType = energyType;
	}

	public Double getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(Double hitpoints) {
		this.hitpoints = hitpoints;
	}

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}

	public Weakness getWeakness() {
		return weakness;
	}

	public void setWeakness(Weakness weakness) {
		this.weakness = weakness;
	}

	public Resistance getResistance() {
		return resistance;
	}

	public void setResistance(Resistance resistance) {
		this.resistance = resistance;
	}
	
	public Attack[] getAttacks() {
		return attacks;
	}
	public void setAttacks(Attack[] attacks) {
		this.attacks = attacks;
	}
	
}
