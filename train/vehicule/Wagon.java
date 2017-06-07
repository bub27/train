package train.vehicule;

public class Wagon extends Vehicule
{
	private double capaciteCharge;

        /*
	  poidsAVide : poids à vide du wagon
	  nbRoues : nombre de roues du wagon
	  capaciteCharge : poids maxi des marchandises transportables par le wagon
        */
	public Wagon (double poidsAVide, int nbRoues, double capaciteCharge)
	{
		super(poidsAVide,nbRoues);
		this.capaciteCharge = capaciteCharge;
	}

	public double getPoidsEnChargeMaxi()
	{
		return poidsAVide + capaciteCharge;
	}

	public String toString()
	{
		return String.format ( "%-25s", "[Wagon   charge :" + capaciteCharge + " t " ) + super.toString() + " ]";
	}

}
