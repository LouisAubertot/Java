package Td2;


public class Client implements Comparable <Client>{
	
	private String nom;
	private String prenom;
	private Float chA;
	
	public Client(String nom, String pnom, Float i) 
	{
		this.nom = nom;
		this.prenom = pnom;
		this.chA = i;
	}

	

	public String getNom()
	{
		return this.nom;
	}
	public String getPrenom()
	{
		return this.prenom;
	}
	public Float getChA()
	{
		return this.chA;
	}
	public void setNom(String n)
	{
		this.nom = n;
	}
	public void setPrenom(String p)
	{
		this.prenom = p;
	}
	public void setChA(Float c)
	{
		this.chA = c;
	}
	public String toString() 
	{
	    return "Nom : " +this.getNom()+ ", Prenom : " +this.getPrenom() + " Chiffre d'affaire " + this.getChA();
	}
	
	@Override
	public int compareTo(Client arg0) {
		// TODO Auto-generated method stub
		return this.chA.compareTo(arg0.chA);
	}
	
	

}
