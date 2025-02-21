package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private static int effetPotion;

	public Gaulois(String nom, int force, int effetPotion) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Les gaulois " + nom + " : ";
	}

	public static void main(String[] args) {
		Gaulois asterixGaulois = new Gaulois("Astérix", 8, effetPotion);
		System.out.println(asterixGaulois.getNom());
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}
	
	public void frapper (Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force/3);
	}
	
	public void boirePotion() {
		
	}
}
