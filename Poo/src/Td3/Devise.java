package Td3;


public class Devise implements Comparable<Devise> {

	/**
	 * Attributs de la classe
	 */
	

	private String nom;

	/**
	 * Constructeurs    
	 */
	public Devise() {

		this("EUR");
	}

	public int hashCode()
	{
		return this.nom.hashCode();
		
	}
	

	public Devise(String d) {

	
		this.setNom(d);
	}

	// Constructeur par copie  cxvxcvfsdvdfbdfb 
	public Devise(Devise d) {

		
		this.nom = d.nom;
	}

	/**
	 * M�thodes d'acc�s
	 */
	

	public void setNom(String nom) {
		
		if (nom==null || nom.trim().length()==0) {
			throw new IllegalArgumentException("Le nom de la devise est vide !");
		}
		this.nom = nom;
	}
	
	public String getNom() {

		return this.nom;
	}

	

	/**
	 * Autres m�thodes
	 */
	

	

	public String toString() {

		return this.nom;
	}

	public void affiche() {

		System.out.println(this);
	}
	
	/**
	 * M�thode n�cessaire pour que contains et indexOf de ArrayList fonctionnent
	 * Attention : equals(Object) et non equals(Devise)
	 */
	public boolean equals(Object d) {
		
		if (d instanceof Devise) {
			return ((Devise)d).nom.equals(this.nom);
		}
		
		return false;
	}

	/**
	 * M�thode de l'interface Comparable � implementer pour
	 * pouvoir utiliser Collections.sort(liste)
	 * 
	 * @param o la devise � comparer
	 * @return un entier permettant de trier
	 */
	public int compareTo(Devise o) {
		
		return this.nom.compareTo(o.nom);
	}
	
}