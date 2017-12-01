import java.util.ArrayList;
import java.util.Collections;

public class Clientele {
	
	
	private ArrayList<Client> listeC ;
	
	
	
	public ArrayList<Client> getClients()
	{
    	return listeC;
    }
	
	
	public Clientele()
	{
		listeC = new ArrayList<Client>();
	}
	
	
	public void add(Client c)
	{
		if (appartient(c) == true)
		{
			throw new IllegalArgumentException("Ce Client existe deja");
		}
		else
		{
			listeC.add(c);
		}
	}
	
	
	public boolean appartient(Client c)
	{
		for(int i = 0 ; i < listeC.size() ; i++)
		{
			if (listeC.get(i).getNom().equalsIgnoreCase(c.getNom())) 
			{
				return true;
			}
		}
		return false;
	}
	
	
	public void supprimer(Client c)
	{
		if (appartient(c) == true)
		{
			listeC.remove(c);
		}
		else
		{
			throw new IllegalArgumentException("Ce Client n'existe pas");
		}
    }
	
	
	public void addCA(int num, float chiffre)
	{
		for(int i = 0 ; i < listeC.size() ; i++)
		{
			if(i == num)
			{
				listeC.get(i).setChA(chiffre);
				if (listeC.get(i).getChA() > 1000)
				{
					// Utiliser le Constructeur de la classe ClientPrivilegie pour indiquer qu'il sagit d'un client privilegie 
					//
				}
			}
		}
	}
	
	

	
	
	public String toString(Client c) 
	{
	    return "Nom : " +c.getNom()+ " Prenom : " +c.getPrenom() + " Chiffre d'affaire : " + c.getChA();
	}
	
	
	public void tri ()
	{
		Collections.sort(listeC);
	}
	
	
}
