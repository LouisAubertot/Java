package Td3;

import java.util.ArrayList;

public class AdminPortefeuille 
{
	
	
	private ArrayList<Portefeuille> listeP ;
	
	
	public ArrayList<Portefeuille> getListe()
	{
    	return listeP;
    }
	
	public AdminPortefeuille()
	{
		listeP = new ArrayList<Portefeuille>();
	}
	
	
	public void ajouter(Portefeuille p)
	{
		if (appartient(p))
		{
			throw new IllegalArgumentException("Cette Devise existe deja dans le portefeuille");
		}
		else
		{
			listeP.add(p);
		}
        
    }
	
	public void supprimer(Portefeuille p)
	{
		if (appartient(p))
		{	
			listeP.remove(p);
		}
        
    }
	
	public String toString()
	{
        return listeP.toString();
    }
	
	
	public boolean appartient(Portefeuille p)
	{
		for(int i = 0 ; i < listeP.size() ; i++)
		{
			if (listeP.get(i).getNom().equalsIgnoreCase(p.getNom())) 
			{
				return true;
			}
		}
		return false;
	}

}
