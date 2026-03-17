package test_fonctionnel;

import java.util.Iterator;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Astérix", 8);
		Gaulois Obelix = new Gaulois("Obélix", 16);
		Romain Minus = new Romain("Minus", 6);

		Asterix.parler("Bonjour Obélix");
		Obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		Asterix.parler("Oui très bonne idée");
		System.out.println(
				"Dans la forêt " + Asterix + " et " + Obelix + " tombent nez à nez sur le romain " + Minus + ".");
		for (int i = 0; i < 3; i++) {
			Asterix.frapper(Minus);
		}
	}
}
