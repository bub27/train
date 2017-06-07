package train.vehicule;

public class Motrice extends Vehicule
{
	private double puissanceTraction;

        /*
	  poidsAVide : poids à vide de la motrice
	  nbRoues : nombre de roues de la motrice
	  puissanceTraction : puissance que la motrice peut tracter
        */
	public Motrice (double poidsAVide, int nbRoues, double puissanceTraction)
	{
		super(poidsAVide,nbRoues);
		this.puissanceTraction = puissanceTraction;
	}

	public double getPoidsEnChargeMaxi()
	{
		return poidsAVide;
	}

	public String toString()
	{
		return String.format ( "%-25s", "[Motrice " + puissanceTraction + " kW  " ) + super.toString() + " ]";
	}
}
