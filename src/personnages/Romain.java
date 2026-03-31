package personnages;

import objet.Equipement;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement = 0;
	private Equipement[] equipements = new Equipement[2];

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", -6);
		minus.equiperSoldat(Equipement.CASQUE);
	}

	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
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

	private boolean isInvariantVerified() {
		return force >= 0;
	}

	public String toString() {
		return nom;
	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		forceCoup = calculerResistanceEquipement(forceCoup);
		force -= forceCoup;
		switch (force) {
		case 0:
			parler("Aïe");
			break;
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
		}
		return equipementEjecte;
	}

	private int calculerResistanceEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";

			for (int i = 0; i < nbEquipement;) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				i++;
			}
			texte = +resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
			} else {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	private static final String TEXTE2 = "Le soldat ";

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println(TEXTE2 + nom + " est déjà bien protégé !");
			break;
		case 1:
			if (equipements[0].equals(equipement)) {
				System.out.println(TEXTE2 + nom + " possède déjà un " + equipement + ".");
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
		System.out.println(TEXTE2 + nom + " s'équipe avec " + equipement);
	}

}
