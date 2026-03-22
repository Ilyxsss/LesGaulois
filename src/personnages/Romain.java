package personnages;

public class Romain {
	private String nom;
	private int force;


	public static void main(String[] args) {
		Romain Minus = new Romain("Minus", -6);
	}
	
	private Boolean isInvariantVerified() {
		return force >= 0;
	}

	public Romain(String nom, int force) {
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
		return "Le Romain " + nom + " : ";
	}

	public String toString() {
		return nom;
	}

	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force < 1) {
			force = 0;
			parler("J'abandonne");
		} else {
			parler("Aïe");
		}
	}
}
