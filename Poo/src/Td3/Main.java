package Td3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	
	
	
	
	
	static void fichier (String s)
	{
		File file = new File("data.porteF");
		
		try {
			
			FileWriter filewriter = new FileWriter(file);
			filewriter.write("PORTEFEUILLE /r /n");
			filewriter.write(s+ "/r /n");
			filewriter.write("FIN PORTEFEUILLE" + " /r /n");
			filewriter.flush();
			filewriter.close();
			
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) 
	{
		
		
		/**
		 * Test des classes Portefeuille et Devise
		 *
		 */
		
				AdminPortefeuille Admin = new AdminPortefeuille();
			
				Portefeuille p = new Portefeuille("pepouze");
				Portefeuille d = new Portefeuille("dedouze");
				
				
				Admin.ajouter(p);
				Admin.ajouter(d);
				
				
				System.out.println(Admin.toString());
				
				
				
				/*
				int sousmenu = 0;
				Scanner scan = new Scanner(System.in);
				System.out.println("Que voulez vous faire ?");
				System.out.println("Choix du portefeuille | 1");
				System.out.println("Modifier Client | 2");
				System.out.println("Supprimer Client| 3");
				sousmenu = scan.nextInt();
				switch (sousmenu)
				{
					case 1 :
					{
						Scanner scan0 = new Scanner(System.in);
						System.out.println("Entrez son Nom");
						String nom = scan.next(); scan.nextLine();
						
						Scanner scan1 = new Scanner(System.in);
						System.out.println("Entrez son Prenom");
						String pnom = scan.next(); scan.nextLine();
						
						Scanner scan2 = new Scanner(System.in);
						System.out.println("Entrez son Chiffre d'affaire");
						float ca = scan2.nextFloat();scan.nextLine();
						
						Client c = new Client(nom, pnom, ca);
						String l1 = maClientele.toString(c);
						System.out.println(l1);
						maClientele.add(c);
						maClientele.getClients();
						int i = maClientele.getClients().size();
						System.out.println(i);
						maClientele.tri();
					}
					break;
				
				
					case 2 : 
					{
						Client c = new Client("AUBERTOT", "Louis", (float) 125);
						maClientele.add(c);
						Scanner scan0 = new Scanner(System.in);
						System.out.println("Entrez son Nom");
						String nom = scan.next(); scan.nextLine();
						
						
						
						for(int i = 0 ; i < maClientele.getClients().size() ; i++)
						{
							if (maClientele.getClients().get(i).getNom().equalsIgnoreCase(nom))
							{
								Scanner scan1 = new Scanner(System.in);
								System.out.println("Entrez son nouveau nom");
								String name = scan1.next(); 
								
								Scanner scan2 = new Scanner(System.in);
								System.out.println("Entrez son nouveau prenom");
								String pnom = scan2.next(); 
								
								Scanner scan3 = new Scanner(System.in);
								System.out.println("Entrez son nouveau ca");
								Float ca = scan3.nextFloat(); 
								
								maClientele.getClients().get(i).setNom(name);
								maClientele.getClients().get(i).setPrenom(pnom);
								maClientele.getClients().get(i).setChA(ca);
								
								String t = maClientele.toString(maClientele.getClients().get(i));
								System.out.println(t);
								maClientele.tri();
							}
						}
					}
					break;
			
				
				
					case 3 : 
					{
						Client c = new Client("AUBERTOT", "Louis", (float) 125);
						maClientele.add(c);
						int a = maClientele.getClients().size();
						System.out.println(a);
						Scanner scan0 = new Scanner(System.in);
						System.out.println("Entrez son Nom");
						String nom = scan.next(); scan.nextLine();
						
						for(int i = 0 ; i < maClientele.getClients().size() ; i++)
						{
							if (maClientele.getClients().get(i).getNom().equalsIgnoreCase(nom))
							{
								maClientele.supprimer(maClientele.getClients().get(i));
							}
						
						}
						int e = maClientele.getClients().size();
						System.out.println(e);
						maClientele.tri();
					}
					
					*/
				}
				
				
				
	}


