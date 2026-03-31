package personnages;

import objet.Equipement;

public class Romain {
	private String nom;
	private int force;
	private String texte;
	private int nbEquipement = 0;
	private Equipement[] equipements = new Equipement[2];

	public static void main(String[] args) {
		Romain Minus = new Romain("Minus", -6);
		Minus.equiperSoldat(Equipement.CASQUE);
	}

	private Boolean isInvariantVerified() {
		return force >= 0;
	}

	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		assert IsInvariantVerified();
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

	private boolean IsInvariantVerified() {
		return force >= 0;
	}

	public String toString() {
		return nom;
	}

	public void recevoirCoup(int forceCoup) {
		// précondition de la force du coup est positive
		assert forceCoup > 0;
		// post condition : la force a diminuée
		int oldForce = force;
		force = force - forceCoup;
		if (force < 1) {
			force = 0;
			parler("J'abandonne");
		} else {
			parler("Aïe");
		}
		// post condition : la force a diminuée
		assert force < oldForce;

		assert IsInvariantVerified();
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:
			if (equipements[0].equals(equipement)) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + ".");
			} else {
				equiperSoldat(equipement);
			}
			break;
		default:
			equiperSoldat(equipement);
			break;
		}
	}

	private void equiperSoldat(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'équipe avec " + equipement);
	}

}
