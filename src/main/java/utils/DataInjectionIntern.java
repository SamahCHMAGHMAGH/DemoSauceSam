package utils;

import org.testng.annotations.DataProvider;

public class DataInjectionIntern {
	// Définition du fournisseur de données
	@DataProvider(name = "userData")
	public Object[][] userData() {
		// Définir les données de test ici
		// Retourne un tableau d'objets bidimensionnel
		// contenant les données de test
		return new Object[][] {
				// Chaque élément du tableau représente un jeu de données
				// Chaque jeu de données est un tableau d'objets
				{ "standard_user", "secret_sauce" }, { "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, { "performance_glitch_user", "secret_sauce" },
				{ "error_user", "secret_sauce" }, { "visual_user", "secret_sauce" }, };
	}
}

