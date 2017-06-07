package train.vehicule;

public class Voiture extends Vehicule
{
	private int nbPlaces;

        /*
	  poidsAVide : poids à vide de la voiture
	  nbRoues : nombre de roues de la voiture
	  nbPlaces : nombre de places de la voiture
        */
	public Voiture (double poidsAVide, int nbRoues, int nbPlaces)
	{
		super(poidsAVide,nbRoues);
		this.nbPlaces = nbPlaces;
	}

	public double getPoidsEnChargeMaxi()
	{
		return poidsAVide + (0.082) * nbPlaces;
	}

	public String toString()
	{
		return String.format ( "%-25s", "[Voiture " + nbPlaces + " places  " ) + super.toString() + " ]";
	}
}
