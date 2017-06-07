package train;

import train.vehicule.Vehicule;
import train.vehicule.Motrice;

import java.util.LinkedList;

public class Train
{
	private static String prochaineImmatriculation = "AAA";
	private String immatriculation;

	private LinkedList<Vehicule> lkVehicule;


	public Train()
	{
		immatriculation = prochaineImmatriculation;
		incrementerImmatriculation ();

		lkVehicule = new LinkedList<Vehicule>();
	}

	public double calculerPoidsEnChargeMaxi()
	{
		double charge=0;

		for ( Vehicule v : lkVehicule )
			charge += v.getPoidsEnChargeMaxi();



		return charge;
	}

        public int calculerNbRoues() {
	    int nbRoues = 0;
	    for (Vehicule v: lkVehicule) {
		nbRoues += v.getNbRoues();
	    }
	    return nbRoues;
	}

	public boolean ajouterVehicule(Vehicule v)
	{
		if ( lkVehicule.size() == 0 && ! (v instanceof Motrice) ||
		     lkVehicule.size() >  0 &&   (v instanceof Motrice)    )   return false;

		lkVehicule.add(v);

		return true;
	}


	public String toString()
	{
		String s="Train " + immatriculation
		    + " poids total en charge Maxi " + calculerPoidsEnChargeMaxi() + " t,"
		    + " avec " + calculerNbRoues() + " roues\n";

		for ( Vehicule v : lkVehicule )  s+= "   " + v + "\n";

		return s;

	}


	private static void incrementerImmatriculation()
	{
		int cpt;
		char car;
		String nvImmat ="";
		boolean bContinue = true;

		cpt = 1;

		while ( bContinue )
		{
			car = prochaineImmatriculation.charAt( prochaineImmatriculation.length() - cpt );
			if ( car == 'Z' )
			{
				car = 'A';
				cpt++;
			}
			else
			{
				car++;
				bContinue = false;
			}

			nvImmat = car + nvImmat ;

		}

		for (int i=0;i< prochaineImmatriculation.length() - cpt;i++)
		{
			nvImmat = prochaineImmatriculation.charAt(i) + nvImmat;
		}

		prochaineImmatriculation = nvImmat;

	}

}
