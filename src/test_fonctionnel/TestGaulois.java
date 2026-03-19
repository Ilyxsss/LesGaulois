package test_fonctionnel;

import java.util.Iterator;

import objet.Chaudron;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Astérix", 8);
		Gaulois Obelix = new Gaulois("Obélix", 16);
		Romain Minus = new Romain("Minus", 6);
		Romain Brutus = new Romain("Brutus", 14);
		Druide Panoramix = new Druide("Panoramix", 2);

		Panoramix.fabriquerPotion(4, 3);
		Panoramix.booster(Obelix);
		Panoramix.booster(Asterix);

		for (int i = 0; i < 3; i++) {
			Asterix.frapper(Brutus);
		}
	}
}
