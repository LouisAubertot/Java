package Td2;

public class Devise implements Comparable <Devise>
{
	// Attributs
	private String nom;
	private Float montant;
	
	public Devise (String n, Float m)
	{
		this.nom = n;
		setMontant(m);
	}
	
	
	
	public String getNom()
	{
		return this.nom;
	}
	public void setNom(String n)
	{
		this.nom = n;
	}
	public Float getMontant()
	{
		return this.montant;
	}
	public void setMontant(Float m)
	{
		if (m < 0)
		{
			throw new IllegalArgumentException("Montant negatif");
		}
		this.montant = m;
	}

	@Override
	public int compareTo(Devise arg0) {
		// TODO Auto-generated method stub
		return this.nom.compareTo(arg0.nom);
	}
	

	

}
