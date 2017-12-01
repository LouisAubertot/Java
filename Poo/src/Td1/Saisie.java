import java.util.Scanner;

public class Saisie {

	public static void main(String[] args) 
	{
		
	}
	
	public static boolean EstEnMaj (String a)
	{
		
		String aMaj = a.substring(0, 1); 
		if (aMaj != aMaj.toUpperCase())
		{
			return false;
		}
		
		return true;
	}
	public static boolean EstMaj(String nom) 
	{
		if (nom != nom.toUpperCase())
		{
			return false;
		}
		
		return true;
	}
	
	
	
	public static String saisiPrenom()
	{
		System.out.println("Veuillez saisir votre prenom");
		Scanner scan = new Scanner(System.in);
		String nom = scan.next(); scan.nextLine();
		return nom;
	}
	public static String saisiNom() 
	{
		
		System.out.println("Veuillez saisir votre nom");
		Scanner scan = new Scanner(System.in);
		String prenom = scan.next(); scan.nextLine();
		return prenom;
	}
	
	public static Integer saisiNaissance()
	{
		System.out.println("Veuillez saisir votre année de naissance");
		Scanner scan = new Scanner(System.in);
		Integer age = 2017 - scan.nextInt(); scan.nextLine();
		return age;
	}
	
	
	
	/*public String saisi(String B) 
	{
		Scanner scan = new Scanner(System.in);
		String prenom = scan.next(); scan.nextLine();
		return prenom;
	}
	
	public Integer saisi(Integer C)
	{
		Scanner scan = new Scanner(System.in);
		Integer age = scan.nextInt(); scan.nextLine();
		return age;
	}
	
	public Float saisi(Float D)
	{
		Scanner scan = new Scanner(System.in);
		Float a = scan.nextFloat(); scan.nextLine();
		return a;
	}
	*/
	// Surcharger une methode signifie que l'on va nommer plusieurs methodes executant la meme chose de la meme facon cependant grace au parametre le programme saura 
	// quel methode utiliser en fonction du type de parametre passé qui, pour chaque methodes, dois etre différent
	//malheureusement je n'arrive pas a comprendre comment implementer cela dans mon cas de figure.
	
	
	
	
	
	
	
	
	public static Float saisiReel ()
	{
		Float a;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir un reel :");
		a = scan.nextFloat(); scan.nextLine();
		return a;
	}
	
	public static String saisiChaine()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir une chaine :");
		String chaine = scan.next(); scan.nextLine();
		return chaine;
	}
	
	
	public static int[] saisieTable()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre d'indice a générer :");
		int max = scan.nextInt();
		
		
		int[] tab  = new int[max];
		for(int i = 0; i<max;i++)
		{
			Scanner scane = new Scanner(System.in);
			System.out.println("Veuillez saisir le premier");
			int var = scane.nextInt();
			tab[i] = var;
		}
		
		return tab;
		
	}
	
	


	public static void afficher(int[] tab) 
	{
		for(int i=0; i<tab.length; i++)
		{
			System.out.print(tab[i]+", ");
		}
		System.out.println();
	}

	public static int[] copie(int tableauOriginal[], int tableauCopie[])
	{
	    int i ;
	 
	    for(i = 0 ; i < tableauOriginal.length ; i++)
	    tableauCopie[i] = tableauOriginal[i] ;
	    
	    return tableauCopie;
	}
	
	
	
	
	
	
	// Tri a bulles
	
	public static void tri(int []tab)
	{
		boolean b;
		do
		{
			b=false;
			for(int i=0; i<tab.length-1; i++)
			{
				if(tab[i+1]<(tab[i]))
				{
					echanger(tab, i, i+1);
					b=true;
				}
			}
		}
		while (b);
	}
	
	public static void echanger(int tab[], int x, int y) 
	{
		int temp=tab[x];
		tab[x]=tab[y];
		tab[y]= temp;
	}
	
	// renvoie de la position dans un tableau
	
	
	public static int position(int tab[], int val)
	{
		int pos = 0;
		
		for(int i=0; i<tab.length; i++)
		{
			if (tab[i] == val)
			{
				pos = i;
			}
			
			
		}
		return pos;
	}
	
	
	
	
	
	
}
