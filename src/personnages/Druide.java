package personnages;

import objet.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();

	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	private void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concoté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
	}

	public void booster(Gaulois gaulois) {
		chaudron.resterPotion();
		gaulois.getNom();
		if (chaudron.resterPotion() == true) {
			if (gaulois.getNom() == "Obélix") {
				parler("Non, " + gaulois.getNom() + " Nom !... Et tu le sais très bien !");
			} else {
				chaudron.prendreLouche();
				gaulois.boirePotion(force);
				parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
			}
		} else {
			parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
		}
	}

	public String toString() {
		return "Le Druide " + nom;
	}

}
