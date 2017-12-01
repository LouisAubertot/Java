package Td3;

import java.util.HashMap;



public class Portefeuille {

	/**
	 * Attribut de la classe
	 */
	private HashMap<Devise, Float> valeurs;
	private String nom;


	/**
	 * Constructeur par d�faut
	 */
	public Portefeuille(String n) {

		this.valeurs = new HashMap<Devise, Float>();
		setNom(n);
	}
	
	

	/**
	 * M�thode d'acc�s : accesseur
	 * @return la liste des devises
	 */
	public HashMap<Devise, Float> getValeurs() {
		return this.valeurs;
	}
	
	public String getNom()
	{
		return this.nom;
	}

	/**
	 * M�thode d'acc�s : modificateur
	 * @param valeurs : une nouvelle liste de devises
	 */
	public void setValeurs(HashMap<Devise, Float> valeurs) {
		this.valeurs = valeurs;
	}
	
	public void setNom (String n)
	{
		this.nom = n;
	}

	/**
	 * Ajout d'une devise au portefeuille
	 * @param d la devise � ajouter
	 */
	
	
	
	public void ajout(Devise d, Float Montant) {

		Boolean i = this.chercheMonnaie(d);

		// Pas encore de cette monnaie
		if (i == false) {
			this.valeurs.put(d, Montant);
		}
		// La monnaie existe d�j�, on ajoute simplement le montant
		else {
			Float old = this.valeurs.get(d);
			this.valeurs.put(d, Montant + old );
			
		}

	}
	
	
	
	
	
	
	private Boolean chercheMonnaie(Devise d) {
		return valeurs.containsKey(d);
	}
	

	/**
	 * Sortie d'argent du portefeuille
	 * @param d la devise dont on sort de l'argent
	 */
	
	public void retrait(Devise d, Float Montant) {

		Boolean i = this.chercheMonnaie(d);

		if (i != false) {
			try {
				float old = this.valeurs.get(d);
				this.valeurs.put(d, Montant - old);
				
				
				
			} catch (DeviseDevientNulleException ddne) {
				System.out.println(ddne.getMessage());
				this.valeurs.remove(i);
			}
		}
		else  
		{
			throw new IllegalArgumentException("Retrait : la devise "+ 
								d.getNom() + " n'existe pas !");
		}
	}

	/**
	 * Permet de savoir si une monnaie existe dans le portefeuille
	 * (renvoie -1 si la monnaie n'existe pas, l'indice sinon)
	 * 
	 * Attention : n�cessite qu'on impl�mente equals(Object) dans Devise 
	 */ 
	
	
	
	


	/**
	 * Tri de la liste de devises
	 */
	

	/**
	 * Tr�s utile pour l'affichage tous m�dias
	 */
	@Override
	public String toString() {
	
		StringBuffer sB = new StringBuffer(512);
		sB.append("Contenu du portefeuille :" + nom + "\n");
		
		for (Devise d : this.getValeurs().keySet()) {
			sB.append(d+" " + this.getValeurs().get(d));
		}
		
		return sB.toString();
	}
	
	/**
	 * M�thode d'affichage des devises
	 */
	public void affiche() {

		System.out.println(this);
	}

}
