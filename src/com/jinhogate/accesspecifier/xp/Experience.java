package com.jinhogate.accesspecifier.xp;

/**
 * Seul le modifier final est autorisé lors de la déclaration d'une variable dans une méthode (L14-15)
 * @author JINHOGATE
 *
 */
public class Experience {
	public static void main(String[] args) {
		
	}
	
	public String saluer() {
//		private String name = "ata";
		final String PRENOM = "gyl";
		String salutation = "Bonour à tous!";
		return salutation;
	}
}
