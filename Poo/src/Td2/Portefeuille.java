package Td2;

import java.util.ArrayList;
import java.util.Collections;

public class Portefeuille {
	
	private String nom;
	private ArrayList<Devise> listeD ;
	
	
	public ArrayList<Devise> getListe()
	{
    	return listeD;
    }
	
	
	public String getNom()
	{
		return this.nom;
	}
	public void setNom(String n)
	{
		this.nom = n;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ajouter(Devise d)
	{
		if (appartient(d))
		{
			throw new IllegalArgumentException("Cette Devise existe deja dans le portefeuille");
		}
		else
		{
			listeD.add(d);
		}
        
    }
	
	public void supprimer(Devise d)
	{
		if (appartient(d))
		{	
			listeD.remove(d);
		}
        
    }
	
	public String toString()
	{
        return listeD.toString();
    }
	
	
	public boolean appartient(Devise d)
	{
		for(int i = 0 ; i < listeD.size() ; i++)
		{
			if (listeD.get(i).getNom().equalsIgnoreCase(d.getNom())) 
			{
				return true;
			}
		}
		return false;
	}
	
	
	
	public void retrait (Devise d, Float m)
	{
		if (appartient(d))
		{
			if (d.getMontant() < m)
			{
				throw new IllegalArgumentException("Vous n'avez pas assez d'argent sur votre compte");
			}
			else 
			{
				d.setMontant(d.getMontant()-m);
			}
		}
		
	}
	public void tri ()
	{
		Collections.sort(listeD);
	}
	
	
}
