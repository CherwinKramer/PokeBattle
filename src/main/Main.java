package main;

import java.util.Scanner;

import pokemon.Charmeleon;
import pokemon.Pikachu;
import properties.Attack;

public class Main {
	private static Attack chosenAttack;
	private static Pokemon pikachu;
	private static Pokemon charmeleon;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What do you want to name your Pikachu?");
		pikachu = new Pikachu(in.nextLine());
		System.out.println(
				pikachu.getName() + " what a beautiful name, opponent what do you want to name your Charmeleon?");
		charmeleon = new Charmeleon(in.nextLine());
		System.out.println(charmeleon.getName() + " what a lovely name.");
		System.out.println();
		System.out.println(pikachu.getName() + " Choose an attack: " + pikachu.getAttacks().toString());
		chosenAttack = chooseAttack(pikachu, in.nextLine());
//		while(chooseAttack(pikachu, attackName))
//		 pikachu.att

		in.close();
	}

	private static Attack chooseAttack(Pokemon pokemon, String attackName) {
		Attack attack = null;
		Attack[] attacks = pokemon.getAttacks();
			for (Attack listAttack : attacks) {
				if (listAttack.getName() == attackName) {
					return attack;
				}
			}
		return attack;
	}
}