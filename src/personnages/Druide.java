package personnages;

public class Druide {
	private String nom;
	private int force;

	public Druide(String nom, int force) {
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
		return null;
	}

	public void fabriquetPotion(int quantite, int forcePotion) {

	}

	public void booster(Gaulois gaulois) {

	}
}
