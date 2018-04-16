package model;

public class Utilisateur {
		
	private String nom;
	private String prenom;
	private String identifiant;
	private String motDePasse;
	
	public Utilisateur(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/**
	 * 
	 * @param identifiant
	 * Attribution d'un identifiant à un utilisateur
	 */
	
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	
	/**
	 * Attribution d'un mot de passe à un utilisateur
	 * @param motDePasse
	 */
	
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
}