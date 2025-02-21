package test_fonctionnel;

import java.util.Iterator;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterixGaulois = new Gaulois("Astérix", 8, 0);
		Gaulois obelixGaulois = new Gaulois("Obélix", 16, 0);
		asterixGaulois.parler("Bonjour Obélix");
		obelixGaulois.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangleirs ?");
		asterixGaulois.parler("Oui très bonne idée");
		
		Romain soldatRomain = new Romain("Soldat Romain", 10);
		Romain guerrierRomain = new Romain("Guerrier Romain", 2);
		Romain minusRomain = new Romain("Minus", 6);
		
		System.out.println("Dans la forêt " + asterixGaulois.getNom() + " et " + obelixGaulois.getNom() + " tombe nez à nez sur le romain" + minusRomain.getNom());
		for (int i = 0; i < 3 ; i++) {
			asterixGaulois.frapper(minusRomain);
		}
	}
}
