package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private int nbVillageoisMax;
	private Gaulois[] villageois;
	private Gaulois chef;

	public Village(String nom, int nbVillageois, int nbVillageoisMax, Gaulois chef) {
		this.nom = nom;
		this.nbVillageois = nbVillageois;
		this.nbVillageoisMax = nbVillageoisMax;
		villageois = new Gaulois[nbVillageoisMax];
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

//	public void setChef(Gaulois chef) {
//		this.chef = chef;
//	}

	public int getNbVillageois() {
		return nbVillageois;
	}

	public void setNbVillageois(int nbVillageois) {
		this.nbVillageois = nbVillageois;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois > nbVillageois) {
			System.out.println(" Il n'y a pas autant d'habitants dans le village ! ");
			return null;
		} else {
			return (villageois[numVillageois - 1]);
		}
	}

	public void afficherVillageois(Village village, Gaulois chef) {
		System.out.println(
				"Dans le village " + village.nom + " du chef " + village.chef + " vivent les légendaires gaulois : ");
	}

	public static void main(String[] args) {
		Gaulois arbraracourcixGaulois = new Gaulois("Abraracourcix", 6, 0);
		Village village = new Village("Village des iréductibles", 0, 30, arbraracourcixGaulois);
		Gaulois gaulois = village.trouverVillageois(30);

		// village.setChef(arbraracourcixGaulois);

		Gaulois asterixGaulois = new Gaulois("Astérix", 8, 0);
		village.ajouterVillageois(asterixGaulois);

		Gaulois gaulois1 = village.trouverVillageois(1);
		System.out.println(gaulois1);
		gaulois1 = village.trouverVillageois(2);
		System.out.println(gaulois1);

		village.afficherVillageois(village, gaulois1);
	}
}
