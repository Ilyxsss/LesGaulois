package tableaux;

public class TestTableau {
	public static void main(String[] args) {
		int[] tableauEntiers = { 5, 7, 2, 5, 3 };
		String[] tableauChaines = new String[5];
		int nbChaines = 0;
		for (int entier : tableauEntiers) {
			System.out.print(entier + " ");
		}

		System.out.println();

		for (int i = 0; i < tableauEntiers.length; i++) {
			int entier1 = tableauEntiers[i];
			System.out.print(entier1);
			if (i < tableauEntiers.length - 1) {
				System.out.print(", ");
			}
		}

		System.out.println();

		for (String string : tableauChaines) {
			System.out.print(string + " ");
		}

		System.out.println();

		for (int i = 0; i < tableauChaines.length; i++) {
			String string = tableauChaines[i];
			System.out.print(string);
			if (i < tableauChaines.length - 1) {
				System.out.print(", ");
			}
		}

		System.out.println();

		tableauChaines[nbChaines] = "Hello";
		nbChaines++;
		tableauChaines[nbChaines] = "World";
		nbChaines++;
		tableauChaines[3] = " !";

		for (int i = 0; i < nbChaines; i++) {
			System.out.print(tableauChaines[i] + " ");
		}

		System.out.println();

		for (String chaine : tableauChaines) {
			if (chaine != null) {
				System.out.print(chaine + " ");
			}
		}
	}
}
