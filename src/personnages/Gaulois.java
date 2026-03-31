package personnages;

import objet.Equipement;
import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	private int effetPotion = 1;
	private Village village;

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		System.out.println(asterix);
		System.out.println(obelix);
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
			effetPotion = 1;
		}
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	private static final String TEXTE = "Bonjour, je m'appelle ";

	public void sepresenter() {
		if (village == null) {
			parler(TEXTE + nom + ". Je voyage de villages en villages.");
		} else if (this == village.getChef()) {
			parler(TEXTE + nom + ". Je suis le chef du village : " + village.getNom() + ".");
		} else {
			parler(TEXTE + nom + ". J'habite le village : " + village.getNom() + ".");
		}
	}

}
