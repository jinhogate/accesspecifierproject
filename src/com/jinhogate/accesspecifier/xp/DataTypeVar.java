package com.jinhogate.accesspecifier.xp;

/**
 *  + Le type var permet de déclarer une variable sans spécifier un type précis
 *  + La détermination du type de la variable se fait automatiquement à travers  type de la valeur d'init
 *  - Il n'autorise pas cependant : 
 *  	# la déclaration composée (L17)
 *  	# la déclaration d'une variable sans initialisation (L18)
 *  Le var a été introduit dans le JDK10 (Java10)
 * @author JINHOGATE
 *
 */
public class DataTypeVar {
	public static void main(String[] args) {
		var nom = "KOSSI";
		nom = String.valueOf(8);
		System.out.println(nom);
//		var age = 8, annee = 1995;
//		var ecran;
		diviserDeuxNombres();
	}
	
	private static void diviserDeuxNombres() {
//		int dividende = 7;
//		int diviseur = 3;
//		double resultat = dividende/diviseur;
		var dividende = 7;
		var diviseur = 3;
		var resultat = dividende/diviseur;
		System.out.println("La division de " + dividende + " par " + diviseur + " = " + resultat);
	}

}
