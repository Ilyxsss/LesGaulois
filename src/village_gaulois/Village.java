package village_gaulois;

import java.util.Arrays;
import java.util.Iterator;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[30];

	public static void main(String[] args) {
		
		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Le Village des Irréductibles", 30, Abraracourcix);
		Gaulois Asterix = new Gaulois("Astérix", 8);
		Gaulois Obelix = new Gaulois("Obélix", 25);
		Gaulois Doublepolemix = new Gaulois("Doublepolémix", 4);
		
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.ajouterVillageois(Asterix);
		village.ajouterVillageois(Obelix);
		village.afficherVillage();
		Abraracourcix.SePresenter(Abraracourcix);
		Asterix.SePresenter(Doublepolemix);
		Doublepolemix.SePresenter(Asterix);
	}

	public Village(String nom, int nbVillageois, Gaulois chef) {
		super();
		this.nom = nom;
		this.nbVillageois = nbVillageois;
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		for (int i = 0; i < villageois.length; i++) {
			if (villageois[i] == null) {
				villageois[i] = gaulois;
				gaulois.setVillage(this);
				return;
			}
		}
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois < 0 || numVillageois >= villageois.length) {
			System.out.println("Il n'y a pas autant d'habitant dans notre village !");
			return null;
		}

		if (villageois[numVillageois] == null) {
			System.out.println("Il n'y a pas autant d'habitant dans notre village !");
			return null;
		}

		return villageois[numVillageois];

	}

	public void afficherVillage() {
		System.out.println(
				"Dans le village " + getNom() + " du chef " + getChef() + " vivent les légendaires gaulois : ");

		for (Gaulois gaulois : villageois) {
			if (gaulois != null) {
				System.out.println("- " + gaulois.getNom());
			}
		}

	}
}
