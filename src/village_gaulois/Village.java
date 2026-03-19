package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[30];
	
	public static void main(String[] args) {
		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Le Village des Irréductibles", 30, Abraracourcix);
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
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
	}

	public Object trouverVillageois(int numVillageois) {
		for (int i = 0; i < villageois.length; i++) {
			if (villageois[i] != null) {
				if (villageois[numVillageois] == villageois[i]) {
					System.out.println(villageois[i]);
				}
			} else {
				System.out.println("Il n'y a pas autant d'habitants das notre village !");
				return null;
			}
		}
		return villageois[numVillageois];

	}

	public void afficherVillage() {

	}
}
