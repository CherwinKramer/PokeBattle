package main;

import pokemon.Charmeleon;
import pokemon.Pikachu;
import properties.Attack;

public class Main {
	private static Pokemon pikachu = new Pikachu("Pika");
	private static Pokemon charmeleon = new Charmeleon("Charm");

	public static void main(String[] args) {
		System.out.println(charmeleon.getName() + "'s health is " + charmeleon.getHealth() + "!");
		pikachu.attackPokemon(charmeleon, chooseAttack(pikachu, "Electric Ring"));
		System.out.println(pikachu.getName() + "'s health is " + pikachu.getHealth() + "!");
		charmeleon.attackPokemon(pikachu, chooseAttack(charmeleon, "Flare"));

	}

	private static Attack chooseAttack(Pokemon pokemon, String attackName) {
		Attack[] attacks = pokemon.getAttacks();
		for (Attack listAttack : attacks) {
			if (listAttack.getName().equals(attackName)) {
				return listAttack;
			}
		}
		return null;
	}
}