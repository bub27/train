package train.vehicule;

public abstract class Vehicule
{
	protected double   poidsAVide;
	protected int      nbRoues;


        /*
	  poidsAVide : poids à vide d'un véhicule
	  nbRoues : nombre de roues d'un véhicule
        */
	public Vehicule ( double poidsAVide, int nbRoues)
	{
		this.poidsAVide = poidsAVide;
		this.nbRoues    = nbRoues;
	}

	public abstract double getPoidsEnChargeMaxi();


	public double getPoidsEnChargeMaxiParRoue()
	{
		return getPoidsEnChargeMaxi()/nbRoues;
	}

	public String toString()
	{
		return "( PV : "    + String.format ("%6.2f", poidsAVide ) + " t, " + String.format ("%2d",nbRoues) + " roues)";
	}
}
