import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Bonjour {




	public static void main(String[] args) throws IOException 
	{
		/*
		String prenom= "abcd";
		String nom= "abcd";
		Integer age;
		
		while(Saisie.EstMaj(nom) != true ||Saisie.EstEnMaj(prenom) != true) 
		{	
			nom = Saisie.saisiNom();
			prenom = Saisie.saisiPrenom();
		}
		
		
		age = Saisie.saisiNaissance();
		System.out.println("Bonjour " + prenom + " " + nom + "Tu as " + age + "ans");
		
		Date aujourdhui = new Date();
		
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		System.out.println(shortDateFormat.format(aujourdhui));
		DateFormat longDateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		System.out.println(longDateFormat.format(aujourdhui));
		
		*/
		
		
		
		
		
		
		int[] tab = Saisie.saisieTable();
		Saisie.afficher(tab);
		
		
		
		int []tab3 = {8 ,5 ,4 ,3 ,9 ,1 ,2 ,6 ,42};
		
		Saisie.afficher(tab3);
		Saisie.tri(tab3);	
		Saisie.afficher(tab3);
		int pos = Saisie.position(tab3, 5);
		System.out.println("la valeur que vous cherchez se trouve la position" + pos);
		
		

	}

}
