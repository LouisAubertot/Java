package Td3;
/**
 * Exception "maison" permettant de lancer la suppression effective
 * d'une devise si elle est tomb�e � 0
 * 
 * Voir la m�thode retrait dans la classe Portefeuille
 * 
 */

public class DeviseDevientNulleException extends RuntimeException{
	
	
	public DeviseDevientNulleException(String message) {
		
		super(message);
	}
}







